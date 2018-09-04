package app.rstone.com.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SwitchCalc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_calc);

        Button plusBtn = findViewById(R.id.plus_btn);
        Button minusBtn = findViewById(R.id.minus_btn);
        Button multiBtn = findViewById(R.id.multi_btn);
        Button divideBtn = findViewById(R.id.divide_btn);
        Button equalBtn = findViewById(R.id.equal_btn);
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        multiBtn.setOnClickListener(this);
        divideBtn.setOnClickListener(this);
        equalBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final EditText num = findViewById(R.id.num);
        final EditText result = findViewById(R.id.result);
        switch(v.getId()){
            case R.id.plus_btn:break;
            case R.id.minus_btn:break;
            case R.id.multi_btn:break;
            case R.id.divide_btn:break;
            case R.id.equal_btn:break;
        }
    }
}
