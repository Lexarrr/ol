public class Point {
    double x, y;

    public String toString() {
        return "(" + x + " ; " + y +")";
    }
    public Point(){
        System.out.println("работает конструктор: ");
    }
    public Point(double a, double b){
        x = a;
        y = b;
        System.out.println("работает конструктор с аргументами");
    }
    public static Point parsePoint(String s){
        s = s.replace("(","").replace(")","");
        String[] cc = s.split(";");
        double x = Double.parseDouble(cc[0]);
        double y = Double.parseDouble(cc[1]);
        return new Point(x, y);
    }
}
