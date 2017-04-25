package com.example.android.chuckburgerbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Facebook page linked to the string.
        TextView facebook = (TextView) findViewById(R.id.facebook);
        facebook.setMovementMethod(LinkMovementMethod.getInstance());

        //Google maps direction linked to the address string.
        TextView address = (TextView) findViewById(R.id.address);
        address.setMovementMethod(LinkMovementMethod.getInstance());

    }
}

