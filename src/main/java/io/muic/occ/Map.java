package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Map {

    public static String moveNorth() {
        return "You're at the door.";
    }

    public static void moveSouth1() {
        Monster.examLevel1();
    }
    public static void moveSouth2(){
        Monster.examLevel2();
    }
    public static void moveSouth3(){
        Monster.examLevel3();
    }
    public static void moveSouth4(){
        Monster.examLevel4();
    }

    public static void moveEast1() throws Exception {
        System.out.println(Study.getContentLevel1());
    }
    public static void moveEast2() throws Exception {
        System.out.println(Study.getContentLevel2());
    }
    public static void moveEast3() throws Exception {
        System.out.println(Study.getContentLevel3());
    }
    public static void moveEast4() throws Exception {
        System.out.println(Study.getContentLevel4());
    }

    public static void moveWest1() {
        License.reportCard();
    }
    public static void moveWest2() throws Exception {
        License.singleEngine();
    }
    public static void moveWest3() throws Exception {
        License.twinEngine();
    }
    public static void moveWest4() throws Exception {
        License.multiEngine();
    }

}
