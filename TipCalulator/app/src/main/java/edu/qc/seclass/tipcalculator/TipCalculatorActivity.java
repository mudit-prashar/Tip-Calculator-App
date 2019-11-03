//  CSCI 370 ANDROID APP PROJECT: TIP CALCULATOR
//  MUDIT PRASHAR



package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TipCalculatorActivity extends AppCompatActivity {

    private EditText checkAmountValue;
    private EditText partySizeValue;
    private EditText fifteenPercentTipValue;
    private EditText fifteenPercentTotalValue;
    private EditText twentyPercentTipValue;
    private EditText twentyPercentTotalValue;
    private EditText twentyfivePercentTipValue;
    private EditText twentyfivePercentTotalValue;

    private double checkAmount =0;
    private int partySize = 0;
    private int oneFiveTip =0;
    private int oneFiveTotal =0;
    private int twoZeroTip =0;
    private int twoZeroTotal =0;
    private int twoFiveTip =0;
    private int twoFiveTotal =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        Button buttonCompute = (Button) findViewById(R.id.buttonCompute);
        buttonCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAmountValue = (EditText) findViewById(R.id.checkAmountValue);
                partySizeValue = (EditText) findViewById(R.id.partySizeValue);
                fifteenPercentTipValue = (EditText) findViewById(R.id.fifteenPercentTipValue);
                fifteenPercentTotalValue = (EditText) findViewById(R.id.fifteenPercentTotalValue);
                twentyPercentTipValue = (EditText) findViewById(R.id.twentyPercentTipValue);
                twentyPercentTotalValue = (EditText) findViewById(R.id.twentyPercentTotalValue);
                twentyfivePercentTipValue = (EditText) findViewById(R.id.twentyfivePercentTipValue);
                twentyfivePercentTotalValue = (EditText) findViewById(R.id.twentyfivePercentTotalValue);

                if(checkAmountValue.getText().toString().equals("")  || checkAmountValue.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Check Amount field Should be filled.", Toast.LENGTH_LONG).show();
                    return;
                }
                if(partySizeValue.getText().toString().equals("")  || partySizeValue.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Party Size field Should be filled.", Toast.LENGTH_LONG).show();
                    return;
                }

                checkAmount = Double.parseDouble(checkAmountValue.getText().toString());
                partySize = Integer.parseInt(partySizeValue.getText().toString());

                oneFiveTip = (int) Math.round((checkAmount/partySize)* .15);
                fifteenPercentTipValue.setText(" " + oneFiveTip);

                twoZeroTip = (int) Math.round((checkAmount/partySize)* .20);
                twentyPercentTipValue.setText(" " + twoZeroTip);

                twoFiveTip = (int) Math.round((checkAmount/partySize)* .25);
                twentyfivePercentTipValue.setText(" " + twoFiveTip);

                oneFiveTotal = (int) Math.round((checkAmount/partySize) + oneFiveTip);
                fifteenPercentTotalValue.setText(" " + oneFiveTotal);

                twoZeroTotal = (int) Math.round((checkAmount/partySize) + twoZeroTip);
                twentyPercentTotalValue.setText(" " + twoZeroTotal);

                twoFiveTotal = (int) Math.round((checkAmount/partySize) + twoFiveTip);
                twentyfivePercentTotalValue.setText(" " + twoFiveTotal);


            }
        });








        final EditText fifteenPercentTipValue =  findViewById(R.id.fifteenPercentTipValue);
        final EditText fifteenPercentTotalValue =  findViewById(R.id.fifteenPercentTotalValue);
        final EditText twentyPercentTipValue =  findViewById(R.id.twentyPercentTipValue);
        final EditText twentyPercentTotalValue =  findViewById(R.id.twentyPercentTotalValue);
        final EditText twentyfivePercentTipValue =  findViewById(R.id.twentyfivePercentTipValue);
        final EditText twentyfivePercentTotalValue =  findViewById(R.id.twentyfivePercentTotalValue);

        fifteenPercentTipValue.setInputType(InputType.TYPE_NULL);
        fifteenPercentTipValue.setKeyListener(null);

        fifteenPercentTotalValue.setInputType(InputType.TYPE_NULL);
        fifteenPercentTotalValue.setKeyListener(null);

        twentyPercentTipValue.setInputType(InputType.TYPE_NULL);
        twentyPercentTipValue.setKeyListener(null);

        twentyPercentTotalValue.setInputType(InputType.TYPE_NULL);
        twentyPercentTotalValue.setKeyListener(null);

        twentyfivePercentTipValue.setInputType(InputType.TYPE_NULL);
        twentyfivePercentTipValue.setKeyListener(null);

        twentyfivePercentTotalValue.setInputType(InputType.TYPE_NULL);
        twentyfivePercentTotalValue.setKeyListener(null);

    }
}
