package io.muic.occ;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponLevel1 {

    public static Map<String,String> questions = new HashMap<String,String>();

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
        return questions.get(key);
    }

    public static Set<String> getQuestions(){
        setQuestions();
        return questions.keySet();
    }

    private static void setQuestions() {
        questions.put("1. The United Nations was founded on\n" +
                "\tA. March 24, 1945\n" +
                "\tB. October 24, 1945\n" +
                "\tC. March 24, 1945\n" +
                "\tD. October 24, 1950", "B");
        questions.put("2. The SI united of charge is __________.\n" +
                "\tA. Ampere\n" +
                "\tB. Coulomb\n" +
                "\tC. Ohm\n" +
                "\tD. Volt","B");
        questions.put("3. The International Court of Justice is located in\n" +
                "\tA. New York\n" +
                "\tB. Washington\n" +
                "\tC. Geneva\n" +
                "\tD. The Hague","D");
        questions.put("4. The Great Wall of China is about __________ KM \t\tlong.\n" +
                "\tA. 18,196\n" +
                "\tB. 19,196\n" +
                "\tC. 20,196\n" +
                "\tD. 21,196","D");
        questions.put("5. The oldest university in the world is \n" +
                "\tA. Cambridge University\n" +
                "\tB. Oxford University\n" +
                "\tC. University of Bologna\n" +
                "\tD. University of Warwick","C");
        questions.put("6. The are ___________ non-permanent members of the \tsecuity council.\n" +
                "\tA. 5\n" +
                "\tB. 7\n" +
                "\tC. 10\n" +
                "\tD. 15","C");
        questions.put("7. The currency of Indonesia is __________.\n" +
                "\tA. rupiah\n" +
                "\tB. dinar\n" +
                "\tC. rangit\n" +
                "\tD. riyal","A");
        questions.put("8. The D-8 is an organization of eight ________ \t\tcountries.\n" +
                "\tA. developed\n" +
                "\tB. developing\n" +
                "\tC. Asian\n" +
                "\tD. African","B");
        questions.put("9. The European Union's working capital is in _____.\n" +
                "\tA. London\n" +
                "\tB. Lisbon\n" +
                "\tC. Austria\n" +
                "\tD. Brussels","D");
        questions.put("10. The headquarter of NATO is located in _______.\n" +
                "\tA. New York\n" +
                "\tB. Paris\n" +
                "\tC. Brussels\n" +
                "\tD. Geneva","C");

    }
}
