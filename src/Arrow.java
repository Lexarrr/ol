import java.io.*;
import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = " output.txt";
        String leftarrow = ">>-->";
        String rightarrow = "<--<<";
        Scanner sc = new Scanner(new File(inputFile));
        String s = sc.nextLine();
        int r = 0;
        int n = s.length() - rightarrow.length();

        Writer wr = new FileWriter(outputFile);
        wr.write(String.valueOf(r));
        wr.close();
    }

}
