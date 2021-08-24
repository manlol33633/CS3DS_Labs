import java.io.*;
import java.util.Scanner;

public class HistogramRunner {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("histogram.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            HistogramClass obj = new HistogramClass();
            obj.histogramAssign(line);
            obj.histogramArray();
            obj.histogramEngine();
            obj.stringify();
        }
    }
}
