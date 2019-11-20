package com.zenith.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ImageView extends AppCompatActivity implements View.OnClickListener{
    RadioButton rdokakashi, rdon, rdonauto;
    android.widget.ImageView imggrp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        rdokakashi = findViewById(R.id.rdo1);
        rdon = findViewById(R.id.rdo2);
        rdonauto = findViewById(R.id.rdo3);
        imggrp =findViewById(R.id.imggrp);

        rdokakashi.setOnClickListener(this);
        rdonauto.setOnClickListener(this);
        rdon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId())
       {
           case R.id.rdo1:
             imggrp.setImageResource(R.drawable.kakashi);
             break;

            case R.id.rdo2:
                imggrp.setImageResource(R.drawable.naruto);
                break;

            case R.id.rdo3:
                imggrp.setImageResource(R.drawable.n);
                break;
        }
    }
}
