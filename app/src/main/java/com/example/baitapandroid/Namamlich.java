package com.example.baitapandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Namamlich extends AppCompatActivity {
    Button btnChuyen;
    EditText edtNamduong;
    TextView txvNamam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namamlich);
        btnChuyen=findViewById(R.id.btnchuyen);
        edtNamduong=findViewById(R.id.edtnamduong);
        txvNamam=findViewById(R.id.txvNamam);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n= Integer.parseInt(edtNamduong.getText().toString());
                if(n<1900){
                    Toast.makeText(Namamlich.this,"Nhập năm lớn hơn 1900",Toast.LENGTH_SHORT).show();
                }else {
                    String can,chi;
                    switch (n%10){
                        case 0:{
                            can="Canh";
                            break;
                        }
                        case 1:{
                            can="Tân";
                            break;
                        }
                        case 2:{
                            can="Nhâm";
                            break;
                        }
                        case 3:{
                            can="Quý";
                            break;
                        }
                        case 4:{
                            can="Giáp";
                            break;
                        }
                        case 5:{
                            can="Ất";
                            break;
                        }
                        case 6:{
                            can="Bính";
                            break;
                        }
                        case 7:{
                            can="Đinh";
                            break;
                        }
                        case 8:{
                            can="Mậu";
                            break;
                        }
                        case 9:{
                            can="Kỷ";
                            break;
                        }
                        default:{
                            can="adasd";
                        }
                    }

                    switch (n%12){
                        case 0:{
                            chi="Thân";
                            break;
                        }
                        case 1:{
                            chi="Dậu";
                            break;
                        }
                        case 2:{
                            chi="Tuất";
                            break;
                        }
                        case 3:{
                            chi="Hợi";
                            break;
                        }
                        case 4:{
                            chi="Tý";
                            break;
                        }
                        case 5:{
                            chi="Sửu";
                            break;
                        }
                        case 6:{
                            chi="Dần";
                            break;
                        }
                        case 7:{
                            chi="Mẹo";
                            break;
                        }
                        case 8:{
                            chi="Thìn";
                            break;
                        }
                        case 9:{
                            chi="Tỵ";
                            break;
                        }
                        case 10:{
                            chi="Ngọ";
                            break;
                        }
                        case 11:{
                            chi="Mùi";
                            break;
                        }
                        default:{
                            chi="adasd";
                        }
                    }
                    String namam=can+" "+chi;
                    txvNamam.setText(namam);
                }
            }
        });
    }
}
