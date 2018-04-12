import Functions.CSVLog;
import Functions.Computable;
import Functions.Logarithmic.*;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Test;

public class ModuleTest {

    Computable module;
    double from, to ,step, accuracy;
    Sin sin = new Sin();
    Cos cos = new Cos(sin);

    Ln ln = new Ln();

    Csc csc = new Csc(sin);
    Cot cot = new Cot(sin, cos);
    Tan tan = new Tan(cos, sin);
    Sec sec = new Sec(cos);

    Log3 log3 = new Log3(ln);
    Log5 log5 = new Log5(ln);
    Log10 log10 = new Log10(ln);

    LogarithmicFunction logarithmicFunction = new LogarithmicFunction(ln, log3, log5, log10);
    TrigonometricFunction trigonometricFunction = new TrigonometricFunction(csc, cot, cos, tan, sec);


    @Test
    public void testMethod1(){

        module=new Ln();
        from=0;
        to=8;
        step=0.1;
        accuracy=0.001;

        CSVLog.logModuleToCSV(module,from,to,step,accuracy);
    }
}
