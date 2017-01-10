package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.csaper6.collegeapp.R;

public class AccountCreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creation);

        EditText emailField = (EditText) findViewById(R.id.new_email_text_field);
        EditText nameField = (EditText) findViewById(R.id.new_name_text_field);
        final EditText passwordField = (EditText) findViewById(R.id.new_password_field);
        final EditText confirmPasswordField = (EditText) findViewById(R.id.new_confirm_password_field);
        Button  createButton = (Button) findViewById(R.id.new_login_button);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = passwordField.getText().toString();
                String second = confirmPasswordField.getText().toString();
                if(! (first.equals(second)))
                {
                    Toast.makeText(AccountCreationActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(AccountCreationActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
