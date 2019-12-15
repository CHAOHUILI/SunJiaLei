package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private MySocketClient mySocketClient;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);
        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConnect();
            }
        });
        findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeConnect();
            }
        });
        findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
        init();
    }

    private void init() {
        URI uri = URI.create("ws://echo.websocket.org");
        mySocketClient = new MySocketClient(uri) {
            @Override
            public void onMessage(String message) {
                super.onMessage(message);
                Log.e("JWebSClientService", message);

            }
        };

    }

    private void send() {
        if (mySocketClient != null && mySocketClient.isOpen()) {
            mySocketClient.send(et.getText().toString());
        }
    }

    /**
     * 打开连接
     */
    private void openConnect() {

        try {
            if (mySocketClient != null) {
                if (mySocketClient.isClosed()) {
                    mySocketClient.connectBlocking();
                }
            } else {
                //如果client已为空，重新初始化websocket
                init();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 断开连接
     */
    private void closeConnect() {
        try {
            if (null != mySocketClient) {
                mySocketClient.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mySocketClient = null;
        }
    }
}
