import Functions.Computable;
import Functions.FunctionsSystem;
import Functions.Logarithmic.*;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.when;

public class Stage4Tests extends Tests {

    private double x;
    private double accuracy = 0.001;
    private double result;
    private double expected;

    private LogarithmicFunction logarithmicFunction;
    private TrigonometricFunction trigonometricFunction;
    private Computable sin, cos, cot, csc, sec, tan, ln, log3, log5, log10;
    private FunctionsSystem functionsSystem;


    @Override
    public void doMockAndAssert() {
        cos = Mockito.mock(Cos.class);
        sin = Mockito.mock(Sin.class);

        ln = Mockito.mock(Ln.class);

        when(cos.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.cosMap.get(invocation.getArgument(0)));
        when(sin.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.sinMap.get(invocation.getArgument(0)));

        when(ln.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.lnMap.get(invocation.getArgument(0)));

        csc = new Csc((Sin) sin);
        cot = new Cot((Sin) sin, (Cos) cos);
        tan = new Tan((Cos) cos, (Sin) sin);
        sec = new Sec((Cos) cos);

        log3 = new Log3((Ln) ln);
        log5 = new Log5((Ln) ln);
        log10 = new Log10((Ln) ln);

        logarithmicFunction = new LogarithmicFunction((Ln) ln, (Log3) log3, (Log5) log5, (Log10) log10);
        trigonometricFunction = new TrigonometricFunction((Csc) csc, (Cot) cot, (Cos) cos, (Tan) tan, (Sec) sec);

        functionsSystem = new FunctionsSystem(logarithmicFunction, trigonometricFunction);
        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }
}
