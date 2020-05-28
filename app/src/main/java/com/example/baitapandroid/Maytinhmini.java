package com.example.baitapandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Maytinhmini extends Activity implements View.OnClickListener {
    private Button btnDelete, btnChia, btnNhan, btnTru, btnCong, btnBang, btn0, btnCham, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private String strs1 = "";
    private String strs2 = "";
    private String strdau = "";
    private String strkq = "";
    private EditText edtHienthi;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maytinhmini);
        init();
        setClick();
    }

    private void setClick() {
        btnDelete.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }

    private void init() {
        edtHienthi = findViewById(R.id.edthienthi);
        btnDelete = findViewById(R.id.btndelete);
        btnChia = findViewById(R.id.btnchia);
        btnNhan = findViewById(R.id.btnnhan);
        btnTru = findViewById(R.id.btntru);
        btnCong = findViewById(R.id.btncong);
        btnBang = findViewById(R.id.btnbang);
        btn0 = findViewById(R.id.btn0);
        btnCham = findViewById(R.id.btncham);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btndelete: {
                strdau = strs1 = strs2 = strkq = "";
                edtHienthi.setText("");
                hienbtn();
                break;
            }
            case R.id.btnchia: {
                strdau += "÷";
                edtHienthi.setText(strs1 + strdau + strs2);
                break;
            }
            case R.id.btnnhan: {
                strdau += "x";
                edtHienthi.setText(strs1 + strdau + strs2);
                break;
            }
            case R.id.btntru: {
                strdau += "-";
                edtHienthi.setText(strs1 + strdau + strs2);
                break;
            }
            case R.id.btncong: {
                strdau += "+";
                edtHienthi.setText(strs1 + strdau + strs2);
                break;

            }
            case R.id.btnbang: {
                float s1, s2, kq;
                s1 = Float.parseFloat(strs1);
                s2 = Float.parseFloat(strs2);

                switch (strdau) {
                    case "+": {
                        kq = s1 + s2;
                        edtHienthi.setText("");
                        edtHienthi.setText(String.valueOf(kq));
                        strs1 = String.valueOf(kq);
                        break;
                    }
                    case "-": {
                        kq = s1 - s2;
                        edtHienthi.setText("");
                        edtHienthi.setText(String.valueOf(kq));
                        strs1 = String.valueOf(kq);
                        break;
                    }
                    case "x": {
                        kq = s1 * s2;
                        edtHienthi.setText("");
                        edtHienthi.setText(String.valueOf(kq));
                        strs1 = String.valueOf(kq);
                        break;
                    }
                    case "÷": {
                        if (s2 == 0) {
                            strdau = strkq = strs1 = strs2 = "";
                            edtHienthi.setText("");
                            Toast.makeText(Maytinhmini.this, "Khong the chia cho 0", Toast.LENGTH_SHORT).show();
                            break;
                        } else {
                            kq = s1 / s2;
                            edtHienthi.setText("");
                            edtHienthi.setText(String.valueOf(kq));
                            strs1 = String.valueOf(kq);
                            break;
                        }

                    }
                }


                strdau = strs2 = strkq = "";
                hienbtn();
                break;
            }
            case R.id.btn0: {
                if (strdau.equals("")) {
                    strs1 += "0";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "0";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btncham: {
                if(strdau.equals("")){
                    if (strs1.equals("")){
                        strs1+="0.";
                        edtHienthi.setText(strs1);
                        break;
                    }else {
                        strs1+=".";
                        edtHienthi.setText(strs1);
                        break;
                    }
                }else {
                    if (strs2.equals("")){
                        strs2+="0.";
                        edtHienthi.setText(strs1+strdau+strs2);
                        break;
                    }else {
                        strs2+=".";
                        edtHienthi.setText(strs1+strdau+strs2);
                        break;
                    }
                }
            }
            case R.id.btn1: {
                if (strdau.equals("")) {
                    strs1 += "1";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "1";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }

            }
            case R.id.btn2: {
                if (strdau.equals("")) {
                    strs1 += "2";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "2";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn3: {
                if (strdau.equals("")) {
                    strs1 += "3";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "3";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn4: {
                if (strdau.equals("")) {
                    strs1 += "4";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "4";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn5: {
                if (strdau.equals("")) {
                    strs1 += "5";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "5";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn6: {
                if (strdau.equals("")) {
                    strs1 += "6";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "6";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn7: {
                if (strdau.equals("")) {
                    strs1 += "7";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "7";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn8: {
                if (strdau.equals("")) {
                    strs1 += "8";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "8";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            case R.id.btn9: {
                if (strdau.equals("")) {
                    strs1 += "9";
                    edtHienthi.setText(strs1);
                    break;
                } else {
                    strs2 += "9";
                    edtHienthi.setText(strs1 + strdau + strs2);
                    anbtn();
                    break;
                }
            }
            default: {

            }
        }
    }

    private void anbtn() {
        btnCong.setEnabled(false);
        btnTru.setEnabled(false);
        btnNhan.setEnabled(false);
        btnChia.setEnabled(false);

    }

    private void hienbtn() {
        btnCong.setEnabled(true);
        btnTru.setEnabled(true);
        btnNhan.setEnabled(true);
        btnChia.setEnabled(true);

    }
}
