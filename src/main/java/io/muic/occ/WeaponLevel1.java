package io.muic.occ;

import java.util.HashMap;

/**
 * Created by Don on 1/27/2017 AD.
 */
public abstract class WeaponLevel1 extends Weapon {

    public static HashMap<String, String> questionsLevel1 = new HashMap<String,String>();

    public static void setQuestions() {
        questionsLevel1.put("The United Nations was founded on\n" +
                "\tA. March 24, 1945\n" +
                "\tB. October 24, 1945\n" +
                "\tC. March 24, 1945\n" +
                "\tD. October 24, 1950", "B");
        questionsLevel1.put("The SI united of charge is __________.\n" +
                "\tA. Ampere\n" +
                "\tB. Coulomb\n" +
                "\tC. Ohm\n" +
                "\tD. Volt","B");
        questionsLevel1.put("The International Court of Justice is located in\n" +
                "\tA. New York\n" +
                "\tB. Washington\n" +
                "\tC. Geneva\n" +
                "\tD. The Hague","D");
        questionsLevel1.put("The Great Wall of China is about __________ KM \t\tlong.\n" +
                "\tA. 18,196\n" +
                "\tB. 19,196\n" +
                "\tC. 20,196\n" +
                "\tD. 21,196","D");
        questionsLevel1.put("The oldest university in the world is \n" +
                "\tA. Cambridge University\n" +
                "\tB. Oxford University\n" +
                "\tC. University of Bologna\n" +
                "\tD. University of Warwick","C");
        questionsLevel1.put("The are ___________ non-permanent members of the \tsecuity council.\n" +
                "\tA. 5\n" +
                "\tB. 7\n" +
                "\tC. 10\n" +
                "\tD. 15","C");
        questionsLevel1.put("The currency of Indonesia is __________.\n" +
                "\tA. rupiah\n" +
                "\tB. dinar\n" +
                "\tC. rangit\n" +
                "\tD. riyal","A");
        questionsLevel1.put("The D-8 is an organization of eight ________ \t\tcountries.\n" +
                "\tA. developed\n" +
                "\tB. developing\n" +
                "\tC. Asian\n" +
                "\tD. African","B");
        questionsLevel1.put("The European Union's working capital is in _____.\n" +
                "\tA. London\n" +
                "\tB. Lisbon\n" +
                "\tC. Austria\n" +
                "\tD. Brussels","D");
        questionsLevel1.put("The headquarter of NATO is located in _______.\n" +
                "\tA. New York\n" +
                "\tB. Paris\n" +
                "\tC. Brussels\n" +
                "\tD. Geneva","C");

    }
}
