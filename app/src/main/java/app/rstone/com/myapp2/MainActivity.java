package app.rstone.com.myapp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num = findViewById(R.id.num);
        class Calc{
            int num, res;
            String op;
            public void exe(){
                switch(op){
                    case "+":res+=num;break;
                    case "-":res-=num;break;
                    case "*":res*=num;break;
                    case "/":res/=num;break;
                }
            }
            public void setNum(int num){this.num=num;}
            public int getNum(){return num;}
            public void setOp(String op){this.op=op;}
            public String getOp(){return op;}
            public void setRes(int res){this.res=res;}
            public int getRes(){return res;}
        }
        final Calc calc = new Calc();
        findViewById(R.id.plus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setNum(Integer.parseInt(num.getText().toString()));
                Toast.makeText(ctx,"처음입력한값"+calc.getNum(),Toast.LENGTH_LONG).show();
                calc.setOp("+");
                calc.exe();
                num.setText("");

            }
        });
        findViewById(R.id.minus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.setOp("-");
                calc.exe();
                num.setText("");
            }
        });
        findViewById(R.id.multi_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.setOp("*");
                calc.exe();
                num.setText("");
            }
        });
        findViewById(R.id.divide_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.setOp("/");
                calc.exe();
                num.setText("");
            }
        });
        findViewById(R.id.equal_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setNum(Integer.parseInt(num.getText().toString()));
                calc.exe();
                num.setText(calc.getRes()+"");
            }
        }); findViewById(R.id.ac_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setRes(0);
                num.setText("");
            }
        });
    }
}
