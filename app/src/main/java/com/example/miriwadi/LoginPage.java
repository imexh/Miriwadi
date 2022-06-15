package com.example.miriwadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {
    EditText Username, Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Username = findViewById(R.id.editUsername);
        Password = findViewById(R.id.editPassword);
        Login = findViewById(R.id.loginbtn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();

                if (username.equals("admin") && password.equals("abcd"))
                {
                    Intent intent1 = new Intent(LoginPage.this, Homepage.class);
                    startActivity(intent1);
                }
                else
                {
                    Username.setError("Check your username or password!");
                    Password.setError("Check your username or password!");
                }
            }
        });
    }
}