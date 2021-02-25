package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Log - Logcat 창에 로그 메시지를 보내기위한 클래스
        // Log.d -> 로그메시지를 필터링 하기위한 디버그 Log로 표시
        // Log.e -> 로그메시지를 필터링 하기위한 오류 Log로 표시
        // Log.w -> 로그메시지를 필터링 하기위한 경고 Log로 표시
        // Log.i -> 로그메시지를 필터링 하기위한 정보 Log로 표시
        Log.d("MainActivity","Hello World!!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}