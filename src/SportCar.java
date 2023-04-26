public class SportCar extends Engine {
    private static final int MAX_SPEED = 369;

    String mark;
    String color;
    int Mileage;

    public SportCar(String mark, int speed, String color, int mileage) {
        super(speed);
        this.mark = mark;
        this.color = color;
        Mileage = mileage;
    }

    public int getMileage() {
        return Mileage;
    }
    public void setMileage(int mileage) {
        Mileage = mileage;
    }

    public int increaseMileage() {

        return 0;
    }
}
