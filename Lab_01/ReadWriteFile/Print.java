import java.io.*;

public class Print {
	public static void main(String[] args) throws IOException{
		PrintWriter output = new PrintWriter(new File("Print.txt"));
		output.println("What the hecking heck");
		output.close();
	}
}
