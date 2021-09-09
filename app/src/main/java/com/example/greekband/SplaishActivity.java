package com.example.greekband;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplaishActivity extends Activity {
    private Button mEnterButton;
    // 接收点击事件对象
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                // android程序中所有的资源，编辑器都会把资源放在一个R文件中
                // R文件会把所有的资源放在一个静态文件中
                case R.id.button:
                    Intent intent = new Intent(SplaishActivity.this,MainActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splaish);
        mEnterButton = (Button) findViewById(R.id.button);
        mEnterButton.setOnClickListener(mOnClickListener);
    }
}