package com.phuongduyen.myfirstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText txtX, txtY; // Nhập X, Y
    TextView txtResult; //Hiển thị kết quả
    Button btnPlus; // Nút +
    Button btnTru; // Nút -
    Button btnNhan; // Nút nhân
    Button btnChia; // Nút chia
    Button btnPhantram; // Nút Phần trăm

    //change 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl(); // Gọi phương thức initControl
    }

    private void initControl() {
        //Viết phương thức làm cầu nối để chuyển đổi từ java sang XML
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPluss);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnPhantram = findViewById(R.id.btnPhantram);


        //Tạo sự kiện nhấn nút
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x+y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = Math.abs(x-y);
                txtResult.setText(String.valueOf(result));
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x*y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x/y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnPhantram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x%y;
                txtResult.setText(String.valueOf(result));
            }
        });
    }
}