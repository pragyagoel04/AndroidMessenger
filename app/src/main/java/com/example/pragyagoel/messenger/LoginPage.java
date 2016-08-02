package com.example.pragyagoel.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button LoginBtn;
    EditText username;
    EditText psw;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        //instantiate widgets
        SignUp=(Button)findViewById(R.id.SignUp);
        LoginBtn=(Button)findViewById(R.id.LogInBtn);
        username=(EditText)findViewById(R.id.userid);
        psw=(EditText)findViewById(R.id.psw);



        SignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent b=new Intent(LoginPage.this, SignUpPage.class);
                startActivity(b);
            }
        });

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=username.getText().toString();
                String password=psw.getText().toString();


                if(uname.equals("") || password.equals("") ) {
                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }
                else if(uname.equals())

                else{
                    Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_SHORT).show();

                }




            }
        });

    }
//    public void Call(View view){
//        Intent a = new Intent(LoginPage.this,SuccessPage.class);
//        startActivity(a);
//
//
//    }
}
