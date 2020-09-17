package com.example.android_co_ban_lt1;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService2 extends IntentService {
int count = 0;
String c;
    public MyService2() {
        super("MyService2");
    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Bundle b = intent.getBundleExtra("sv");
        String a = b.getString("edt");
        char[] chars = a.toCharArray();//biến chuỗi thành mảng ký tự
        c = b.getString("edt2");
        char[] chars1 = c.toCharArray();

        for(int i = 0; i<chars.length;i++) {
            for (int m = 0; m < chars1.length; m++) {
                if (chars[i] == chars1[m]) {
                    count++;
                }
            }
        }
        Toast.makeText(this,"Có "+count+" Kí Tự "+c,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Có "+count+" Kí Tự "+c,Toast.LENGTH_SHORT).show();
    }
}
