//public class Truck extends Engine {
//    private static final int MAX_W = 500;
//    private static final int MAX_SPEED = 200;
//    String mark;
//    int weight;
//    int speed;
//
//    public Truck(String mark, int weight, int speed) {
//        super(speed);
//        this.mark = mark;
//        this.weight = weight;
//
//    }
//
//    @Override
//    public void Color() {
//        System.out.println("Green");
//    }
//
//    @Override
//    public void Mileage() {
//        System.out.println(743000);
//    }
//    public int getWeight() {
//        if (weight < MAX_W)
//            return incWeight();
//        if (weight > MAX_W)
//            return decWeigth();
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        if (weight >= 0 && weight <= MAX_W)
//            this.weight = weight;
//    }
//
//    public int incWeight() {
//        setWeight(weight + 10);
//        return weight;
//    }
//
//    public int decWeigth() {
//        setWeight(weight - 100);
//        return weight;
//    }
//    public int getSpeed() {
//        if (speed < MAX_SPEED)
//            return BoostSpeed();
//        if (speed > MAX_SPEED)
//            return BrakingSpeed();
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//    public int BoostSpeed(){
//
//        setSpeed(speed+5);
//        return speed;
//    }
//    public int BrakingSpeed(){
//        setSpeed(speed-5);
//        return speed;
//    }
//
//}
