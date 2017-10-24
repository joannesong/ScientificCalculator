package nyc.c4q.homework06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button clear;
    Button parens;
    Button modulo;
    Button divide;
    Button multiply;
    Button add;
    Button subtract;
    Button answer;


    Numbers numbers = new Numbers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneButton = (Button) findViewById(R.id.line4box1);
        twoButton = (Button) findViewById(R.id.line4box2);
        threeButton = (Button) findViewById(R.id.line4box3);
        fourButton = (Button) findViewById(R.id.line3box1);
        five = (Button) findViewById(R.id.line3box2);
        six = (Button) findViewById(R.id.line3box3);
        seven = (Button) findViewById(R.id.line2box1);
        eight = (Button) findViewById(R.id.line2box2);
        nine = (Button) findViewById(R.id.line2box3);
        zero = (Button) findViewById(R.id.line5box2);
        clear = (Button) findViewById(R.id.line1box1);
        parens = (Button) findViewById(R.id.line1box2);
        modulo = (Button) findViewById(R.id.line1box3);
        divide = (Button) findViewById(R.id.line1box4);
        multiply = (Button) findViewById(R.id.line2box4);
        add = (Button) findViewById(R.id.line4box4);
        subtract = (Button) findViewById(R.id.line3box4);
        answer = (Button) findViewById(R.id.line5box4);

        oneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(1);
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(2);
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                numbers.numList(3);
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                numbers.numList(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(9);
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numbers.numList(0);
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        parens.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        modulo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        divide.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        subtract.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
        answer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

    }
}

