package com.example.pragyagoel.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {
    DatabaseHelper myDb;

    EditText FirstName;
    EditText LastName;
    EditText Email;
    EditText Password1;
    EditText Mobile;
    //EditText Password2;
    EditText Username;
    Button SignUpDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        myDb = new DatabaseHelper(this);

        FirstName=(EditText)findViewById(R.id.FirstName);
        LastName=(EditText)findViewById(R.id.LastName);
        Email=(EditText)findViewById(R.id.email);
        Password1=(EditText)findViewById(R.id.password1);
        Username=(EditText)findViewById(R.id.UserName);
        Mobile=(EditText)findViewById(R.id.Mobile);
        //Password2=(EditText)findViewById(R.id.password2);
        SignUpDone=(Button)findViewById(R.id.SignUpDone);

        SignUpDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstName.getText().toString().equals("") || LastName.getText().toString().equals("") ||
                        Email.getText().toString().equals("") || Password1.getText().toString().equals("") ||
                         Username.getText().toString().equals("") || Mobile.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"All fields required!",Toast.LENGTH_SHORT).show();
                }
//                if(!(Password1.getText().toString()==Password2.getText().toString())){
//                    Toast.makeText(getApplicationContext(),"Password don't match",Toast.LENGTH_SHORT).show();
//
//                }

                else{
                    AddData();

                    Toast.makeText(getApplicationContext(),"SignUp Done",Toast.LENGTH_SHORT).show();
                    Intent a = new Intent(SignUpPage.this, LoginPage.class);
                    startActivity(a);
                }

            }
        });

    }

    public void AddData(){

                        boolean isInserted = myDb.insertData(FirstName.getText().toString(), LastName.getText().toString(),
                                Username.getText().toString(), Mobile.getText().toString(),
                                Email.getText().toString(), Password1.getText().toString());
                        if(isInserted==true){
                            Toast.makeText(getApplicationContext(), "Data Inserted", Toast.LENGTH_LONG).show();
                        } else      {
                            Toast.makeText(getApplicationContext(), "Data not Inserted", Toast.LENGTH_LONG).show();

                        }
    }
}
