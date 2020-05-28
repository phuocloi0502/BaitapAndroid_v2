package com.example.baitapandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Doinhietdo extends AppCompatActivity {
    Button btnDoc, btnDof, btnXoa;
    EditText edtDoc, edtDof;
    float doc,dof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doinhietdo);
        btnDoc=findViewById(R.id.btndoc);
        btnDof=findViewById(R.id.btndof);
        btnXoa=findViewById(R.id.btnxoa);
        edtDoc=findViewById(R.id.edtdoc);
        edtDof=findViewById(R.id.edtdof);
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dof=Float.parseFloat(edtDof.getText().toString());
                float other= (float) (5/9.0);
                edtDoc.setText(String.valueOf((dof-32)*other));
            }
        });

        btnDof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doc=Float.parseFloat(edtDoc.getText().toString());
                float other= (float) (9/5.0);
                edtDof.setText(String.valueOf(doc*(other)+32));
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDof.setText("");
                edtDoc.setText("");
            }
        });


    }
}
