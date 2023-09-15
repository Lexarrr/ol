import java.util.Scanner;

public class ottep {
    public static void main(String[] args) {
        int td, n;
        Scanner ott = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        n = ott.nextInt();
        System.out.println("Введите t по количество дней:");

        int mwd = 0;
        int wt = 0;
        int i;
       // int j = 0;
        for (i = 1; i <= n; i++) {
            td = ott.nextInt();
            if (td > 0) {
                wt++;
           //     j = wt++;
                if (wt > mwd) {
                    mwd = wt;
                }
            }
            else {
                wt = 0;
            }
        }
        System.out.println("Максимальное количество теплых дней = " + mwd);
    }
}
