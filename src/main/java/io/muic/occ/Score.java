package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Score {
    // A name for this type of simulation participant
    private String name;
    // How many of this type exist in the simulation.
    private static int count;

    public Score(String name) {
        this.name = name;
        count = 0;
    }

    public Score(){

    }

    /**
     * @return The short description of this type.
     */
    public String getName() {
        return name;
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
    public void reset() {
        count = 0;
    }
}
