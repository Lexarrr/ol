import java.util.Scanner;

public class otritsat {
    public static void main(String[] args) {
        Scanner otr = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int s = 0;
        int n = otr.nextInt();
        while (n > 0){
            n = otr.nextInt();
            s++;
        }
        System.out.println("Количество неотрицательных цифр: "+s);
    }
}
