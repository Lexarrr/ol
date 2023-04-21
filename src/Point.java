public class Point {
    double x, y;

    public String toString() {
        return "(" + x + " ; " + y + ")";
    }
    public Point(){
        System.out.println("работает конструктор: ");
    }
    public Point(double a, double b){
        x = a;
        y = b;
        System.out.println("работает конструктор с аргументами");
    }
}
