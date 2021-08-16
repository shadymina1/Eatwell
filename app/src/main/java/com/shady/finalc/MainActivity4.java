package com.shady.finalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    String theReceipt;
    TextView receipt2 , result;
    ImageButton gmbl;
    static {
        System.loadLibrary("native-lib");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             theReceipt = extras.getString("key");
        }
        receipt2 = findViewById(R.id.receipt2);
        receipt2.setText(theReceipt);
        gmbl= findViewById(R.id.gmbl);
        result = findViewById(R.id.result);
    }
    public void toSalads (View v){
        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);
    }
public void chance(View v){
    result.setText(spin());
    gmbl.setVisibility(View.GONE);

}



    public native String spin();

}