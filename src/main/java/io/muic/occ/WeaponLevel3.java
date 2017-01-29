package io.muic.occ;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class WeaponLevel3 {

    private static java.util.Map<String,String> questionsLevel3 = new HashMap<String,String>();

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
        return questionsLevel3.get(key);
    }

    public static Set<String> getQuestions(){
        setQuestions();
        return questionsLevel3.keySet();
    }

    private static void setQuestions() {
        questionsLevel3.put("Which Annex to the Chicago Convention covers dangerous goods carried in aircraft?\n" +
                "\tA.\tAnnex 16\n" +
                "\tB.\tAnnex 17\n" +
                "\tC.\tAnnex 18\n" +
                "\tD.\tAnnex 15", "C");
        questionsLevel3.put("What is each contracting state of ICAO required to provide?\n" +
                "\tA.\tDetails of Aerodrome Operating Minima to each operator using its airspace\n" +
                "\tB.\tModern radio navigation facilities for aeroplanes transiting its airspace\n" +
                "\tC.\tFacilities for SAR operations to be undertaken in its airspace\n" +
                "\tD.\tOceanic control facilities in oceanic areas adjacent to territorial airspace","C");
        questionsLevel3.put("For aircraft flying over the high seas, which rules shall be in force?\n" +
                "\tA.\tThe rules established by the state(s) adjacent to the high seas over flown\n" +
                "\tB.\tThe rules established by the state of the operator of the aircraft\n" +
                "\tC.\tThe rules established under the Convention of international civil aviation\n" +
                "\tD.\tThe rules established by the state of registry of the aircraft","C");
        questionsLevel3.put("The Air Navigation Commission consists of:\n" +
                "\tA.\t15 members appointed by the ICAO Council\n" +
                "\tB.\t33 members appointed by the ICAO Council\n" +
                "\tC.\t15 members appointed by the ICAO Assembly\n" +
                "\tD.\t33 members appointed by the ICAO Assembly","A");
        questionsLevel3.put("Where was the Convention on International Civil Aviation signed in 1944?\n" +
                "\tA.\tRome\n" +
                "\tB.\tMontreal\n" +
                "\tC.\tGeneva\n" +
                "\tD.\tChicago","D");
        questionsLevel3.put("A student stands with both feet on some scales in order to measure his weight.\n" +
                "\tThe reading on the scales is 500 N. \n" +
                "\tHe lifts one foot off the scales and keeps it lifted. \n" +
                "\tWhat is the new reading on the scales?\n" +
                "\tA. 0\n" +
                "\tB. 250N\n" +
                "\tC. 500N\n" +
                "\tD. 1000N","C");
        questionsLevel3.put("A child sits on a rubber ball and bounces up and down on the ground.\n" +
                "\tWhat stays the same when the ball hits the ground?\n" +
                "\tA. the acceleration of the ball\n" +
                "\tB. the mass of the ball\n" +
                "\tC. the shape of the ball\n" +
                "\tD. the velocity of the ball","B");
        questionsLevel3.put("What is Kinetic Energy?\n" +
                "\tA. moving things\n" +
                "\tB. energy possessed by an object due to its motion or movement\n" +
                "\tC. energy from space\n" +
                "\tD. None of the above","B");
        questionsLevel3.put("What is capacitor?\n" +
                "\tA. a device used to store an electric charge, consisting of one or more pairs of conductors separated by \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tan insulator.\n" +
                "\tB. a bottle\n" +
                "\tC. a watch\n" +
                "\tD. None of the above","A");
        questionsLevel3.put("The biggest passenger airplane in the world is __________.\n" +
                "\tA. B747\n" +
                "\tB. A320\n" +
                "\tC. A380\n" +
                "\tD. Antonov 225","C");
    }
}
