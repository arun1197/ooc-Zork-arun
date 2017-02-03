package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Score {

    // How many of this type exist in the simulation.
    private static int count;

    public Score(){

    }
    /**
     * @return The current count for this type.
     */
    public static int getCount() {
        return count;
    }

    /**
     * Increment the current count by one.
     */
    public static void increment() {
        count++;
    }

    /**
     * Reset the current count to zero.
     */
//    public void reset() {
//        count = 0;
//    }
}
