package com.example.maher.myfamily;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMyself,btnFather,btnMother;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMyself=findViewById(R.id.btn_myself);
        btnFather=findViewById(R.id.btn_father);
        btnMother=findViewById(R.id.btn_mother);


        btnMyself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MyselfActivity.class);
                startActivity(i);
            }
        });
        btnFather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FatherActivity.class);
                startActivity(i);

            }
        });
        btnMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MotherActivity.class);
                startActivity(i);
            }
        });

    }
}
