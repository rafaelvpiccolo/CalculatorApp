package estudante.rafaelpiccolo.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean opButton = true;

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
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("0");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"0";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("1");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"1";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("2");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"2";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("3");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"3";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("4");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"4";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("5");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"5";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("6");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"6";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("7");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"7";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("8");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"8";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(calc.getText().toString())){
                    calc.setText("9");
                }
                else{
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"9";
                    calc.setText(newValue);
                }
                opButton = true;
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                String text = calc.getText().toString();
                String character = ".";
                if(TextUtils.isEmpty(calc.getText().toString()) && !text.contains(character)){
                    calc.setText("0.");
                }
                else if(!text.contains(character)){
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+".";
                    calc.setText(newValue);
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = calc.getText().length();
                if (length > 0) {
                    calc.getText().delete(length - 1, length);
                }
            }
        });

        btnDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = calc.getText().length();
                if (length > 0) {
                    calc.getText().delete(0, length);
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if (!TextUtils.isEmpty(calc.getText().toString()) && opButton) {
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"+";
                    calc.setText(newValue);
                    opButton = false;
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if (!TextUtils.isEmpty(calc.getText().toString()) && opButton) {
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"-";
                    calc.setText(newValue);
                    opButton = false;
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calc.getText().length() == 15){
                    Toast.makeText(getApplicationContext(), "It is not possible to exceed 15 digits.",
                            Toast.LENGTH_SHORT).show();
                }

                if (!TextUtils.isEmpty(calc.getText().toString()) && opButton) {
                    String actualValue = String.valueOf(calc.getText());
                    String newValue = actualValue+"x";
                    calc.setText(newValue);
                    opButton = false;
                }
            }
        });
    }
}