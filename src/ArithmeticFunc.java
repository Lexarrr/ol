import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticFunc {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int[] massiv = inputInteger();
        outputMassiv(massiv);
        System.out.println("Общая сумма: " + sumIntMas(massiv));
        System.out.println("Общая сумма положительных чисел: " + sumPosInt(massiv));
        System.out.println("Разница между максимальным и минимальным числом: " + differInt(massiv));
        System.out.println("Позиция числа: " + findPos(massiv, 77));
        System.out.println("Ближайшее к заданомму числу: " + findPosClose(massiv, 44));
        System.out.println("Количество элементов от width до length: " + calcElemInterval(massiv, -5, 76));

//       Scanner sc = new Scanner(System.in);
//        System.out.println("width: ");
//                int width = sc.nextInt();
//        System.out.println("length: ");
//                int length = sc.nextInt();    }
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

    public static int sumIntMas(int[] sim) {
        int sum = 0;
        int i = 0;
        while (i < sim.length) {
            sum += sim[i];
            i++;
        }
        return sum;
    }

    public static int sumPosInt(int[] spi) {
        int sum = 0;
        int pos;
        int i = 0;
        while (i < spi.length) {
            if (spi[i] > 0) {
                pos = spi[i];
                sum += pos;
            }
            i++;
        }
        return sum;
    }

    public static int findPosClose(int[] mas, int x) {
        int closestElem = mas[0];
        int num = 0;
        for (int i = 1; i < mas.length; i++) {
            if (Math.abs(mas[i] - x) <= Math.abs(closestElem - x))
                closestElem = mas[i];
            num = i;
        }
        return num;
    }

    public static int calcElemInterval(int[] mas, int x, int y) {
        if (y < x) {
            int tab = x;
            x = y;
            y = tab;
        }
        int erval = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= x && mas[i] <= y)
                erval++;

        }
        return erval;
    }

//    public static int newFiltmasByInterval(int[] mas, int x, int y) {
//        if (y < x) {
//            int tab = x;
//            x = y;
//            y = tab;
//        }
//        int finalX = x;
//        int finalY = y;
//        int[] resultmas;
//        return finalX;

    public static int findMax(int[] Max) {
        int mx = Max[0];
        int i = 0;
        while (i < Max.length) {
            if (mx < Max[i]) {
                mx = Max[i];
            }
            i++;
        }
        return mx;
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

    public static int findPos(int[] mas, int x) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == x)
                return i;
        }
        return -404;
    }

    public static int differInt(int[] dfi) {
        return findMax(dfi) - findMin(dfi);
    }
}