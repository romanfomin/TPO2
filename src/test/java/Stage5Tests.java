import Functions.FunctionsSystem;
import Functions.Logarithmic.*;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.when;

public class Stage5Tests extends Tests {

    private double accuracy = 0.001;
    private double result;

    private LogarithmicFunction logarithmicFunction;
    private TrigonometricFunction trigonometricFunction;
    private Sin sin;
    private Cos cos;
    private Cot cot;
    private Csc csc;
    private Sec sec;
    private Tan tan;
    private Ln ln;
    private Log3 log3;
    private Log5 log5;
    private Log10 log10;
    private FunctionsSystem functionsSystem;


    @Override
    public void doMockAndAssert() {
        sin = new Sin();
        cos = new Cos(sin);

        ln = new Ln();

        csc = new Csc(sin);
        cot = new Cot(sin, cos);
        tan = new Tan(cos, sin);
        sec = new Sec(cos);

        log3 = new Log3(ln);
        log5 = new Log5(ln);
        log10 = new Log10(ln);

        logarithmicFunction = new LogarithmicFunction(ln, log3, log5, log10);
        trigonometricFunction = new TrigonometricFunction(csc, cot, cos, tan, sec);

        functionsSystem = new FunctionsSystem(logarithmicFunction, trigonometricFunction);
        result = functionsSystem.compute(x, accuracy);


        Assertions.assertTrue(Math.abs(result - expected) < 0.1);
    }
}
