package com.example.greekband;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int RESULT_CODE = 1234;
    private static final String TAG = MainActivity.class.getSimpleName();
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
        Log.i(TAG,"onCreate");
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

        EditText editText = (EditText)findViewById(R.id.editTextTime);
        editText.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // 长按时间 空间都有的事件监听
                return false;
            }
        });

        // EditText特有的事件监听
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }
}