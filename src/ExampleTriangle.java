import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
            String[] tr = s.split("}");
            for (int i = 0; i < tr.length; i++) {
                Triangle t = parseTr(s);
                trin.add(t);
            }
        }
        trin.sort(Comparator.comparing(Triangle::getArea));
    }
    public static Triangle parseTr(String s){
        String[] trgl = s.split(", ");
        Point p1 = parsePoint(trgl[0]);
        Point p2 = parsePoint(trgl[1]);
        Point p3 = parsePoint(trgl[2]);
        Triangle tr = new Triangle(p1, p2, p3);
        return tr;
    }
    public static Point parsePoint(String s){
        s = s.replace("{", "").replace("}", "");
        String[] cc = s.split(";");
        double x = Double.parseDouble(cc[0]);
        double y = Double.parseDouble(cc[1]);
        return new Point(x, y);
    }


}
