package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;
public class MainActivity extends AppCompatActivity {
    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;
    private Button btnKq;
    private Button btnClear;
    private Button btnN1;
    private Button btnN2;
    private Button btnN3;
    private Button btnN4;
    private Button btnN5;
    private Button btnN6;
    private Button btnN7;
    private Button btnN8;
    private Button btnN9;
    private Button btnN0;
    private Button btndot;
    private TextView txtCalculator;
    private EditText editText;
    private float a,b;
    private String cal="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitWidget();

        editText.setText("");

        btnN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                txtCalculator.setText(currentText + "0");
                editText.setText("0");
            }
        });
        btnN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = editText.getText().toString();

                txtCalculator.setText(currentText + "1");
                editText.setText(currentTextt+"1");
            }
        });
        btnN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = editText.getText().toString();

                txtCalculator.setText(currentText + "2");
                editText.setText(currentTextt+"2");
            }
        });
        btnN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "3");
                editText.setText(currentTextt+"3");
            }
        });
        btnN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "4");
                editText.setText(currentTextt+"4");
            }
        });
        btnN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "5");
                editText.setText(currentTextt+"5");
            }
        });
        btnN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "6");
                editText.setText(currentTextt+"6");
            }
        });
        btnN7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "7");
                editText.setText(currentTextt+"7");
            }
        });
        btnN8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "8");
                editText.setText(currentTextt+"8");
            }
        });
        btnN9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + "9");
                editText.setText(currentTextt+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = txtCalculator.getText().toString();
                String currentTextt = txtCalculator.getText().toString();

                txtCalculator.setText(currentText + ".");
                editText.setText(currentTextt+".");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cal=="")
                {
                    txtCalculator.setText(editText.getText().toString() + "+");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="+";
                    editText.setText("");
                }
                else {
                    // Khởi tạo biến để lưu tổng
                    float kq=a;
                    b=Float.parseFloat(editText.getText().toString());
                    if(cal == "+")
                    {
                        kq=kq+b;
                    }
                    else if(cal=="-")
                    {
                        kq=kq-b;
                    }
                    else if(cal=="*")
                    {
                        kq=kq*b;
                    }
                    else if(cal=="/")
                    {
                        kq=kq/b;
                    }
                    editText.setText(Float.toString(kq));
                    txtCalculator.setText(editText.getText().toString() + "+");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="+";
                    editText.setText("");
                }

            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cal=="")
                {
                    txtCalculator.setText(editText.getText().toString() + "-");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="-";
                    editText.setText("");

                }
                else {
                    // Khởi tạo biến để lưu tổng
                    float kq=a;
                    b=Float.parseFloat(editText.getText().toString());
                    if(cal == "+")
                    {
                        kq=kq+b;
                    }
                    else if(cal=="-")
                    {
                        kq=kq-b;
                    }
                    else if(cal=="*")
                    {
                        kq=kq*b;
                    }
                    else if(cal=="/")
                    {
                        kq=kq/b;
                    }
                    editText.setText(Float.toString(kq));
                    txtCalculator.setText(editText.getText().toString() + "-");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="-";
                    editText.setText("");

                }
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cal=="")
                {
                    txtCalculator.setText(editText.getText().toString() + "*");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="*";
                    editText.setText("");

                }
                else {
                    // Khởi tạo biến để lưu tổng
                    float kq=a;
                    b=Float.parseFloat(editText.getText().toString());
                    if(cal == "+")
                    {
                        kq=kq+b;
                    }
                    else if(cal=="-")
                    {
                        kq=kq-b;
                    }
                    else if(cal=="*")
                    {
                        kq=kq*b;
                    }
                    else if(cal=="/")
                    {
                        kq=kq/b;
                    }
                    editText.setText(Float.toString(kq));
                    txtCalculator.setText(editText.getText().toString() + "*");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="*";
                    editText.setText("");


                }
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cal=="")
                {
                    txtCalculator.setText(editText.getText().toString() + "/");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="/";
                    editText.setText("");

                }
                else {
                    // Khởi tạo biến để lưu tổng
                    float kq=a;
                    b=Float.parseFloat(editText.getText().toString());
                    if(cal == "+")
                    {
                        kq=kq+b;
                    }
                    else if(cal=="-")
                    {
                        kq=kq-b;
                    }
                    else if(cal=="*")
                    {
                        kq=kq*b;
                    }
                    else if(cal=="/")
                    {
                        kq=kq/b;
                    }
                    editText.setText(Float.toString(kq));
                    txtCalculator.setText(editText.getText().toString() + "/");
                    a=Float.parseFloat(editText.getText().toString());
                    cal="/";
                    editText.setText("");


                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCalculator.setText("");
                editText.setText("0");
                cal="";
                a=0;
                b=0;
            }
        });
        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // Khởi tạo biến để lưu tổng
                float kq=a;
                b=Float.parseFloat(editText.getText().toString());
                if(cal == "+")
                {
                    kq=kq+b;
                }
                else if(cal=="-")
                {
                    kq=kq-b;
                }
                else if(cal=="*")
                {
                    kq=kq*b;
                }
                else if(cal=="/")
                {
                    kq=kq/b;
                }
                editText.setText(Float.toString(kq));
                b=0;
                a=kq;
                cal="";
            }
        });

    }

    public void InitWidget()
    {
        btnCong=findViewById(R.id.btnCong);
        btnTru =findViewById(R.id.btnTru);
        btnNhan=findViewById(R.id.btnNhan);
        btnChia=findViewById(R.id.btnChia);
        btnKq=findViewById(R.id.buttonKq);
        btnClear=findViewById(R.id.buttonClear);
        btnN0=findViewById(R.id.buttonN0);
        btnN1=findViewById(R.id.buttonN1);
        btnN2=findViewById(R.id.buttonN2);
        btnN3=findViewById(R.id.buttonN3);
        btnN4=findViewById(R.id.buttonN4);
        btnN5=findViewById(R.id.buttonN5);
        btnN6=findViewById(R.id.buttonN6);
        btnN7=findViewById(R.id.buttonN7);
        btnN8=findViewById(R.id.buttonN8);
        btnN9=findViewById(R.id.buttonN9);
        btndot=findViewById(R.id.buttondot);
        txtCalculator=findViewById(R.id.txtCalculator);
        editText=findViewById(R.id.editTextText);
    }
}