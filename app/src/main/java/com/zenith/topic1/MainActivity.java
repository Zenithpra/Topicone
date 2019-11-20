package com.zenith.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etfirst, etsecond;
    RadioButton rdoAdd, rdoSub, rdoMul, rdoDiv;
    Button btnCal;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst = findViewById(R.id.first);
        etsecond = findViewById(R.id.second);

        rdoAdd = findViewById(R.id.rdoAdd);
        rdoSub = findViewById(R.id.rdoSub);
        rdoMul = findViewById(R.id.rdoMul);
        rdoDiv = findViewById(R.id.rdoDiv);
        btnCal = findViewById(R.id.btncal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second;

                first= Integer.parseInt(etfirst.getText().toString());
                second =Integer.parseInt(etsecond.getText().toString());

                if (rdoAdd.isChecked()){
                    result = first + second;
                }
                else if(rdoSub.isChecked()){
                    result = first - second;
                }
                else if (rdoMul.isChecked()){
                    result = first * second;
                }
                else if (rdoDiv.isChecked()){
                    result = first / second;
                }


                Toast.makeText(MainActivity.this, "The Result is "  + result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
