package io.muic.occ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Item extends License{

    public static List<String> items = new ArrayList<String>();

    public static List<String> showItem(){
        return items;
    }

    public static void rewardLevel1(){
        items.add("report card");
    }

    public static void rewardLevel2(){
        items.add("Single-Engine License");
    }

    public static void rewardLevel3(){
        items.add("Twin-Engine License");
    }

    public static void rewardLevel4(){
        items.add("Multi-Engine License");
    }
}
