package com.shady.finalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Animation animation;
    Button saladsHome, mainHome , dessertHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        saladsHome = findViewById(R.id.saladsHome);
        animation = AnimationUtils.loadAnimation(this, R.anim.anim1);
        saladsHome.startAnimation(animation);
    }

    public void toSalads (View v){
        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);
    }

}