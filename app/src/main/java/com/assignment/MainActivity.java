package com.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();

    private EditText mPwdEdtTxt, mLoginEdtTxt;
    Button mLoginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        // initialise layout file
        setContentView(R.layout.activity_main);
        initViews();

        // add onclick listener
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String loginid = mLoginEdtTxt.getText().toString();
                String pwd = mPwdEdtTxt.getText().toString();

                if (loginid.equals("prabhu")) {  // check id
                    if (pwd.equals("kumar")) {  // check password
                        Toast.makeText(MainActivity.this, "Credentials Match", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Password Mismatch", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "User ID Not Found Please SignUp first", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //  This method will initialise view
    private void initViews(){
        mLoginEdtTxt = (EditText) findViewById(R.id.userNameEdtTxt);
        mPwdEdtTxt = (EditText) findViewById(R.id.pwdEdtTxt);
        mLoginBtn = (Button) findViewById(R.id.loginBtn);

    }
}
