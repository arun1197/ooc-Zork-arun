package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class License extends ReadFile {

    public static String singleEngine() throws Exception {
        return getContent("singleEngine.txt");
    }

    public static String twinEngine() throws Exception{
        return getContent("twinEngine.txt");
    }

    public static String multiEngine() throws Exception{
        return getContent("multiEngine.txt");

    }

    public static void main(String[] args) throws Exception{
        System.out.println(multiEngine());
    }
}
