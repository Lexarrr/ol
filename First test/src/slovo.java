import java.util.Scanner;

public class slovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число: ");
        int count = scanner.nextInt();
        System.out.println("введите слово: ");
        String sl = scanner.next();
        for (int i = 0; i < count ; i++) {
            System.out.println(sl);
        }
    }
}
