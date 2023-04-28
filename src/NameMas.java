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
        System.out.println();
        Person[] mas = new Person[nm.length];
        int k=0;
        for (String pm: nm) {
//            pm = pm.replace("{", "");
//            pm = pm.replaceAll()
            String[] mass = pm.split(": ");
            System.out.println(mass[0]+","+mass[1]);
            String name = mass[0];
            int point = Integer.parseInt(mass[1]);
            mas[k] = new Person(name, point);
            k++;
        }
        System.out.println();
        for (Person p: mas) {
            System.out.println(p.name + " получает "+p.points);
        }

    }
}
class Person{
    String name;
    int points;

    public Person(String name, int point) {
        this.name = name;
        this.points = point;
    }

}