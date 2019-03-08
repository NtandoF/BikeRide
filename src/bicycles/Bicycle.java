package bicycles;

public class Bicycle {

//    private int accelerate = 0;
//    private int brake = 0;
    private int speed;

    public void accelerate() {
        speed += 5;
    }
    public void brake (){
        speed -= 3;
    }


    public int currentSpeed(){
    return speed;
    }

    public void stop(){
    speed = 0;
    }
}


