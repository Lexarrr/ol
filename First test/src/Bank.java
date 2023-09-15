import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        int[] nom = new int[]{5000, 1000, 500, 100};
        int[] kolnom = new int[4]; // колво купюр в наличии
        kolnom[0] = 10;
        kolnom[1] = 10;
        kolnom[2] = 10;
        kolnom[3] = 10;

        int ostatok = 0;
        System.out.println("Введите сумму: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < 4; i++)
            ostatok += nom[i] * kolnom[i];
        System.out.println("Наличие в банкомате: " + ostatok);

        int[] x = new int[4];
        if (number <= ostatok && number % nom[3] == 0) {
            for (int i = 0; i < 4; i++) {
                if (number <= kolnom[i])
                    x[i] = kolnom[i];
                x[i] = number / nom[i];
                System.out.println(nom[i] + ": " + x[i]);
                if (kolnom[i] <= ostatok){
                number -= x[i] * nom[i];
                }
                ostatok -= x[i] * nom[i];
            }
            System.out.println("Наличие в банкомате:" + ostatok);
            /*if (number > 0)
                System.out.println("В банкомате недостаточно средств. Введите сумму не более:" + ostatok);
*/
        } else
            System.out.println("В банкомате недостаточно средств. Введите сумму не более: " + ostatok);
    }
}
