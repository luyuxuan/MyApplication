package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAction = findViewById(R.id.fir);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //定义Intent对象
                Intent intent = new Intent();
                //设置Action
                intent.setAction("net.onest.activitys");
                //启动Activity
                startActivity(intent);
            }
        });
        Button btnAction1 = findViewById(R.id.sec);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //定义Intent对象
                Intent intent = new Intent();
                //设置Action
                intent.setAction("net.onest.activitys");
                //启动Activity
                startActivity(intent);
            }
        });
    }
}