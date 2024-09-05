package com.example.calculadora_tutoria_mananas;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        Animation fadeIn = new AlphaAnimation(0.0f,1.0f);
        fadeIn.setDuration(3000);

        Animation fadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        Animation translation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translation_right);

        //Se obtiene el id de la imagen
        ImageView logo = findViewById(R.id.imgViewLogo);

        //logo.startAnimation(fadeIn);
        //logo.startAnimation(fadeOut);
        logo.startAnimation(translation);

        //líneas de código sirven para cambiar con un tienpo determinado de una ventana a otra
        logo.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}