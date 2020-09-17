package com.example.android_co_ban_lt1;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MyService extends Service {
    EditText edt;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("onCreate","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle b = intent.getBundleExtra("sv");
        int tuoi = b.getInt("age");
        String name = b.getString("name");
        String content = "Sinh Viên: "+name+" \n Tuổi: "+tuoi+" ";
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();



        Log.e("onStartCommand","onStartCommand" );

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("onUnbind","onUnbind");
        return super.onUnbind(intent);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","onDestroy");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.e("onBind","onBind");
        throw new UnsupportedOperationException("Not yet implemented");

    }
}
