package com.example.prac72;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.etext1);
        t2=findViewById(R.id.etext2);
        t3=findViewById(R.id.etext3);
    }
    public void Submit(View v){
        String str="";
        if(t1.getText().toString().equals("")||t2.getText().toString().equals("")||t3.getText().toString().equals("")){
            str="Fill all the text fields !!!";
        }
        else{
            str="Data Submitted Successfuly";
        }
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}