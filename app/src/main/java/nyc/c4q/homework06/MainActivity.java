package nyc.c4q.homework06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView equation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equation = (TextView) findViewById(R.id.text_equation);
        //TODO: saved instance state for switching screen orientation layouts.

    }

    public void calculateEquation(View v){

        //TODO: create and use resource values for button tags and text
        //TODO: create resource values for xml styles.
        //TODO: design the UI styles
        // TODO: radians vs degrees toggle button.



                CalculatorEvaluation calc = new CalculatorEvaluation();
                String thisEquation = equation.getText().toString();
                String expression;

                if (v.getTag().toString().equals("=")){
                    calc.setEquation(equation.getText().toString());
                    expression = calc.getEquation();
                    calc.evaluateEquation(expression, equation);
                }else if (v.getTag().toString().equals("delete")){
                    if (thisEquation.length() != 0){
                            equation.setText(thisEquation.substring(0, thisEquation.length() - 1));
                    }
//TODO fix delete function, it currently only deletes one character at time.
                }else if (v.getTag().toString().equals("inv")){

                    // TODO: Inverse buttons switch
                } else if (!v.getTag().toString().equals("inv") && !v.getTag().toString().equals("delete")) {
                    thisEquation= thisEquation.concat(v.getTag().toString());
                    equation.setText(thisEquation);
                }
    }
}

