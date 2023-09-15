import java.util.Collection;
import java.util.Scanner;

public class flowers {
    public static void main(String[] args) {
        String[] flowers = {"G", "C", "V"};
        Scanner days = new Scanner(System.in);
        System.out.println("введите количество дней: ");
        int n = days.nextInt();
        System.out.println(flowers[0] + flowers[1] + flowers[2]);
        int j = 1;

        do {
            String t = flowers[2];
            flowers[2] = flowers[1];
            flowers[1] = t;
            t = flowers[0];
            flowers[0] = flowers[1];
            flowers[1] = t;
        j++;
        } while (j <= n);
             System.out.println(flowers[0] + flowers[1] + flowers[2]);
    }
}

