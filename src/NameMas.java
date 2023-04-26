import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NameMas {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "input.txt";
//        String outputFile = " output.txt";

        Scanner sc = new Scanner(new File(inputFile));
        String s = sc.nextLine();
        String[] nm = s.split("}");
        for (String pers: nm) {
            pers = pers.replace("{", "");
            System.out.println(pers);

        }


    }
}
class Person{
    String name;
    int point;

    public Person(String name, int point) {
        this.name = name;
        this.point = point;
    }

}