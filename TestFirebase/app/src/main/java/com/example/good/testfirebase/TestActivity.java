package com.example.good.testfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.e( "Refreshed token: " , ""+refreshedToken);

        String user_id = FirebaseInstanceId.getInstance().getToken();
        TextView textView = (TextView) findViewById(R.id.TestActivity_TextView_test);
        textView.setText(refreshedToken);

    }
}
