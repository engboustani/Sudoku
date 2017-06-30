package com.azad.sudoku;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.trivialdrivesample.util.IabHelper;
import com.example.android.trivialdrivesample.util.IabResult;
import com.example.android.trivialdrivesample.util.Inventory;
import com.example.android.trivialdrivesample.util.Purchase;

public class MainActivity extends AppCompatActivity {

    // Debug tag, for logging
    static final String TAG = "Esfandune.ir";

    // SKUs for our products: the premium upgrade (non-consumable)
    static final String SKU_PREMIUM = "sku_azad";

    // Does the user have the premium upgrade?
    boolean mIsPremium = false;

    // (arbitrary) request code for the purchase flow
    static final int RC_REQUEST = 1372;

    // The helper object
    IabHelper mHelper;
    IabHelper.OnIabPurchaseFinishedListener mPurchaseFinishedListener;
    IabHelper.QueryInventoryFinishedListener mGotInventoryListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String base64EncodedPublicKey = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwCh5k3YD29csjGa/P3CGrGPrKltyLsCPv0vRbFMlbFh0zhRKXN1rrZqKKc8NSpXaLE2Gszxob3CyiOrVEAvihXku8FP2upBhqQakehjapgS8hJGe8NvDeDZrWRY613XhPgpxID3M0taizX1nzqodBk9CkWqllBwxXSXhc/ApYspx6GPBwQEj1YuKK68W6P0jKrRbk/4kJEfmt9mlyeu/3xQ5uf9o296Agyg0pmLX18CAwEAAQ==";

        mHelper = new IabHelper(this, base64EncodedPublicKey);


        mGotInventoryListener = new IabHelper.QueryInventoryFinishedListener() {
            public void onQueryInventoryFinished(IabResult result, Inventory inventory) {
                Log.d(TAG, "Query inventory finished.");
                if (result.isFailure()) {
                    Log.d(TAG, "Failed to query inventory: " + result);
                    return;
                }
                else {
                    Log.d(TAG, "Query inventory was successful.");
                    // does the user have the premium upgrade?
                    mIsPremium = inventory.hasPurchase(SKU_PREMIUM);
                    if (mIsPremium){
                        MasrafSeke(inventory.getPurchase(SKU_PREMIUM));
                    }
                    // update UI accordingly

                    Log.d(TAG, "User is " + (mIsPremium ? "PREMIUM" : "NOT PREMIUM"));
                }

                Log.d(TAG, "Initial inventory query finished; enabling main UI.");
            }
        };

        mPurchaseFinishedListener = new IabHelper.OnIabPurchaseFinishedListener() {
            public void onIabPurchaseFinished(IabResult result, Purchase purchase) {
                if (result.isFailure()) {
                    Log.d(TAG, "Error purchasing: " + result);
                    return;
                }
                else if (purchase.getSku().equals(SKU_PREMIUM)) {
                    // give user access to premium content and update the UI
                    Toast.makeText(MainActivity.this,"خرید موفق", Toast.LENGTH_SHORT).show();
                    MasrafSeke(purchase);

                }
            }
        };


        Log.d(TAG, "Starting setup.");
        mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
            public void onIabSetupFinished(IabResult result) {
                Log.d(TAG, "Setup finished.");

                if (!result.isSuccess()) {
                    // Oh noes, there was a problem.
                    Log.d(TAG, "Problem setting up In-app Billing: " + result);
                }
                // Hooray, IAB is fully set up!
                mHelper.queryInventoryAsync(mGotInventoryListener);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult(" + requestCode + "," + resultCode + "," + data);

        // Pass on the activity result to the helper for handling
        if (!mHelper.handleActivityResult(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        } else {
            Log.d(TAG, "onActivityResult handled by IABUtil.");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mHelper != null) mHelper.dispose();
        mHelper = null;
    }

    private void MasrafSeke(Purchase kala) {
        // برای اینکه کاربر فقط یکبار بتواند از کالای فروشی استفاده کند
        // باید بعد از خرید آن کالا را مصرف کنیم
        // در غیر اینصورت کاربر با یکبار خرید محصول می تواند چندبار از آن استفاده کند
        mHelper.consumeAsync(kala, new IabHelper.OnConsumeFinishedListener() {
            @Override
            public void onConsumeFinished(Purchase purchase, IabResult result) {
                if (result.isSuccess())
                    Toast.makeText(MainActivity.this, "مصرف شد", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "NATIJE masraf: " + result.getMessage() + result.getResponse());

            }
        });
    }

    public void PlayButton(View view)
    {
        boolean purchase = true;
        if(!purchase)
        {
            Intent i = new Intent(this,EasyLevel.class);
            startActivity(i);
        }
        else
        {
            showRadioButtonDialog();
        }
    }

    public void HelpButton(View view)
    {
        Intent i = new Intent(this,Help.class);
        startActivity(i);
    }

    public void AboutButton(View view)
    {
        Intent i = new Intent(this,AboutUS.class);
        startActivity(i);
    }

    public void ScoreButton(View view)
    {

    }

    public void BuyButton(View view)
    {
        mHelper.launchPurchaseFlow(this, SKU_PREMIUM, RC_REQUEST, mPurchaseFinishedListener, "payload-string");
    }

    private void showRadioButtonDialog() {

        // custom dialog
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.select_level);
        dialog.setTitle("Select your level");
        final RadioGroup rg = (RadioGroup) dialog.findViewById(R.id.SelectRadioGroup);
        Button bt = (Button)dialog.findViewById(R.id.SelectButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    switch (rg.getCheckedRadioButtonId())
                    {
                        case R.id.EasyRadio:
                            Intent i = new Intent(getApplicationContext(),EasyMidActivity.class);
                            startActivity(i);
                            dialog.cancel();
                            break;
                        case R.id.NormalRadio:
                            i = new Intent(getApplicationContext(),NormalMidActivity.class);
                            startActivity(i);
                            dialog.cancel();
                            break;
                        case R.id.HardRadio:
                            i = new Intent(getApplicationContext(),HardMidActivity.class);
                            startActivity(i);
                            dialog.cancel();
                            break;
                    }

            }
        });
        dialog.show();

    }


}
