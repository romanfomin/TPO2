package Functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVLog {
    private static final char SEPARATOR = ',';
    private static final char NEW_LINE = '\n';

    public static void logModuleToCSV(Computable module, double from,
                                      double to, double step, double accuracy) {

        File file = new File("src/main/resources/" +
                module.getClass().getSimpleName() + ".csv");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("X");
            br.write(SEPARATOR);
            br.write(module.getClass().getSimpleName() + "(X)");
            br.write(NEW_LINE);

            for (double i = from; i < to; i += step) {
                br.write(String.valueOf(i));
                br.write(SEPARATOR);
                br.write(String.valueOf(module.compute(i, accuracy)));
                br.write(NEW_LINE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
