package com.example.thlaptrinhdidongtuan2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double input1 = 0;
    double input2 = 0;
    private TextView display,display2;
    private boolean Add, Sub, Mul, Div, Rem, dec;

    private Button
            button0,
            button1,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            buttonadd,
            buttonsub,
            buttonmul,
            buttondel,
            buttondiv,
            buttonrem,
            buttondot,
            buttonequal,
            buttonclear;
    @Override
    protected void onCreate(Bundle savedBundleInstance) {

        super.onCreate(savedBundleInstance);
        setContentView(R.layout.activity_main);


        this.display = findViewById(R.id.display);
        this.button0 = findViewById(R.id.btn0);
        this.button1 = findViewById(R.id.btn1);
        this.button2 = findViewById(R.id.btn2);
        this.button3 = findViewById(R.id.btn3);
        this.button4 = findViewById(R.id.btn4);
        this.button5 = findViewById(R.id.btn5);
        this.button6 = findViewById(R.id.btn6);
        this.button7 = findViewById(R.id.btn7);
        this.button8 = findViewById(R.id.btn8);
        this.button9 = findViewById(R.id.btn9);
        this.buttonadd = findViewById(R.id.btn_add);
        this.buttonsub = findViewById(R.id.btn_sub);
        this.buttonmul = findViewById(R.id.btn_mul);
        this.buttondel = findViewById(R.id.btn_del);
        this.buttonclear = findViewById(R.id.btn_clear);
        this.buttondiv = findViewById(R.id.btn_div);
        this.buttonrem = findViewById(R.id.btn_rem);
        this.buttondot = findViewById(R.id.btn_dot);
        this.buttonequal = findViewById(R.id.btn_equal);
        this.display2 = findViewById(R.id.display2);

        button0.setOnClickListener(view -> {
            display.setText(display.getText() + "0");
        });
        button1.setOnClickListener(view -> {
            display.setText(display.getText() + "1");
        });
        button2.setOnClickListener(view -> {
            display.setText(display.getText() + "2");
        });
        button3.setOnClickListener(view -> {
            display.setText(display.getText() + "3");
        });
        button4.setOnClickListener(view -> {
            display.setText(display.getText() + "4");
        });
        button5.setOnClickListener(view -> {
            display.setText(display.getText() + "5");
        });
        button6.setOnClickListener(view -> {
            display.setText(display.getText() + "6");
        });
        button7.setOnClickListener(view -> {
            display.setText(display.getText() + "7");
        });
        button8.setOnClickListener(view -> {
            display.setText(display.getText() + "8");
        });
        button9.setOnClickListener(view -> {
            display.setText(display.getText() + "9");
        });
        buttonadd.setOnClickListener(view -> {
            if (display.getText().length() != 0) {
                input1 = Double.parseDouble(display.getText().toString());
                Add = true;
                Sub = false;
                Mul = false;
                Div = false;
                Rem = false;
                dec = false;
                display.setText("");
                display2.setText(String.valueOf(input1+"+"));
            }
        });
        buttonsub.setOnClickListener(view -> {
            if (display.getText().length() != 0) {
                input1 = Double.parseDouble(display.getText().toString());
                Add = false;
                Sub = true;
                Mul = false;
                Div = false;
                Rem = false;
                dec = false;
                display.setText("");
                display2.setText(String.valueOf(input1+"-"));
            }
        });

        buttonmul.setOnClickListener(view -> {
            if (display.getText().length() != 0) {
                input1 = Double.parseDouble(display.getText().toString());
                Add = false;
                Sub = false;
                Mul = true;
                Div = false;
                Rem = false;
                dec = false;
                display.setText("");
                display2.setText(String.valueOf(input1+"*"));
            }
        });
        buttondiv.setOnClickListener(view -> {
            if (display.getText().length() != 0) {
                input1 = Double.parseDouble(display.getText().toString());
                Add = false;
                Sub = false;
                Mul = false;
                Div = true;
                Rem = false;
                dec = false;
                display.setText("");
                display2.setText(String.valueOf(input1+"/"));
            }
        });
        buttonrem.setOnClickListener(view -> {
            if (display.getText().length() != 0) {
                input1 = Double.parseDouble(display.getText().toString());
                Add = false;
                Sub = false;
                Mul = false;
                Div = false;
                Rem = true;
                dec = false;
                display.setText("");
                display2.setText(String.valueOf(input1+"%"));
            }
        });
        buttonclear.setOnClickListener(view -> {
            input1 = 0;
            input2 = 0;
            Add = false;
            Sub = false;
            Mul = false;
            Div = false;
            Rem = false;
            dec = false;
            display2.setText("");
            display.setText("");
        });
        buttondot.setOnClickListener(view -> {
            if (!dec) {
                display.setText(display.getText() + ".");
                dec = true;
            }
        });
        buttonequal.setOnClickListener(view -> {
            if (Add || Sub || Mul || Div || Rem) {
                input2 = Double.parseDouble(display.getText().toString());
                if (Add) {
                    display.setText(String.valueOf(input1 + input2));
                    display2.setText(String.valueOf(input1+"+"+input2+"="));
                    Add = false;
                }
                if (Sub) {
                    display.setText(String.valueOf(input1 - input2));
                    display2.setText(String.valueOf(input1+"-"+input2+"="));
                    Sub = false;
                }
                if (Mul) {
                    display.setText(String.valueOf(input1 * input2));
                    display2.setText(String.valueOf(input1+"*"+input2+"="));
                    Mul = false;
                }
                if (Div) {
                    display.setText(String.valueOf(input1 / input2));
                    display2.setText(String.valueOf(input1+"/"+input2+"="));
                    Div = false;
                }
                if (Rem) {
                    display.setText(String.valueOf(input1 % input2));
                    display2.setText(String.valueOf(input1+"%"+input2+"="));
                    Rem = false;
                }
            }
        });
        buttondel.setOnClickListener(view -> {
            if (display.getText().length() != 0) {
                String string = display.getText().toString();
                display.setText(string.substring(0, string.length() - 1));
            }
        });
    }
}
