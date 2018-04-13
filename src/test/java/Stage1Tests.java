import Functions.FunctionsSystem;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.when;

public class Stage1Tests extends Tests {

    private double accuracy = 0.0001;
    private double result;

//    private FunctionsSystem functionsSystem;

    @Override
    public void doMockAndAssert() {
        functionsSystem = Mockito.mock(FunctionsSystem.class);
        when(functionsSystem.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.systemFMap.get(invocation.getArgument(0)));

        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }
}
