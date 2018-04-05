package Functions;

import Functions.Logarithmic.*;
import Functions.Trigonometric.*;

public class FunctionsSystem implements Computable {

    private LogarithmicFunction logarithmicFunction;
    private TrigonometricFunction trigonometricFunction;

    public FunctionsSystem(LogarithmicFunction logarithmicFunction, TrigonometricFunction trigonometricFunction){
        this.logarithmicFunction = logarithmicFunction;
        this.trigonometricFunction = trigonometricFunction;
    }

    @Override
    public double compute(double x, double accuracy) {
        if(x<=0){
            return (trigonometricFunction).compute(x,accuracy);
        }else{
            return (logarithmicFunction).compute(x,accuracy);
        }
    }
}
