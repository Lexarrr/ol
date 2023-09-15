import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        array();

    }

    public static void array() {
        int[] massiv = inputInteger();
        outputMassiv(massiv);
        System.out.println("bubble: " + sortBubbleMas(massiv));
        mergeDivideMas(massiv);
        outputMassiv(massiv);
        outputMassiv(sortByMin(massiv));

    }

    public static int[] inputInteger() {
        Scanner integer = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int i = integer.nextInt();
        int[] number = new int[i];
        System.out.println("Введите числа: ");
        for (int j = 0; j < number.length; j++) {
            number[j] = integer.nextInt();
        }
        return number;
    }

    public static void outputMassiv(int[] mas) {
        System.out.println("Массив:");
        int i = 0;
        while (i < mas.length) {
            System.out.println(mas[i]);
            i++;
        }
    }

    public static String sortBubbleMas(int[] mas) {
        int l = mas.length;
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l - i; j++) {
                if (mas[j] < mas[j - 1]) {
                    int k = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = k;
                }
            }
        }
        return Arrays.toString(mas);
    }

    public static void mergeDivideMas(int[] mas) {

        int length = mas.length;
        if (length == 1) return;
        int div = length / 2;

        int[] leftMas = new int[div];
        int[] rightMas = new int[length - div];

        for (int s = 0; s < div; s++)
            leftMas[s] = mas[s];

        for (int s = 0; s < length - div; s++)
            rightMas[s] = mas[s + div];

        mergeDivideMas(leftMas);
        mergeDivideMas(rightMas);
        mergeConquerMas(mas, leftMas, rightMas);
    }

    public static void mergeConquerMas(int[] mas, int[] leftMas, int[] rightMas) {

        int i = 0;
        int j = 0;
        int rs = 0;
        while (i < leftMas.length && j < rightMas.length) {
            if (leftMas[i] < rightMas[j]) {
                mas[rs] = leftMas[i];
                i++;
            } else {
                mas[rs] = rightMas[j];
                j++;
            }
            rs++;
        }
        while (i < leftMas.length) {
            mas[rs] = leftMas[i];
            i++;
            rs++;
        }
        while (j < rightMas.length) {
            mas[rs] = rightMas[j];
            j++;
            rs++;
        }
    }

    public static int findMin(int[] Min) {
        int mn = Min[0];
        int i = 0;
        while (i < Min.length) {
            if (mn > Min[i]) {
                mn = Min[i];
            }
            i++;
        }
        return mn;
    }

    public static int[] sortByMin(int[] mas) {
        System.out.println("Min: ");
        int mn = findMin(mas);
        int rs = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length - i; j++) {
                if (mas[j] < mn) {
                    rs = mas[j];
                    mas[i] = mas[j];
                    mas[j] = rs;
                }
            }
        }
        return mas;
    }
}



