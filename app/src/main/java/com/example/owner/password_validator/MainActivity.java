package com.example.owner.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView strengthOut;
    TextView passIn;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check= (Button)findViewById(R.id.button);
        passIn= (TextView) findViewById(R.id.password);
        strengthOut= (TextView) findViewById(R.id.strength);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password=passIn.getText().toString();
                if(password.length()<8){
                    strengthOut.setText("length fail");
                }
            }
        });
    }
}
