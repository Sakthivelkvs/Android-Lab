package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText n1,n2,ans;
Button add,sub,mult,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        ans=findViewById(R.id.ans);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mult=findViewById(R.id.mult);
        div=findViewById(R.id.div);
        add.setOnClickListener(new
                                       View.OnClickListener(){
                                           @Override
                                           public void onClick(View v){
                                               int a=Integer.parseInt(n1.getText().toString());
                                               int b=Integer.parseInt(n2.getText().toString());
                                               int sum=a+b;
                                               ans.setText(String.valueOf(sum));
                                           }
                                       });
        sub.setOnClickListener(new
                                       View.OnClickListener(){
                                           @Override
                                           public void onClick(View v){
                                               int a=Integer.parseInt(n1.getText().toString());
                                               int b=Integer.parseInt(n2.getText().toString());
                                               int diff=a-b;
                                               ans.setText(String.valueOf(diff));
                                           }
                                       });

        mult.setOnClickListener(new
                                       View.OnClickListener(){
                                           @Override
                                           public void onClick(View v){
                                               int a=Integer.parseInt(n1.getText().toString());
                                               int b=Integer.parseInt(n2.getText().toString());
                                               int pro=a*b;
                                               ans.setText(String.valueOf(pro));
                                           }
                                       });

        div.setOnClickListener(new
                                        View.OnClickListener(){
                                            @Override
                                            public void onClick(View v){
                                                int a=Integer.parseInt(n1.getText().toString());
                                                int b=Integer.parseInt(n2.getText().toString());
                                                int divi=a/b;
                                                ans.setText(String.valueOf(divi));
                                            }
                                        });

    }
}
