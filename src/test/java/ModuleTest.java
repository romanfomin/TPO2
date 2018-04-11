import Functions.CSVLog;
import Functions.Computable;
import Functions.Logarithmic.*;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Test;

public class ModuleTest {

    Computable module;
    double from, to ,step, accuracy;

    @Test
    public void testMethod1(){
        module=new Ln();
        from=0;
        to=4;
        step=0.5;
        accuracy=0.0001;

        CSVLog.logModuleToCSV(module,from,to,step,accuracy);
    }
}
