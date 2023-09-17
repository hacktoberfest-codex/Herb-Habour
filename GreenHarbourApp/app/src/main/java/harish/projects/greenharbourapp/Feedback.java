package harish.projects.greenharbour;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {


    EditText likemost, suggestions, featuresadded, lastcomments;

    DatabaseReference db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        likemost = findViewById(R.id.like);
        suggestions = findViewById(R.id.suggest);
        featuresadded = findViewById(R.id.features);
        lastcomments = findViewById(R.id.comment);
        db = FirebaseDatabase.getInstance("https://feedback-1d100-default-rtdb.firebaseio.com/").getReference();
    }

    public void addUser(View view) {
        if (likemost.getText().toString().length() > 0
                && suggestions.getText().toString().length() > 0
                && featuresadded.getText().toString().length() > 0
                && lastcomments.getText().toString().length() > 0) {
            CustomUserData userData = new CustomUserData(
                    likemost.getText().toString(),
                    suggestions.getText().toString(),
                    featuresadded.getText().toString(),
                    lastcomments.getText().toString()
            );


            db.child("UserData")
                    .child(likemost.getText().toString())
                    .setValue(userData)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(Feedback.this, "Feedback SEnd Successfully", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Feedback.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    });

        }
        else {
            Toast.makeText(this, "Invalid Data", Toast.LENGTH_SHORT).show();
        }
    }
}