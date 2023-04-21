import java.util.ArrayList;
import java.util.Arrays;

public class Bus extends Engine{
    private static final int MAX_CAP = 101;

    private static final int MID_CAP= 50;
    private static final int MAX_SPEED = 90;

    String mark;
    int speed, capacity;

    @Override
    public void Color() {
        System.out.println("White");
    }

    @Override
    public void Mileage() {
        System.out.println(435000);
    }

    public Bus(String mark,int speed, int capacity) {
        this.mark = mark;
        this.speed = speed;
        this.capacity = capacity;
    }
    public int getSpeed() {
        if (speed < MAX_SPEED && getCapacity() < MID_CAP)
            return BoostSpeed();
        if (speed > MAX_SPEED)
            return BrakingSpeed();
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int BoostSpeed(){
        while (speed<MAX_SPEED && getCapacity() < MID_CAP)
         setSpeed(speed+20);
        return speed;
    }
    public int BrakingSpeed(){
        setSpeed(speed-20);
        return speed;
    }
    public int getCapacity() {
        if (capacity < MAX_CAP)
            return decCapacity();
        if (capacity > MAX_CAP)
            return incCapacity();
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0 && capacity <= MAX_CAP)
            this.capacity = capacity;
    }

    public int decCapacity() {
        while (capacity < MAX_CAP) {
            setCapacity(capacity + 1);
        }
        return capacity;
    }

    public int incCapacity() {
        while (capacity > MAX_CAP) {
            setCapacity(capacity - 1);
        }
        return capacity;
    }
}
