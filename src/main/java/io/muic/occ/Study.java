package io.muic.occ;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Study {
    private static File makeFile(String filename){
        File file = new File(Expanduser.expanduser()+"/Desktop/MUIC/Object Oriented Design and Methodology ICCS330/Homework/Homework2-3/ooc-Zork-arun/src/main/java/io/muic/occ/"+filename);
        return file;
    }

    private static Scanner scanFile(String filename) throws Exception{
        return new Scanner(makeFile(filename)).useDelimiter("\\Z");
    }

    private static String getContent(String filename) throws Exception{
        return scanFile(filename).next();
    }

    public static String getContentLevel1() throws Exception{
        return getContent("studyLevel1.txt");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.home"));
        System.out.println(getContentLevel1());
    }
}
