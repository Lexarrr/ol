public abstract class Engine {
    private static final int MAX_SPEED = 280;
    public Engine(int speed) {
        while (speed < MAX_SPEED) {
            speed += 30;
            if (speed > MAX_SPEED)
                while (speed > MAX_SPEED) {
                    speed -= 30;
                }
        }
    }
}

//    public abstract void Color();
//    public abstract void Mileage();
//}
