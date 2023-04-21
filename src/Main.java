public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        //example4();
    }

//    private static void example4() {
//        Rect r2 = new Rect();
//        r2.width = 1;
//        r2.length = 0;
//// не явно вызывается метод toString, который у точки уже переопределен
//        System.out.println(r2);
//    }




    private static void example1() {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 0;
// не явно вызывается метод toString, который у точки уже переопределен
        System.out.println(p1);
    }

    private static void example2() {
        Point p2 = new Point(-5, -6);
        System.out.println(p2);
    }
    private static void example3() {
        Rect r1 = new Rect(3, 15);
        System.out.println(r1);
        System.out.println("Площадь: " + r1.getArea());
        System.out.println("Периметр: " + r1.getPerim());
    }
}