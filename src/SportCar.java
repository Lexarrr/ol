public class SportCar extends Engine{
    private static final int MAX_SPEED = 369;

    String mark;
    int speed;

    @Override
    public void Color() {
        System.out.println("Purple");
    }

    @Override
    public void Mileage() {
        System.out.println(600000);
    }

    public SportCar(String mark, int speed) {
        this.mark = mark;
        this.speed = speed;
    }
    public int getSpeed() {
        if (speed < MAX_SPEED)
            return BoostSpeed();
        if (speed > MAX_SPEED)
            return BrakingSpeed();
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int BoostSpeed(){

        setSpeed(speed+30);
        return speed;
    }
    public int BrakingSpeed(){
        setSpeed(speed-30);
        return speed;
    }
}
