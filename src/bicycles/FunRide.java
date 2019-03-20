package bicycles;


import java.util.ArrayList;


public class FunRide {

    private ArrayList<Bicycle> bikeList = new ArrayList<Bicycle>();
    private int maxBikeCount = 0;
    private int count = 0;

    public FunRide(int max) {
        this.maxBikeCount = max;

    }

    public void accept(Bicycle bicycle) {

        if (count < maxBikeCount) {
            bikeList.add(bicycle);
            count++;
            System.out.println("Accepted " + count);
        } else {
            System.out.println("Rejected");
        }
    }

    public int getCountForType(BicycleType bicycle) {
        count = 0;
        for (Bicycle bike : bikeList) {
            System.out.println();
            //}
            if (bike.BicycleType() == bicycle) {
                count++;

            }
        }
        return count;
    }

    //
    public int getEnteredCount() {
        return this.bikeList.size();
    }
}