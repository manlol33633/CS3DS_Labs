import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class ExpressionRunner {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("ExpressionSolver.txt"));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			ExpressionSolver obj = new ExpressionSolver(line);
		}
	}
}
