package com.app.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       res= (TextView) findViewById(R.id.res);
        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"0");
            }
        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"1");
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"2");
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"3");
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"4");
            }
        });
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"5");
            }
        });
        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"6");
            }
        });
        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"7");
            }
        });
        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"8");
            }
        });
        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"9");
            }
        });
        findViewById(R.id.btnplus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+" + ");
            }
        });
        findViewById(R.id.btnmin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+" - ");
            }
        });
        findViewById(R.id.btnmul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+" X ");
            }
        });
        findViewById(R.id.btndiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+" / ");
            }
        });
        findViewById(R.id.btnmod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
            }
        });
        findViewById(R.id.btnequ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String s= res.getText().toString();
            String [] nums = s.split(" ");
            float  f = Integer.parseInt(nums[0]);
            int j=0;
            for (int i=1 ; i<nums.length; i+=2)
            {
                if (nums[i].equals("+"))
                    f+=Integer.parseInt(nums[j+=2]);
                else if (nums[i].equals("-"))
                    f-=Integer.parseInt(nums[j+=2]);
                else if (nums[i].equals("X"))
                    f*=Integer.parseInt(nums[j+=2]);
                else if (nums[i].equals("/"))
                    f/=Integer.parseInt(nums[j+=2]);
            }
            int t=(int) f;
                if (f-t==0)
                res.setText(""+t);
                else
                    res.setText(""+f);
        }
        });
    }
}