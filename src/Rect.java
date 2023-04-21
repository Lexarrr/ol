public class Rect {
    double width, length;

    public String toString() {
        return "length: " + width + "; " + "Width: " + length + ";";
    }

    public Rect() {

        System.out.println("работает конструктор(без аргументов): ");
    }

    public Rect(double l, double w) {
        if (w > 0)
            width = l;
        if (l > 0)
            length = w;
        System.out.println("работает конструктор с аргументами: ");
    }

    public double getArea() {
        return width * length;
    }

    public double getPerim() {
        return 2 * (width + length);
    }
}

