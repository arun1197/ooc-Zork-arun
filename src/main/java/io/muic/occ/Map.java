package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Map {

    public static void moveNorth() {
        System.out.println("You're at the door.");
    }

    public static void moveSouth1() {
        Monster.attackLevel1();
    }

    public static void moveSouth2() {
        Monster.attackLevel2();
    }

    public static void moveSouth3() {
        Monster.attackLevel3();
    }

    public static void moveSouth4() {
        Monster.attackLevel4();
    }

    public static String moveEast1() throws Exception {
        System.out.println(Study.getContentLevel1());
        return null;
    }

    public static String moveEast2() throws Exception {
        System.out.println(Study.getContentLevel2());
        return null;
    }

    public static String moveEast3() throws Exception {
        System.out.println(Study.getContentLevel3());
        return null;
    }

    public static String moveEast4() throws Exception {
        System.out.println(Study.getContentLevel4());
        return null;
    }
//    public static void moveWest1(){
//        Item.items.add("report card");
//    }

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
