import java.util.Random;
import java.util.Scanner;

public class Traffic_Lights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество перекрестков: ");
        int n = sc.nextInt();
        int min = 1;
        int max = n;
        int diff = max - min;

        System.out.println("Введите количество тонелей: ");
        int m = sc.nextInt();
        int[] mastun = new int[m];
        int[] mascross = new int[m];
            Random ran = new Random();
            System.out.print("N: ");
            for (int i = 0; i < mastun.length; i++) {
                mastun[i] = ran.nextInt(diff + 1) + min;
                System.out.print(" " + mastun[i] + " ");
            }
            System.out.println();

            System.out.print("M: ");
            for (int i = 0; i < mascross.length; i++) {
                mascross[i] = ran.nextInt(diff + 1) + min;
                System.out.print(" " + mascross[i] + " ");
            }
        int[] res = new int[n];
       // int tl = 0;
        for (int i = 0; i < 2*m; i++) {
            int tl = mascross[i] - 1;
            res[tl]++;


        }

    }
}
