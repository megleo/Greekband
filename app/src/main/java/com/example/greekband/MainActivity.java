package com.example.greekband;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mClickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickCount++;
                Toast.makeText(MainActivity.this,"啊，我被击中了" + mClickCount + "次",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}