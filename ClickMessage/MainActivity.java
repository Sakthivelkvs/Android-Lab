package com.example.toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t_view;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        final TextView t_view=findViewById(R.id.t_view);
        btn.setOnClickListener(new
                View.OnClickListener(){
            public void onClick(View v){
                t_view.setText("You Clicked Meee");
            }
        });

    }
}
