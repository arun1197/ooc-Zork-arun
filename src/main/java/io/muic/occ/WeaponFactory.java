package io.muic.occ;

import java.util.Set;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponFactory extends Weapon {

    public static Set<String> questionsLevel1(){
        return getQuestions(WeaponLevel1.questionsLevel1);
    }

    public static Set<String> questionsLevel2(){
        return getQuestions(WeaponLevel2.questionsLevel2);
    }

    public static Set<String> questionsLevel3(){
        return getQuestions(WeaponLevel3.questionsLevel3);
    }

    public static Set<String> questionsLevel4() { return getQuestions(WeaponLevel4.questionsLevel4); }

}
