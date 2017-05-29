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
                String password = passIn.getText().toString();
                if (password.length() < 8) {
                    String rule1 = "length fail";
                    strengthOut.setText(rule1);
                } else if (password.equals("password")) {
                    String rule2 = "'password' is extremely weak, fail";
                    strengthOut.setText(rule2);
                } else if (password.equals("12345678")) {
                    String rule3 = "'12345678' is emtremely weak, fail";
                    strengthOut.setText(rule3);
                } else if (password.contains("@")||password.contains("!")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("&")||password.contains("*")||password.contains("^")) {
                    if(password.length()>12){
                        String rule4 = "Strong Password, all rules passed";
                        strengthOut.setText(rule4);
                    }
                    else {
                        String rule5 = "moderate strength";
                        strengthOut.setText(rule5);
                    }
                }
                    else if (password.equals(password.length()>12)) {
                        String rule6="intermediate password, special character fail";
                        strengthOut.setText(rule6);
                }
                else{
                    String rule7= "weak password, entended length and special character fail";
                }
                // rule 1: password not allowed, rule 2: length of 8+ required, rule 3: 12345678 not allowed, rule 4: special character required, rule 5: extended length of 12+ required for next tier password strength
            }
        });
    }
}
