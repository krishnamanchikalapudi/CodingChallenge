package solutions.hackerrank.prepkit1week;

import java.util.List;

/**
 * Suppose there is a circle. There are N petrol pumps on that circle. Petrol pumps are numbered 0 to (N-1) (both inclusive). You have two pieces of information corresponding to each of the petrol pummp
 * 1. the amount of petrol that particular petrol pump will give, and
 * 2. the distance from that petrol pump to the next petrol pump.
 * 
 * Initially, you have a tank of infinite capacity carrying no petrol. You can start the tour at any of the petrol pumps. Calculate the first point from where the truck will be able to complete the circle. Consider that the truck will move 1km for each liter of the petrol.
 * Input format:
 * 1. The first line will contain the value of N.
 * 2. the next N lines will contain a pair of integers each, i.e. the amount of petrol that petrol pump will give and the distance between that petrol pump and the next petrol pump.
 * 
 * Example:
 * input: [[1, 5],[10, 3], [3, 4]]
 * output: 1
 */
public class TruckTour {
   
   /**
    * PSEUDO CODE video:

    * @param petrolPumps
    * @return
    */ 
    public int solution(List<List<Integer>> petrolPumps) {
        int result = 0, fuel = 0, n=petrolPumps.size();
        for (int i=0; i<n; i++) {
            int amtPetrol = petrolPumps.get(i).get(0);
            int distance = petrolPumps.get(i).get(1);
            fuel += (amtPetrol - distance);
            if (fuel < 0) {
                result = i+1;
                fuel=0;
            } // if

        } // for: i

        return result;
    }
}
