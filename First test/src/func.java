public class func {
    public static void main(String[] args) {
        printBiggestOfThree(6, -4.9, 9);


    }

        public static void printBiggestOfThree(double a, double b, double c){

        double max = a;
            if (max<b)
                max = b;
            if (max<c)
                max = c;
            System.out.println(max);



    }
}
