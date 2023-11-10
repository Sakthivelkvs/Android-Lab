package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText un_edit;
    EditText pwd_edit;
    Button btn;
    TextView username;
    TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un_edit=(EditText) findViewById(R.id.un_edit);
        pwd_edit=(EditText) findViewById(R.id.pwd_edit);
        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                if(un_edit.getText().toString().equals("admin")&&pwd_edit.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Login Succesfull",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"INVALID!!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
