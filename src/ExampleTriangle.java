import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ExampleTriangle {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "input.txt";
        Scanner sc = new Scanner(new File(inputFile));
        String s;
        ArrayList<Triangle> trin = new ArrayList<>();
        while (sc.hasNext()) {
            s = sc.nextLine();

            Triangle t = Triangle.parseTr(s);
            trin.add(t);
        }
        trin.sort(Comparator.comparing(Triangle::getArea));
        for (int i = 0; i < trin.size(); i++) {

            System.out.println((trin.get(i)) + " area = " + trin.get(i).getArea());

        }

    }
}

