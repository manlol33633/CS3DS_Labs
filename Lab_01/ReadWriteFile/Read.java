import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class Read {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("Read.txt"));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			out.println(line);
		}
		int sum = 0;
		int numRecords = Integer.parseInt(scanner.nextLine());
		while (scanner.hasNext()) {
			sum += Integer.parseInt(scanner.nextLine());
		}
		out.println(sum);
	}

}
