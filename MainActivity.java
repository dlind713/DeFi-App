package com.DeFi.defiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        Password = (EditText) findViewById(R.id.editTextTextPassword2);
        Login = (Button) findViewById(R.id.button2);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

        private void validate(String userName, String userPassword) {
            if((userName.equals("danny.lindsey@student.ashford.edu")) && (userPassword.equals("12345"))){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
        }

    }
}
