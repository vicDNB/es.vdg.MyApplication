package es.vdg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CICLOVIDA" , "onCreate");
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Log.d("CLICK", "BUTTON CLICKED");
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLOVIDA", "onStart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CICLOVIDA" , "onPause");
    }
}