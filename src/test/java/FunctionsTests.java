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

public class FunctionsTests {

    private double x;
    private double accuracy = 0.0001;
    private double result;
    private double expected;

    private Computable logarithmicFunction, trigonometricFunction;
    private Computable sin, cos, cot, csc, sec, tan;
    private FunctionsSystem functionsSystem;


    private void trigonometricFunctionMock() {
        trigonometricFunction = Mockito.mock(TrigonometricFunction.class);

        when(trigonometricFunction.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.trigonomFMap.get(invocation.getArgument(0)));

        functionsSystem = new FunctionsSystem((LogarithmicFunction) logarithmicFunction, (TrigonometricFunction) trigonometricFunction);
        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }

    private void logarithmicFunctionMock() {
        logarithmicFunction = Mockito.mock(LogarithmicFunction.class);

        when(logarithmicFunction.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Table.logarithmicFMap.get(invocation.getArgument(0)));

        functionsSystem = new FunctionsSystem((LogarithmicFunction) logarithmicFunction, (TrigonometricFunction) trigonometricFunction);
        result = functionsSystem.compute(x, accuracy);

        Assertions.assertTrue(Math.abs(result - expected) < accuracy);
    }

    @Test
    public void testMethod1() {
        x = -0.4;
        expected = 336.6779;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod2() {
        x = -1;
        expected = 8.8386;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod3() {
        x = -1.43;
        expected = 262.25079;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod4() {
        x = -1.7;
        expected = -736.4724;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod5() {
        x = -2.06;
        expected = -84.9726;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod6() {
        x = -2.54;
        expected = -344.5429;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod7() {
        x = -3.42;
        expected = -291.8291;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod8() {
        x = -3.87;
        expected = -0.0644;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod9() {
        x = -4.57;
        expected = -220.13498;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod10() {
        x = -4.9;
        expected = 260.0393;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod11() {
        x = -5.4;
        expected = 30.1132;
        trigonometricFunctionMock();
    }

    @Test
    public void testMethod12() {
        x = -5.9;
        expected = 494.3992;
        trigonometricFunctionMock();
    }


    @Test
    public void testMethod13() {
        x = 0.1;
        expected = 3.79487;
        logarithmicFunctionMock();
    }

    @Test
    public void testMethod14() {
        x = 0.6;
        expected = 23.8711;
        logarithmicFunctionMock();
    }

    @Test
    public void testMethod15() {
        x = 1.4;
        expected = 18.24437;
        logarithmicFunctionMock();
    }

    @Test
    public void testMethod16() {
        x = 2.7;
        expected = -1.53375;
        logarithmicFunctionMock();
    }

    @Test
    public void testMethod17() {
        x = 7.3;
        expected = -2.3532;
        logarithmicFunctionMock();
    }
}
