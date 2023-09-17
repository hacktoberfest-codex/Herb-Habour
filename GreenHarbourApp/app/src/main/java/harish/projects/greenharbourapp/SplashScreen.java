package harish.projects.greenharbourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;
    TextView appName;
    TextView poweredby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);
        poweredby = findViewById(R.id.poweredby);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        },  3000);




    }
}
