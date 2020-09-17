package com.example.android_co_ban_lt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Bundle b;
    EditText edt,edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, MyService2.class);
        b = new Bundle();
        b.putString("name","The Anh");
        b.putInt("age",20);

    }

    public void chay(View view) {
        edt = findViewById(R.id.edt);
        edt2 = findViewById(R.id.edt2);
        b.putString("edt2",edt2.getText().toString());
        b.putString("edt",edt.getText().toString());
        intent.putExtra("sv",b);
        startService(intent);
    }
        public void dung(View view){
            stopService(intent);
        }


}
