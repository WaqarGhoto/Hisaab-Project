package com.example.dell.hisaab;

import android.content.Intent;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    // Here Should be All Attributes
    private EditText email;
    private EditText password;
    private Button login_btn;
    private Button signup_btn;
    // How to get value from Spiner

    // Here is the the Menu bar
    private LinearLayout mDrawLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        login_btn=(Button)findViewById(R.id.loginButton);
        signup_btn=(Button)findViewById(R.id.signupButton);



        login_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Here Should be a check that Check weather the given Text fild are
                Toast.makeText(Login.this, "Login Successfull Wellcome to Profile", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Login.this,Profile.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
        signup_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Signup or Register Account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Login.this,Signup.class);
                startActivity(intent); // startActivity allow you to move

            }
        });


    }

}
