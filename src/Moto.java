//public class Moto extends Engine{
//    private static final int MAX_SPEED = 240;
//    String mark;
//    int speed, boost, braking;
//
//    @Override
//    public void Color() {
//        System.out.println("Red");
//    }
//
//    @Override
//    public void Mileage() {
//        System.out.println(8000);
//    }
//
//    public Moto(String mark, int speed, int boost, int braking) {
//        super();
//        this.mark = mark;
//        this.speed = speed;
//        this.boost = boost;
//        this.braking = braking;
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
//        setSpeed(speed+20);
//        return speed;
//    }
//    public int BrakingSpeed(){
//        setSpeed(speed-20);
//        return speed;
//    }
//}
