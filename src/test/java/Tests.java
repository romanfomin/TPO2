import Functions.Computable;
import Functions.FunctionsSystem;
import org.junit.jupiter.api.Test;

public abstract class Tests {
    private double x;
    private double accuracy;
    private double result;
    private double expected;

    private Computable logarithmicFunction, trigonometricFunction;
    private Computable sin, cos, cot, csc, sec, tan;
    private FunctionsSystem functionsSystem;


    public abstract void doMockAndAssert();

    @Test
    public void testMethod1() {
        x = -0.4;
        expected = 336.6779;
        doMockAndAssert();
    }

    @Test
    public void testMethod2() {
        x = -1;
        expected = 8.8386;
        doMockAndAssert();
    }

    @Test
    public void testMethod3() {
        x = -1.43;
        expected = 262.25079;
        doMockAndAssert();
    }

    @Test
    public void testMethod4() {
        x = -1.7;
        expected = -736.4724;
        doMockAndAssert();
    }

    @Test
    public void testMethod5() {
        x = -2.06;
        expected = -84.9726;
        doMockAndAssert();
    }

    @Test
    public void testMethod6() {
        x = -2.54;
        expected = -344.5429;
        doMockAndAssert();
    }

    @Test
    public void testMethod7() {
        x = -3.42;
        expected = -291.8291;
        doMockAndAssert();
    }

    @Test
    public void testMethod8() {
        x = -3.87;
        expected = -0.0644;
        doMockAndAssert();
    }

    @Test
    public void testMethod9() {
        x = -4.57;
        expected = -220.13498;
        doMockAndAssert();
    }

    @Test
    public void testMethod10() {
        x = -4.9;
        expected = 260.0393;
        doMockAndAssert();
    }

    @Test
    public void testMethod11() {
        x = -5.4;
        expected = 30.1132;
        doMockAndAssert();
    }

    @Test
    public void testMethod12() {
        x = -5.9;
        expected = 494.3992;
        doMockAndAssert();
    }


    @Test
    public void testMethod13() {
        x = 0.1;
        expected = 3.79487;
        doMockAndAssert();
    }

    @Test
    public void testMethod14() {
        x = 0.6;
        expected = 23.8711;
        doMockAndAssert();
    }

    @Test
    public void testMethod15() {
        x = 1.4;
        expected = 18.24437;
        doMockAndAssert();
    }

    @Test
    public void testMethod16() {
        x = 2.7;
        expected = -1.53375;
        doMockAndAssert();
    }

    @Test
    public void testMethod17() {
        x = 7.3;
        expected = -2.3532;
        doMockAndAssert();
    }
}
