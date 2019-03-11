package bicycles;

public class RoadBike implements Bicycle {

    private int speed = 0;

    public void accelerate(){
        speed += 11;
    }

    public void brake(){
        speed -= 4;
    }

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed = 0;
    }
}
