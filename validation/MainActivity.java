package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
EditText editText;
CheckBox checkBox;
RadioGroup rg;
RadioButton rb1,rb2,rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn=findViewById(R.id.button);
         editText=findViewById(R.id.editText);
         checkBox=findViewById(R.id.checkBox);
         rg=findViewById(R.id.radioGroup);
         rb1=findViewById(R.id.radioButton);
         rb2=findViewById(R.id.radioButton2);
         rb3=findViewById(R.id.radioButton3);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText.getText().toString();
                if(name.isEmpty()){
                    editText.setError("Field Cannot be Empty!!");
                    return;
                }
                if(!checkBox.isChecked()){
                    Toast.makeText(MainActivity.this,"Plesae Agree the terms and Conditions",Toast.LENGTH_SHORT).show();
                    return;

                }
                if(rg.getCheckedRadioButtonId()==-1){
                    Toast.makeText(MainActivity.this,"Plesae Select Gender",Toast.LENGTH_SHORT).show();
                    return;

                }
                Toast.makeText(MainActivity.this,"Validation Succesfull",Toast.LENGTH_SHORT).show();}

        });

    }
}
