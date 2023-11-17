import java.util.Comparator;

public class Rectangle {

    String name;
    double width, length;

    public Rectangle (String name, double w, double l) {
        this.name = name;
        this.width = w;
        this.length = l;
    }

    public double getWidth() {
        return width;
    }
    
    public double getLength (){
        return length;
    }

    public double getPerimetr () {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

}
