package com.example.greekband;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int RESULT_CODE = 1234;
    private int mClickCount = 0;
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_first:
                    setResult(RESULT_CODE);
                    finish();
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


        // 从SplashActivity 得到带有信息的intent

        Intent intent = getIntent();
        if (intent != null){
            String title = intent.getStringExtra(SplaishActivity.TITLE);
            // setTitle(title);
            UserInfo userInfo = (UserInfo)intent.getSerializableExtra(SplaishActivity.USER_INFO);
            setTitle("名字：" + userInfo.getmUserName() + " 年龄：" + userInfo.getmAge());
        }
    }
}