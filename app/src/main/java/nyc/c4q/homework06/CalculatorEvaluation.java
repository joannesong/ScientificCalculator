package nyc.c4q.homework06;

import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;


/**
 * Created by amirahoxendine on 10/24/17.
 */

public class CalculatorEvaluation {
    private String equation;
    DoubleEvaluator evaluator = new DoubleEvaluator();
    Double result;
    public void evaluateEquation(String s, TextView textView){

        //currently % is for modulo, not percentage, need to catch %, run percent function, then replace.
       try {
           result = evaluator.evaluate(s);
           textView.setText(String.valueOf(result));
       }catch (IllegalArgumentException i){
           textView.setText(String.valueOf(s));
       }

    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }
}
