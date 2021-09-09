package com.example.greekband;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class SplaishActivity extends Activity {
    public static final String TITLE = "title";
    public static final String USER_INFO = "userInfo";
    public static final int REQUEST_CODE = 9999;
    private static final String TAG = SplaishActivity.class.getSimpleName();
    private TextView mTextView;
    private Button mEnterButton;
    private Handler mHander = new Handler();
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
        // mEnterButton.setOnClickListener(mOnClickListener);

        mTextView = (TextView) findViewById(R.id.textview);
        final String  title = mTextView.getText().toString();
        mHander.postDelayed(new Runnable() {
            @Override
            public void run() {
                // 跳转MainActivity
                UserInfo mUserInfo = new UserInfo("小明",12);
                Intent intent = new Intent(SplaishActivity.this,MainActivity.class);
                intent.putExtra(TITLE,title);
                // 传送对象时必须序列化该对象,实现Serializable接口
                intent.putExtra(USER_INFO, mUserInfo);
                // startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        },1000);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG,"requestCode = " + requestCode + ",resultCode = " + resultCode);
    }
}