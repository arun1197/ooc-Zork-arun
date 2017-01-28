package io.muic.occ;

import java.util.*;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponLevel4{

    public static java.util.Map<String,String> questionsLevel4 = new HashMap<String,String>();

    public static boolean checkAnswer(String key,String value){
        setQuestions();
        if (getValue(key).equals(value)){
            return true;
        }
        else{
            return false;
        }
    }

    private static String getValue(String key){
        return questionsLevel4.get(key);
    }

    public static Set<String> getQuestions(){
        setQuestions();
        return questionsLevel4.keySet();
    }

    private static void setQuestions() {
        questionsLevel4.put("1. What does FAA stand for?\n" +
                "\tA. Federal Avionics Administration\n" +
                "\tB. Federal Aviation Administration\n" +
                "\tC. Fedex Aircraft Administration", "B");
        questionsLevel4.put("2. What are the four forces of flight?\n" +
                "\tA. Air law, trust, drag, heavy\n" +
                "\tB. Crew, aircraft, luggage, passengers\n" +
                "\tC. Lift, thrust, drag, weight","C");
        questionsLevel4.put("3. Which of the following are PPL training aircraft?\n" +
                "\tA. C172, B737, DA-20\n" +
                "\tB. B757, B767, A330\n" +
                "\tC. C172, C152, DA-20","C");
        questionsLevel4.put("4. Altitude in aviation in measured in?\n" +
                "\tA. Feet\n" +
                "\tB. Meters\n" +
                "\tC. Kilometers","A");
        questionsLevel4.put("5.At what age can you receive your PPL?\n" +
                "\tA. 15\n" +
                "\tB. 14\n" +
                "\tC. 17","C");
        questionsLevel4.put("6. Select a Netherlands Antilles' aircraft registration:\n" +
                "\tA. PJ-WIM\n" +
                "\tB. N75689JB\n" +
                "\tC. F-GHW","A");
        questionsLevel4.put("7. Who is the Managing Director of Winair?\n" +
                "\tA. Mark Anderson\n" +
                "\tB. Edwin Hodge\n" +
                "\tC. Alex Hodge","B");
        questionsLevel4.put("8. Who is the Managing Director of PJIAE?\n" +
                "\tA. Edwin Hodge\n" +
                "\tB. Eugene Holiday\n" +
                "\tC. Alvin Riley","B");
        questionsLevel4.put("9. What does ICAO stand for?\n" +
                "\tA. International Civil Aviation Organization\n" +
                "\tB. Intense Civil Aviation Operations\n" +
                "\tC. Interstate Civil Aviation Organization","A");
        questionsLevel4.put("10. What type of aircraft does Winair fly?\n" +
                "\tA. Twin Otters\n" +
                "\tB. Islanders\n" +
                "\tC. Both of the above","C");

    }

}
