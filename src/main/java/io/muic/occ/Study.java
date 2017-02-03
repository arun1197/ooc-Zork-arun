package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Study extends ReadFile {
    public static String getContentLevel1() throws Exception{
        return getContent("studyLevel1.txt");
    }

    public static String getContentLevel2() throws Exception{
        return getContent("studyLevel2.txt");
    }

    public static String getContentLevel3() throws Exception{
        return getContent("studyLevel3.txt");
    }

    public static String getContentLevel4() throws Exception{
        return getContent("studyLevel4.txt");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getContentLevel4());
    }
}
