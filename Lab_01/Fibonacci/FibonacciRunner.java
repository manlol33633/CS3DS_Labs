import java.io.*;
import java.util.Scanner;

public class FibonacciRunner {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(new File("fibonacci.txt"));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			FibonacciClass obj = new FibonacciClass(line);
			obj.assign();
			obj.fibonacciEngine();
			obj.output();
		}
			
	}
}
