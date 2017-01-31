package io.muic.occ;

import java.util.Set;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponFactory {

    public static Set<String> questionsLevel1(){
        WeaponLevel1.setQuestions();
        return WeaponLevel1.getQuestions(WeaponLevel1.questionsLevel1);
    }

    public static Set<String> questionsLevel2(){
        WeaponLevel2.setQuestions();
        return WeaponLevel2.getQuestions(WeaponLevel2.questionsLevel2);
    }

    public static Set<String> questionsLevel3(){
        WeaponLevel3.setQuestions();
        return WeaponLevel3.getQuestions(WeaponLevel3.questionsLevel3);
    }

    public static Set<String> questionsLevel4(){
        WeaponLevel4.setQuestions();
        return WeaponLevel4.getQuestions(WeaponLevel4.questionsLevel4);
    }

}
