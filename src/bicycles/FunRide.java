package bicycles;


import java.util.ArrayList;


public class FunRide {

    private ArrayList<Bicycle> List = new ArrayList<Bicycle>();
    private int maxBikeCount = 0;
    private int count = 0;

    public FunRide(int max) {
        this.maxBikeCount = max;

    }

    public void accept(Bicycle bicycle) {

        if (count < maxBikeCount) {
            List.add(bicycle);
            count++;
            System.out.println("Accepted " + count);
        } else {
            System.out.println("Rejected");
        }
    }

    public int getCountForType(BicycleType bicycle) {
        count = 0;
        for (int x = 0; x < List.size(); x++) {

            if (List.get(x).BicycleType() == bicycle) {
                count++;
//                System.out.println(count);
            }
        }
        return count;
    }
}
//
//    public int getEnteredCount(){
//        return this.List.size();
//    }
