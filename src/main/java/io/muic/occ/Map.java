package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Map{

    public static String moveNorth(){
        return "You're at the door.";
    }
    public static void moveSouth(){
        Exam.examLevel1();

    }
    public static void moveEast() throws Exception {
        Study.getContentLevel1();

    }
    public static void moveWest(){
        License.reportCard();

    }
}
