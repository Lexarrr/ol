import java.util.Scanner;

public class Merlin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число голов за один удар: ");
        int n = sc.nextInt();
        System.out.println("Введите число голов дракона: ");
        int m = sc.nextInt();
        System.out.println("Введите число голов, которые дракон регенерирует за раз: ");
        int k = sc.nextInt();
        int i = 0;
        while (m > 0) {
            i++;
            m -= n;
            if (m < 0) {
                System.out.println("Количество ударов: " + i);
            }
            if (m > 0) {
                m += k;
            }
        }
        System.out.println();
        System.out.println("Количество ударов: " + i);
        if (m > n && k >= n) {
            System.out.println("No");
        }
    }
}
