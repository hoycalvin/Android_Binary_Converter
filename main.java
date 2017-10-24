package calvinh.a3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiate new converter class, and buttons
        final NumberConverter nc = new NumberConverter();
        final Button binButton = (Button) findViewById(R.id.binButton);
        final Button decButton = (Button) findViewById(R.id.decButton);
        final Button hexButton = (Button) findViewById(R.id.hexButton);

        //Check if the Binary button has been clicked
        binButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //change button colors depending on one pressed
                binButton.setBackgroundColor(Color.GREEN);
                decButton.setBackgroundColor(Color.RED);
                hexButton.setBackgroundColor(Color.RED);

                //get the EditText textbar's id
                EditText edit =  (EditText) findViewById(R.id.userTextField);
                //convert the text in the edit text to String form
                String check = edit.getText().toString();
                //get the substring after the first occurence of case
                String str = check.substring(2);
                //initiate convertedString
                String convertedString = "";

                switch (check.substring(0, 2)){
                    //case of hexadecimal in textfield
                    case "h:":
                        edit.setBackgroundColor(Color.WHITE);
                        //call the conversion function of hexadec to binary
                        convertedString = nc.hexToBin(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        }else {
                            //else set edit textbar to new binary string
                            edit.setText("b:" + convertedString);
                        }
                        break;

                    //case of decimal in textfield
                    case "d:":
                        edit.setBackgroundColor(Color.WHITE);
                        //get the substring after the first occurence of d:
                        str = check.substring(2);
                        //call the conversion function of decimal to binary
                        convertedString = nc.decToBin(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        }else{
                            //else set edit textbar to new binary string
                            edit.setText("b:" + convertedString);
                        }
                        break;

                    //case of binary in textfield
                    case "b:":
                        edit.setBackgroundColor(Color.WHITE);
                        //get the substring after the first occurence of b:
                        str = check.substring(2);
                        //call the conversion function of binary to binary
                        convertedString = nc.binToBin(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        }else{
                            //else set edit textbar to new binary string
                            edit.setText("b:" + convertedString);
                        }
                        break;

                    //if anything else, then error
                    default:
                        edit.setBackgroundColor(Color.RED);
                        edit.setText("ERROR");
                        break;
                }
            }
        });

        //Check if the Decimal button has been clicked
        decButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //change button colors depending on one pressed
                decButton.setBackgroundColor(Color.GREEN);
                hexButton.setBackgroundColor(Color.RED);
                binButton.setBackgroundColor(Color.RED);

                //get the EditText textbar's id
                EditText edit =  (EditText) findViewById(R.id.userTextField);
                //convert the text in the edit text to String form
                String check = edit.getText().toString();
                //get the substring after the first occurence of case
                String str = check.substring(2);
                //initiate convertedString
                String convertedString = "";

                switch (check.substring(0, 2)) {
                    //case of a hexdec in textfield
                    case "h:":
                        edit.setBackgroundColor(Color.WHITE);
                        //call the conversion function of hexadec to decimal
                        convertedString = nc.hexToDec(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        } else {
                            //else set edit textbar to new binary string
                            edit.setText("d:" + convertedString);
                        }
                        break;

                    //case of a dec in textfield
                    case "d:":
                        edit.setBackgroundColor(Color.WHITE);
                        //get the substring after the first occurence of d:
                        str = check.substring(2);
                        //call the conversion function of decimal to decimal
                        convertedString = nc.decToDec(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        } else {
                            //else set edit textbar to new binary string
                            edit.setText("d:" + convertedString);
                        }
                        break;

                    //case of a binary in textfield
                    case "b:":
                        edit.setBackgroundColor(Color.WHITE);
                        //get the substring after the first occurence of b:
                        str = check.substring(2);
                        //call the conversion function of binary to Decimal
                        convertedString = nc.binToDec(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        } else {
                            //else set edit textbar to new binary string
                            edit.setText("d:" + convertedString);
                        }
                        break;

                    //if anything else, then error
                    default:
                        edit.setBackgroundColor(Color.RED);
                        edit.setText("ERROR");
                        break;
                }
            }
        });

        //Check if the Hexadec button has been clicked
        hexButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //change button colors depending on one pressed
                hexButton.setBackgroundColor(Color.GREEN);
                binButton.setBackgroundColor(Color.RED);
                decButton.setBackgroundColor(Color.RED);

                //get the EditText textbar's id
                EditText edit =  (EditText) findViewById(R.id.userTextField);
                //convert the text in the edit text to String form
                String check = edit.getText().toString();
                //get the substring after the first occurence of case
                String str = check.substring(2);
                //initiate convertedString
                String convertedString = "";

                switch (check.substring(0, 2)) {
                    //case of a hexdec in textfield
                    case "h:":
                        edit.setBackgroundColor(Color.WHITE);
                        //call the conversion function of hexadec to hexadec
                        convertedString = nc.hexToHex(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        } else {
                            //else set edit textbar to new binary string
                            edit.setText("h:" + convertedString);
                        }
                        break;

                    //case of a dec in textfield
                    case "d:":
                        edit.setBackgroundColor(Color.WHITE);
                        //get the substring after the first occurence of d:
                        str = check.substring(2);
                        //call the conversion function of decimal to hexadec
                        convertedString = nc.decToHex(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        } else {
                            //else set edit textbar to new binary string
                            edit.setText("h:" + convertedString);
                        }
                        break;

                    //case of a binary in textfield
                    case "b:":
                        edit.setBackgroundColor(Color.WHITE);
                        //get the substring after the first occurence of b:
                        str = check.substring(2);
                        //call the conversion function of binary to hexadec
                        convertedString = nc.binToHex(str);
                        //if function returns back an "ERROR" string
                        if (convertedString == "ERROR") {
                            //set textbar color to red
                            edit.setBackgroundColor(Color.RED);
                            //set the text in textbar to say "ERROR"
                            edit.setText("ERROR");
                        } else {
                            //else set edit textbar to new binary string
                            edit.setText("h:" + convertedString);
                        }
                        break;

                    //if anything else, then error
                    default:
                        edit.setBackgroundColor(Color.RED);
                        edit.setText("ERROR");
                        break;
                }
            }
        });

    }
}
