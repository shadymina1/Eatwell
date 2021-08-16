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

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    Animation animation;
    ImageView splashImg;
    TextView busName;
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this,MainActivity2.class);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){startActivity(i);}
            },4000);
        splashImg = findViewById(R.id.splashImg);
        busName = findViewById(R.id.busName);
        animation = AnimationUtils.loadAnimation(this, R.anim.anim2);
        splashImg.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(this, R.anim.anim3);
        busName.startAnimation(animation);
    }



    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}