import static java.lang.System.*;

public class ExpressionSolver {
	private String[] solverArr;
	private String line;
	private int answer;
	
	public ExpressionSolver(String line) {
		this.line = line;
	}
	public void SolverEngine() {
		String tempLine = line;
		int count = 1;
		for (int i = 0; i < tempLine.length(); i++) {
			if (tempLine.substring(i, i + 1) == " ") {
				count++;
			}
		}
		out.println(count);
	}
	public void output() {
		out.println(line + " = ");
	}
}
