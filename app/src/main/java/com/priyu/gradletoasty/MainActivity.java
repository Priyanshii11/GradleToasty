package com.priyu.gradletoasty;


import android.os.Bundle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showtoast (View view){
        switch (view.getId ()){
            case R.id.error:
                Toasty.error(MainActivity.this,"this is an error button.",Toasty.LENGTH_SHORT,true).show();
                break;

            case R.id.success:
                Toasty.error(MainActivity.this,"this is an success button.",Toasty.LENGTH_SHORT,true).show();
                break;

            case R.id.info:
                Toasty.error(MainActivity.this,"this is info button.",Toasty.LENGTH_SHORT,true).show();
                break;

            case R.id.warning:
                Toasty.error(MainActivity.this,"warningg!!!!!.",Toasty.LENGTH_SHORT,true).show();
                break;

            case R.id.image:
                Toasty.normal(MainActivity.this, "Image",
                                Toast.LENGTH_SHORT,
                                ContextCompat.getDrawable(MainActivity.this,R.drawable.image))
                        .show();
                break;

        }

    }



}
