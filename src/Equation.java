import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter writer = new PrintWriter("output.txt");
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int k = 0;
        for (long x = -100; x < 100; x++) {
            if ((((a * Math.pow(x, 3)) + (b * Math.pow(x, 2)) + (c * x) + d) == 0)) {
                if (k > 0)
                    writer.print(" ");
                writer.print(x);
                k++;
            }
        }
        writer.close();
    }
}