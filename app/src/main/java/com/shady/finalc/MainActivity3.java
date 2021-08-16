package com.shady.finalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
int lavaQtt =0 , greenQtt=0, pumQtt=0;
String theReceipt , lavaIn = " " , greenIn= " ", pumIn= " ", total = " ";
TextView receipt , lavaQ,greenQ,pumQ;
    static {
        System.loadLibrary("native-lib");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lavaQ = findViewById(R.id.lavaQ);
        greenQ = findViewById(R.id.greenQ);
        pumQ = findViewById(R.id.pumQ);
        receipt = findViewById(R.id.receipt);


    }



    public void toPay (View v){
        if((lavaQtt+greenQtt+pumQtt)==0){
            Toast.makeText(this,"You didn't chose anything!",Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(this,MainActivity4.class);
            i.putExtra("key",theReceipt);
            startActivity(i);
        }
    }

    public void lavaAdd(View v){
        lavaQtt++;
        lavaInRec();
        Toast.makeText(this,good(),Toast.LENGTH_SHORT).show();
    }
    public void lavaMin(View v){
        if(lavaQtt>0){
            lavaQtt--;
            Toast.makeText(this,bad(),Toast.LENGTH_SHORT).show();
        }
        lavaInRec();
    }
    public void lavaInRec(){
        lavaQ.setText(String.valueOf(lavaQtt));
        if(lavaQtt>0){
            lavaIn = "\n 1- Lava Chips  X  "+ lavaQtt +"\n" + lavaQtt + " X 6.00$ = " + (lavaQtt*6)+".00";
        }else{
            lavaIn = " ";
        }
        setReceipt();
    }


    public void greenAdd(View v){
        greenQtt++;
        greenInRec();
        Toast.makeText(this,good(),Toast.LENGTH_SHORT).show();

    }
    public void greenMin(View v){
        if(greenQtt>0){
            greenQtt--;
            Toast.makeText(this,bad(),Toast.LENGTH_SHORT).show();
        }
        greenInRec();
    }
    public void greenInRec(){
        greenQ.setText(String.valueOf(greenQtt));
        if(greenQtt>0){
            greenIn = "\n \n 2- Green Salad  X  "+ greenQtt +"\n" + greenQtt + " X 7.00$ = " + (greenQtt*7)+".00";
        }else{
            greenIn = " ";
        }
        setReceipt();
    }

    public void pumAdd(View v){
        pumQtt++;
        pumInRec();
        Toast.makeText(this,good(),Toast.LENGTH_SHORT).show();
    }
    public void pumMin(View v){
        if(pumQtt>0){
            pumQtt--;
            Toast.makeText(this,bad(),Toast.LENGTH_SHORT).show();
        }
        pumInRec();
    }
    public void pumInRec(){
        pumQ.setText(String.valueOf(pumQtt));
        if(pumQtt>0){
            pumIn = "\n \n 3- Pum Salad X "+pumQtt +"\n" + pumQtt + " X 8.00$ = " + (pumQtt*8)+".00";
        }else{
            pumIn = " ";
        }
        setReceipt();
    }




public void setReceipt(){
    total = "Total = "+((lavaQtt * 6) + (greenQtt * 7) + (pumQtt*8) ) + " CAD$";
    theReceipt ="Your Order:\n"+lavaIn+greenIn+pumIn + "\n________________ \n \n"+total;
    receipt.setText(theReceipt);
}



    public native String bad();
    public native String good();
}