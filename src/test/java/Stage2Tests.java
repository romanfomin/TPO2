import Functions.Computable;
import Functions.FunctionsSystem;
import Functions.Logarithmic.Ln;
import Functions.Logarithmic.Log3;
import Functions.Logarithmic.LogarithmicFunction;
import Functions.Trigonometric.TrigonometricFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class Stage2Tests extends Tests{

    private double x;
    private double accuracy = 0.0001;
    private double result;
    private double expected;

    private LogarithmicFunction logarithmicFunction;
    private TrigonometricFunction trigonometricFunction;
    private Computable sin, cos, cot, csc, sec, tan;
    private FunctionsSystem functionsSystem;


    @Override
    public void doMockAndAssert() {
        trigonometricFunction = Mockito.mock(TrigonometricFunction.class);
        logarithmicFunction = Mockito.mock(LogarithmicFunction.class);

        when(trigonometricFunction.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.trigonomFMap.get(invocation.getArgument(0)));
        when(logarithmicFunction.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.logarithmicFMap.get(invocation.getArgument(0)));

        functionsSystem = new FunctionsSystem( logarithmicFunction,  trigonometricFunction);
        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }
}
