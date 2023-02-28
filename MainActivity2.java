package es.vdg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("CICLOVIDA" , "onCreate");
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Log.d("CLICK" , "BUTTON CLICKED");

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