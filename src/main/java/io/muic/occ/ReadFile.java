package io.muic.occ;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Don on 1/29/2017 AD.
 */
public class ReadFile {

    private static File makeFile(String filename){
        File file = new File(Expanduser.expanduser()+"/Desktop/ooc-Zork-arun/src/main/java/io/muic/occ/txt/"+filename);
        return file;
    }

    private static Scanner scanFile(String filename) throws Exception{
        return new Scanner(makeFile(filename)).useDelimiter("\\Z");
    }

    public static String getContent(String filename) throws Exception{
        return scanFile(filename).next();
    }
}
