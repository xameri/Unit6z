package com.example.xusenweli.cis_3334_unit_6x_mobile_farah;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerNamesNumbers;
    TextView tvDisplay;
    Button btn1Call;
    Button btn2Message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerNamesNumbers = (Spinner) findViewById(R.id.spinnerNamesNumbers);
        tvDisplay = (TextView) findViewById(R.id.textViewDisplay);
        setupButtonClickEvents3();
    }

    private void setupButtonClickEvents3() {

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Call = (Button) findViewById(R.id.button1Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                            if (spinnerNamesNumbers.getSelectedItemId() > 0) {
                                                long vSpinner = spinnerNamesNumbers.getSelectedItemId();

                                                if (vSpinner == 1) {


                                                    Uri number = Uri.parse("tel:7630000000");
                                                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

                                                    PackageManager packageManager = getPackageManager();
                                                    List activities = packageManager.queryIntentActivities(callIntent,
                                                            PackageManager.MATCH_DEFAULT_ONLY);


                                                    if (activities.size() > 0) {
                                                        startActivity(callIntent);
                                                    }

                                                } else if (vSpinner == 2) {

                                                    Uri number = Uri.parse("tel:9520000000");
                                                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

                                                    PackageManager packageManager = getPackageManager();
                                                    List activities = packageManager.queryIntentActivities(callIntent,
                                                            PackageManager.MATCH_DEFAULT_ONLY);


                                                    if (activities.size() > 0) {
                                                        startActivity(callIntent);
                                                    }

                                                } else if (vSpinner == 3) {

                                                    Uri number = Uri.parse("tel:6120000000");
                                                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

                                                    PackageManager packageManager = getPackageManager();
                                                    List activities = packageManager.queryIntentActivities(callIntent,
                                                            PackageManager.MATCH_DEFAULT_ONLY);

                                                    if (activities.size() > 0) {
                                                        startActivity(callIntent);
                                                    }

                                                } else {

                                                    tvDisplay.setText("You should select a name to call");
                                                }

                                            }
                                        }
        });



                /**
                 *   Set up button click event listener for the web info button for the first performance
                 */
                btn2Message = (Button) findViewById(R.id.button2Message);
        btn2Message.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                if (spinnerNamesNumbers.getSelectedItemId() > 0) {
                    long vSpinner = spinnerNamesNumbers.getSelectedItemId();

                    if (vSpinner == 1) {

                        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                        sendIntent.setData(Uri.parse("sms:7630000000"));
                        sendIntent.putExtra("sms_body", "Hi Moha");

                        PackageManager packageManager = getPackageManager();
                        List activities = packageManager.queryIntentActivities(sendIntent,
                                PackageManager.MATCH_DEFAULT_ONLY);

                        if (activities.size() > 0) {
                            startActivity(sendIntent);
                        }

                    } else if (vSpinner == 2) {


                        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                        sendIntent.setData(Uri.parse("sms:9520000000"));
                        sendIntent.putExtra("sms_body", "Hi Ali");

                        PackageManager packageManager = getPackageManager();
                        List activities = packageManager.queryIntentActivities(sendIntent,
                                PackageManager.MATCH_DEFAULT_ONLY);

                        if (activities.size() > 0) {
                            startActivity(sendIntent);
                        }

                    } else if (vSpinner == 3) {


                        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                        sendIntent.setData(Uri.parse("sms:6120000000"));
                        sendIntent.putExtra("sms_body", "Hi Jama");

                        PackageManager packageManager = getPackageManager();
                        List activities = packageManager.queryIntentActivities(sendIntent,
                                PackageManager.MATCH_DEFAULT_ONLY);

                        if (activities.size() > 0) {
                            startActivity(sendIntent);
                        }

                    } else {

                        tvDisplay.setText("You should select a name to call");
                    }
                }


                }
            });
        }


    }
