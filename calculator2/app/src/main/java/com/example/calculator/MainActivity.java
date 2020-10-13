package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView opera;
    private TextView tv;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnadd;
    private Button btnsub;
    private Button btndevide;
    private Button btnmul;
    private Button btnresult;
    private Button btnaddsub;
    private Button btnC;
    private Button btnCE;
    private Button btndot;
    private Button btnBS;
    private int so1 =0;
    private int so2=0;
    private float kq;
    private int toantu=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }
    public void initWidget(){
        opera=(TextView)findViewById(R.id.operator);
        tv = (TextView)findViewById(R.id.tv);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndevide=(Button)findViewById(R.id.btndevide);
        btnC=(Button)findViewById(R.id.btnC);
        btnCE=(Button)findViewById(R.id.btnCE);
        btnBS=(Button)findViewById(R.id.btnBS);
        btnaddsub=(Button)findViewById(R.id.btnaddsub);
        btndot=(Button)findViewById(R.id.btndot);
        btnresult=(Button)findViewById(R.id.btnresult);
    }
    public void setEventClickViews(){
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnaddsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndevide.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnBS.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnresult.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:{ if(tv.getText().equals("0")) tv.setText("0");else tv.append("0");};break;
            case R.id.btn1:  { if(tv.getText().equals("0")) tv.setText("1");else tv.append("1");};break;
            case R.id.btn2: { if(tv.getText().equals("0")) tv.setText("2");else tv.append("2");};break;
            case R.id.btn3:  { if(tv.getText().equals("0")) tv.setText("3");else tv.append("3");}break;
            case R.id.btn4: { if(tv.getText().equals("0")) tv.setText("4");else tv.append("4");}break;
            case R.id.btn5: { if(tv.getText().equals("0")) tv.setText("5");else tv.append("5");}break;
            case R.id.btn6:  { if(tv.getText().equals("0")) tv.setText("6");else tv.append("6");}break;
            case R.id.btn7: { if(tv.getText().equals("0")) tv.setText("7");else tv.append("7");}break;
            case R.id.btn8:  { if(tv.getText().equals("0")) tv.setText("8");else tv.append("8");}break;
            case R.id.btn9:{ if(tv.getText().equals("0")) tv.setText("9");else tv.append("9");}break;
            case R.id.btnBS: if(tv.getText().length()>0){
                String str1 = String.valueOf(tv.getText());
                str1 = str1.substring(0,str1.length()-1);
                tv.setText(str1);
            } else{
                Toast.makeText(MainActivity.this,"Ban da xoa het",Toast.LENGTH_SHORT).show();
            };break;
            case R.id.btnCE:tv.setText("0");break;
            case R.id.btnadd:{
                so1 = Integer.parseInt(String.valueOf(tv.getText()));
                opera.setText("+");
                toantu=1;
                tv.setText("0");
            }
            break;
            case R.id.btnsub:{
                so1 = Integer.parseInt(String.valueOf(tv.getText()));
                opera.setText("-");
                toantu=2;
                tv.setText("0");
            }
            break;
            case R.id.btnmul:{
                so1 = Integer.parseInt(String.valueOf(tv.getText()));
                opera.setText("x");
                toantu=3;
                tv.setText("0");
            }
            break;
            case R.id.btndevide:{
                so1 = Integer.parseInt(String.valueOf(tv.getText()));
                opera.setText("/");
                toantu=4;
                tv.setText("0");

            };
            break;
            case R.id.btnresult:{
                so2 = Integer.parseInt(String.valueOf(tv.getText()));
                if (toantu==1) kq = so1+so2;
                        else if(toantu == 2) kq = so1-so2;
                        else if(toantu==3) kq=so1*so2;
                        else if(toantu == 4) kq = (int)so1/so2;
                tv.setText(String.valueOf((int)kq));
            }
            break;
            case R.id.btnC:{
                toantu = 0;
                opera.setText("");
            }
            break;
        }
    }
}