import static java.lang.System.*;

class HistogramClass {
    private String lineInt;
    private int[] histogramInt;

    public void histogramAssign(String intLine) {
        lineInt = intLine;
    }
    public void histogramArray() {
        histogramInt = new int[10];
    }
    public void histogramEngine() {
        for (int i = 0; i <= 9; i++) {
            histogramInt[i] = 0;
        }
        while (lineInt.length() != 0) {
        	String oneNum = lineInt.substring(0, 1);
            int oneInt = Integer.parseInt(oneNum);
            for (int i = 0; i <= 9; i++) {
                if (i == oneInt) {
                    histogramInt[i]++;
                }
            }
            lineInt = lineInt.substring(1, lineInt.length());
        }
    }
    public void stringify(){
        for (int i = 0; i <= 9; i++) {
        	out.println(i + " - " + histogramInt[i]);
        }
        out.println();
    }
}
