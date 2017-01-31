package io.muic.occ;

import java.util.*;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Weapon {
    public static boolean checkAnswer(HashMap<String,String> questions,String key,String value){
        if (getValue(questions,key).equals(value)){
            return true;
        }
        else{
            return false;
        }
    }

    private static String getValue(HashMap<String,String> questions,String key){
        return questions.get(key);
    }

    public static Set<String> getQuestions(HashMap<String,String> questions){
        return questions.keySet();
    }


}
