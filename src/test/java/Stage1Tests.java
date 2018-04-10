import Functions.Computable;
import Functions.FunctionsSystem;
import Functions.Logarithmic.LogarithmicFunction;
import Functions.Trigonometric.TrigonometricFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Stage1Tests extends Tests {

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
        functionsSystem = Mockito.mock(FunctionsSystem.class);
        when(functionsSystem.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.systemFMap.get(invocation.getArgument(0)));

        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }
}
