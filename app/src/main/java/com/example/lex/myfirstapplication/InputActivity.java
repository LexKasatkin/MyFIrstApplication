package com.example.lex.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    private EditText etLogin;
    private Button btnEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        etLogin=(EditText)findViewById(R.id.et_login);
        btnEnter=(Button)findViewById(R.id.btn_enter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(etLogin.getText())){
                    Toast.makeText(getApplicationContext(), etLogin.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
