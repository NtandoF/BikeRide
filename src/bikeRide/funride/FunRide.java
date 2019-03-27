package bikeRide.funride;


import bikeRide.Bicycle;
import bikeRide.BicycleType;

import java.util.ArrayList;


public class FunRide {

    private ArrayList<Bicycle> bikeList = new ArrayList<Bicycle>();
    private int maxBikeCount = 0;


    public FunRide(int max) {
        this.maxBikeCount = max;

    }

    public void accept(Bicycle bicycle) {
       int count = 0;
        if (maxBikeCount > bikeList.size()) {
            bikeList.add(bicycle);
            count++;
            System.out.println("Accepted " + count);
        } else {
            System.out.println("Rejected");
        }
    }

    public int getCountForType(BicycleType bicycle) {
        int count = 0;
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