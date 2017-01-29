package io.muic.occ;

import java.util.Set;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponFactory {

    public static Set<String> questionLevel1(){
        return WeaponLevel1.getQuestions();
    }

    public static Set<String> questionLevel2(){
        return WeaponLevel2.getQuestions();
    }

    public static Set<String> questionLevel3(){
        return WeaponLevel3.getQuestions();
    }

    public static Set<String> questionLevel4(){
        return WeaponLevel4.getQuestions();
    }

}
