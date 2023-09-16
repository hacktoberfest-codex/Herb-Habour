package harish.projects.greenharbour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.database.core.view.View;

public class Dashboard extends AppCompatActivity {

    Button scan, profile, addHerbs, buy, games, community, website, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        scan = findViewById(R.id.scan_btn);
        profile = findViewById(R.id.profile_btn);
        addHerbs = findViewById(R.id.herbs_btn);
        buy = findViewById(R.id.buy_btn);
        games = findViewById(R.id.games_btn);
        community = findViewById(R.id.community_btn);
        website = findViewById(R.id.website_btn);
        logout = findViewById(R.id.logout_btn);

        scan.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getApplicationContext(), Scanner.class);
                startActivity(intent);
                finish();

            }
        });

        profile.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getApplicationContext(), UserProfile.class);
                startActivity(intent);
                finish();

            }
        });


        addHerbs.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getApplicationContext(), UploadPlant.class);
                startActivity(intent);
                finish();

            }
        });



    }




}