package com.example.android.recievers;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver receiver;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.etEdits);
    }

    public void send(View view) {
        Intent intent = new Intent();
        intent.setAction("com.Android");
        intent.putExtra("editor", editText.getText().toString());
        sendBroadcast(intent);
    }
}
