package com.example.add2num;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
EditText n1,n2,ans;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        ans=findViewById(R.id.ans);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new
                View.OnClickListener(){
                @Override
                public void onClick(View v){
                    int a=Integer.parseInt(n1.getText().toString());
                    int b=Integer.parseInt(n2.getText().toString());
                    int sum=a+b;
                    ans.setText(String.valueOf(sum));
                }
                });
    }
}
