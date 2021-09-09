package com.example.greekband;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mClickCount = 0;
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_first:
                    Toast.makeText(MainActivity.this,"我被击中了",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_second:
                    startActivity(new Intent(MainActivity.this,SplaishActivity.class));
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_first).setOnClickListener(mOnClickListener);
        findViewById(R.id.button_second).setOnClickListener(mOnClickListener);
    }
}