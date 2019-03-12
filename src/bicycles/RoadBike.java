package bicycles;

public class RoadBike extends BicycleBase {

//    private int speed = 0;

    public void accelerate(){
        changeSpeed(11 );
    }

    public void brake(){
        changeSpeed(4  );
    }

//    public int currentSpeed(){
//        return speed;
//    }
//
//    public void stop(){
//        speed = 0;
//    }
}
