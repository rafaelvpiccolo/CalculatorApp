package estudante.rafaelpiccolo.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText calc;

    Button btn0
    ,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDelete,
            btnDeleteAll,btnPlus,btnMinus,btnMulti,btnDot,
            btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = findViewById(R.id.editTextNumber);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnDelete = findViewById(R.id.buttonDelete);
        btnDeleteAll = findViewById(R.id.buttonDeleteAll);
        btnPlus = findViewById(R.id.buttonPlus);
        btnMinus = findViewById(R.id.buttonMinus);
        btnMulti = findViewById(R.id.buttonMulti);
        btnDot = findViewById(R.id.buttonDot);
        btnEqual = findViewById(R.id.buttonEqual);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("0");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"0";
                    calc.setText(newValue);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("1");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"1";
                    calc.setText(newValue);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("2");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"2";
                    calc.setText(newValue);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("3");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"3";
                    calc.setText(newValue);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("4");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"4";
                    calc.setText(newValue);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("5");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"5";
                    calc.setText(newValue);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("6");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"6";
                    calc.setText(newValue);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("7");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"7";
                    calc.setText(newValue);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("8");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"8";
                    calc.setText(newValue);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("9");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"9";
                    calc.setText(newValue);
                }
            }
        });
    }
}