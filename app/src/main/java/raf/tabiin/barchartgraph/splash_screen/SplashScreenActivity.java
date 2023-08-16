package raf.tabiin.barchartgraph.splash_screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import raf.tabiin.barchartgraph.MainActivity;
import raf.tabiin.barchartgraph.R;

public class SplashScreenActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView imageView = findViewById(R.id.progressScreen);
        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotate); // Замените "rotate" на название вашей анимации вращения
        rotation.setDuration(5000);
        rotation.setRepeatCount(Animation.INFINITE);
        imageView.startAnimation(rotation);
        imageView.startAnimation(rotation);

        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
            SplashScreenActivity.this.startActivity(mainIntent);
            SplashScreenActivity.this.finish();
        }, SPLASH_DISPLAY_LENGHT);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
