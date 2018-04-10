import Functions.Computable;
import Functions.FunctionsSystem;
import Functions.Logarithmic.*;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.when;

public class Stage3Tests extends Tests {

    private double x;
    private double accuracy = 0.0001;
    private double result;
    private double expected;

    private LogarithmicFunction logarithmicFunction;
    private TrigonometricFunction trigonometricFunction;
    private Computable sin, cos, cot, csc, sec, tan, ln, log3, log5, log10;
    private FunctionsSystem functionsSystem;


    @Override
    public void doMockAndAssert() {
        cos = Mockito.mock(Cos.class);
        csc = Mockito.mock(Csc.class);
        cot = Mockito.mock(Cot.class);
        tan = Mockito.mock(Tan.class);
        sec = Mockito.mock(Sec.class);

        ln = Mockito.mock(Ln.class);
        log3 = Mockito.mock(Log3.class);
        log5 = Mockito.mock(Log5.class);
        log10 = Mockito.mock(Log10.class);

        when(cos.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.cosMap.get(invocation.getArgument(0)));
        when(csc.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.cscMap.get(invocation.getArgument(0)));
        when(cot.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.cotMap.get(invocation.getArgument(0)));
        when(tan.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.tanMap.get(invocation.getArgument(0)));
        when(sec.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.secMap.get(invocation.getArgument(0)));

        when(ln.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.lnMap.get(invocation.getArgument(0)));
        when(log3.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.log3Map.get(invocation.getArgument(0)));
        when(log5.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.log5Map.get(invocation.getArgument(0)));
        when(log10.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.log10Map.get(invocation.getArgument(0)));

        logarithmicFunction = new LogarithmicFunction((Ln) ln, (Log3) log3, (Log5) log5, (Log10) log10);
        trigonometricFunction = new TrigonometricFunction((Csc) csc, (Cot) cot, (Cos) cos, (Tan) tan, (Sec) sec);

        functionsSystem = new FunctionsSystem(logarithmicFunction, trigonometricFunction);
        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }
}
