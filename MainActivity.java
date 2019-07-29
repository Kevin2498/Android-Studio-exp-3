package com.example.experiment3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String username="kevin.mathew";
    String password="123456";
    int n=0;
    public void validate(View view)
    {
        EditText t1=(EditText) findViewById(R.id.username);
        EditText t2=(EditText) findViewById(R.id.password);

        String name=t1.getText().toString();
        String pass=t2.getText().toString();

        if(name.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password))
        {
            Toast.makeText(MainActivity.this,"Verified",Toast.LENGTH_SHORT).show();
        }
        else if(n==3)
        {
            Toast.makeText(MainActivity.this,"You have exceeded maximum number of tries",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
            n++;
        }
    }
    public void reset(View view)
    {
        n=0;
        Toast.makeText(MainActivity.this,"Number of tries have been reset",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

