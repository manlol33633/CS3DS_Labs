import static java.lang.System.*;

class FibonacciClass {
	private int[] fibSeq;
	private String codeSeq;
	private int fibLen;
	private int[] outputSeq;
	
	public FibonacciClass(String line) {
		String strFibLen = line.substring(0, line.indexOf(" "));
		fibLen = Integer.parseInt(strFibLen);
		codeSeq = line.substring(line.indexOf(" ") + 1, line.length());
	}
	public void assign() {
		fibSeq = new int[fibLen + 1];
	}
	public void fibonacciEngine() {
		int[] numSeq;
		int firstNum = 0;
		int secondNum = 1;
		int tempNum;
		for (int i = 0; i < fibLen + 1; i++) {
			fibSeq[i] = firstNum;
			tempNum = secondNum;
			secondNum += firstNum;
			firstNum = tempNum;
			
		}
		String temp = codeSeq;
		int num;
		int count = 0;
		while (temp.length() != 0) {
			if (temp.indexOf(" ") != -1) {
				num = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
				count++;
				temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
			} else {
				num = Integer.parseInt(temp);
				temp = "";
			}
		}
		
		String tempArr = codeSeq;
		numSeq = new int[count + 1];
		for (int i = 0; i < numSeq.length; i++) {
			if (tempArr.indexOf(" ") > -1) {
				num = Integer.parseInt(tempArr.substring(0, tempArr.indexOf(" ")));
				numSeq[i] = num;
				tempArr = tempArr.substring(tempArr.indexOf(" ") + 1, tempArr.length());
			} else {
				numSeq[numSeq.length - 1] = Integer.parseInt(tempArr.substring(0, tempArr.length()));
			}
		}
		outputSeq = new int[count + 1];
		for (int i = 0; i < outputSeq.length; i++) {
			if (numSeq[i] > fibLen || numSeq[i] == 0) {
				outputSeq[i] = -1;
			} else {
				outputSeq[i] = fibSeq[numSeq[i]];
			}
		}
	}
	public void output() {
		for (int i = 0; i < outputSeq.length; i++) {
			out.println(outputSeq[i]);
		}
		out.println("XXXXXX");
	}
}
