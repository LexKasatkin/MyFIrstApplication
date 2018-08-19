package com.example.lex.myfirstapplication;

import android.content.Intent;
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

        etLogin=(EditText)findViewById(R.id.etLogin);
        btnEnter=(Button)findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(mOnBtnEnterClickListener);
    }

    View.OnClickListener mOnBtnEnterClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!TextUtils.isEmpty(etLogin.getText())){
                Toast.makeText(getApplicationContext(), etLogin.getText(), Toast.LENGTH_LONG).show();
                Intent startSecondIntent =
                        new Intent(InputActivity.this, SecondActivity.class);
                startSecondIntent.putExtra(SecondActivity.EDIT_TEXT_KEY, etLogin.getText().toString());
                startActivity(startSecondIntent);
            }
        }
    };
}
