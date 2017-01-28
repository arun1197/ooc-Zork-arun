package io.muic.occ;

import java.util.*;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponLevel2{

    public static java.util.Map<String,String> questionsLevel2 = new HashMap<String,String>();

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
        return questionsLevel2.get(key);
    }

    public static Set<String> getQuestions(){
        setQuestions();
        return questionsLevel2.keySet();
    }

    private static void setQuestions() {
        questionsLevel2.put("1. Radiocarbon is produced in the atmosphere as a result of\n" +
                "\tA.\tcollision between fast neutrons and nitrogen nuclei present in the atmosphere\n" +
                "\tB.\taction of ultraviolet light from the sun on atmospheric oxygen\n" +
                "\tC.\taction of solar radiations particularly cosmic rays on carbon dioxide present in the atmosphere\n" +
                "\tD.\tlightning discharge in atmosphere", "A");
        questionsLevel2.put("2. It is easier to roll a stone up a sloping road than to lift it vertical upwards because\n" +
                "\tA.\twork done in rolling is more than in lifting\n" +
                "\tB.\twork done in lifting the stone is equal to rolling it\n" +
                "\tC.\twork done in both is same but the rate of doing work is less in rolling\n" +
                "\tD.\twork done in rolling a stone is less than in lifting it","D");
        questionsLevel2.put("3. Large transformers, when used for some time, become very hot and are cooled by circulating oil. The heating of the transformer is due to\n" +
                "\tA.\tthe heating effect of current alone\n" +
                "\tB.\thysteresis loss alone\n" +
                "\tC.\tboth the heating effect of current and hysteresis loss\n" +
                "\tD.\tintense sunlight at noon","C");
        questionsLevel2.put("4. Metals are good conductors of electricity because\n" +
                "\tA.\tthey contain free electrons\n" +
                "\tB.\tthe atoms are lightly packed\n" +
                "\tC.\tthey have high melting point\n" +
                "\tD.\tAll of the above","A");
        questionsLevel2.put("5. International Civil Aviation Organization is a specialized agency of\n" +
                "\tA. United Nations Development Group\n" +
                "\tB. International Monetary Fund\n" +
                "\tC. United Nations\n" +
                "\tD. European Union","C");
        questionsLevel2.put("6. What constitutes an \"International\" airport? \n" +
                "\tA. Scheduled flights to/ from international destinations \n" +
                "\tB. Non-scheduled flights to/ from .... \n" +
                "\tC. Customs and immigration facility\n" +
                "\tD. none of the above","C");
        questionsLevel2.put("7. International Civil Aviation Organization is headquartered in\n" +
                "\tA. Canada\n" +
                "\tB. Vienna\n" +
                "\tC. Australia\n" +
                "\tD. Switzerland","A");
        questionsLevel2.put("8. International organization which defines protocols of investigation of air accidents is\n" +
                "\tA. Intergovernmental Court of Atomic Operation\n" +
                "\tB. International Court of Aviation Operations\n" +
                "\tC. International Court of Atomic Operation\n" +
                "\tD. International Civil Aviation Organization","D");
        questionsLevel2.put("9. A flap ______.\n" +
                "\tA. increases lift\n" +
                "\tB. controls the up and down motion of a plane\n" +
                "\tC. tilts the aircraft clockwise or counterclockwise\n" +
                "\tD. moves the plane right and left","A");
        questionsLevel2.put("10. Thrust is ______.\n" +
                "\tA. the force that holds a plane back\n" +
                "\tB. the force that moves a plane forward\n" +
                "\tC. the downward force on a plane\n" +
                "\tD. the upward force on a plane","B");

    }
}
