package com.example.lex.myfirstapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EDIT_TEXT_KEY = "EDIT_TEXT_KEY";
    private TextView tvSecondActivity;
    private Button btnSecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvSecondActivity=(TextView)findViewById(R.id.tvSecondActivity);
        btnSecondActivity=(Button)findViewById(R.id.btnSecondActivity);

        Bundle bundle=getIntent().getExtras();
        tvSecondActivity.setText(bundle.getString(EDIT_TEXT_KEY));
        btnSecondActivity.setOnClickListener(mOnSecondButtonClick);

    }

    private View.OnClickListener mOnSecondButtonClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };
}
