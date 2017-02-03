package io.muic.occ;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static io.muic.occ.Weapon.getQuestions;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void checkWeaponEachLevel() throws Exception{
        Weapon weapon = new Weapon();
        WeaponLevel1.setQuestions();
        WeaponLevel2.setQuestions();
        WeaponLevel3.setQuestions();
        WeaponLevel4.setQuestions();
        Set<String> ans1 = WeaponLevel1.questionsLevel1.keySet();
        Set<String> ans2 = WeaponLevel2.questionsLevel2.keySet();
        Set<String> ans3 = WeaponLevel3.questionsLevel3.keySet();
        Set<String> ans4 = WeaponLevel4.questionsLevel4.keySet();
        assertTrue(getQuestions(WeaponLevel1.questionsLevel1)==ans1);
        assertTrue(getQuestions(WeaponLevel2.questionsLevel2)==ans2);
        assertTrue(getQuestions(WeaponLevel3.questionsLevel3)==ans3);
        assertTrue(getQuestions(WeaponLevel4.questionsLevel4)==ans4);
        System.out.println("ALL OK!");

    }

    @Test
    public void checkItems(){
        Item item = new Item();
        Item.rewardLevel1();
        Item.rewardLevel2();
        List<String> ans = new ArrayList<String>();
        ans.add("report card");
        ans.add("Single-Engine License");
        ans.add("hello");
        assertTrue(item.showItem().get(0)==ans.get(0));
        assertTrue(item.showItem().get(1)==ans.get(1));
        assertFalse(item.showItem().size()==4);
        assertFalse(item.showItem().get(1)=="hello");
        System.out.println("All ok!");
    }

    @Test
    public void checkStudyContentWhenMoveEast() throws Exception {
        String ans1="---------   Welcome to General Knowledge Class   ---------\n" +
                "---------\t\t\t\t\t\t\t\t\t\t ---------\n" +
                "--------- \t\t\t\t\t\t\t\t\t\t ---------\n" +
                "The United Nations (UN) is an intergovernmental organization to promote international co-operation. \n" +
                "A replacement for the ineffective League of Nations, the organization was established \n" +
                "on 24 October 1945 after World War II in order to prevent another such conflict.\n" +
                "\n" +
                "\n" +
                "Electric charge is the physical property of matter that causes it to experience a force when placed in an electromagnetic field. \n" +
                "There are two types of electric charges: positive and negative. \n" +
                "Like charges repel and unlike attract. An object is negatively charged if it has an excess of electrons, \n" +
                "and is otherwise positively charged or uncharged. \n" +
                "The SI derived unit of electric charge is the coulomb (C).\n" +
                "\n" +
                "\n" +
                "The International Court of Justice (ICJ) is the principal judicial organ of the United Nations (UN). \n" +
                "It was established in June 1945 by the Charter of the United Nations and began work in April 1946.\n" +
                "The seat of the Court is at the Peace Palace in The Hague (Netherlands). \n" +
                "Of the six principal organs of the United Nations, \n" +
                "it is the only one not located in New York (United States of America).\n" +
                "\n" +
                "Membership of the United Nations Security Council is held by the five permanent members and ten elected, \n" +
                "non-permanent members. Prior to 1966, there were six elected members, \n" +
                "while the permanent members have in essence not changed since the creation of the United Nations in 1945, apart from the representation of China.\n" +
                "\n" +
                "The rupiah (Rp) is the official currency of Indonesia. Issued and controlled by the Bank of Indonesia, \n" +
                "the ISO 4217 currency code for the Indonesian rupiah is IDR. \n" +
                "The name \"rupiah\" is derived from the Hindustani word rupiyaa (روپیہ, रुपया), \n" +
                "ultimately from Sanskrit rupya (रूप्य; wrought silver).\n" +
                "\n" +
                "The D-8 Organization for Economic Cooperation, also known as Developing-8, \n" +
                "is an organization for development cooperation among the following countries: \n" +
                "Bangladesh, Egypt, Indonesia, Iran, Malaysia, Nigeria, Pakistan, and Turkey.\n" +
                "\n" +
                "\n" +
                "The EU has no official capital, and no plans to declare one, \n" +
                "but Brussels hosts the official seats of the European Commission, \n" +
                "Council of the European Union, and European Council, \n" +
                "as well as a seat (officially the second seat but de \n" +
                "facto the most important one) of the European Parliament.\n" +
                "\n" +
                "\n" +
                "The North Atlantic Treaty Organization, also called the North Atlantic Alliance, \n" +
                "is an intergovernmental military alliance based on the North Atlantic Treaty \n" +
                "which was signed on 4 April 1949. \n" +
                "NATO's headquarters are located in Haren, Brussels, Belgium, \n" +
                "where the Supreme Allied Commander also resides.\n" +
                "\n" +
                "*** Fun Facts ***\n" +
                "\n" +
                "The Longest wall in the world is about \t13,170.7 miles or 21,196.18 km long. The oldest university in the world is University of Bologna.";
        String ans2="---------  Welcome to Physics & Aviation Class   ---------\n" +
                "---------\t\t\t\t\t\t\t\t\t\t ---------\n" +
                "--------- \t\t\t\t\t\t\t\t\t\t ---------\n" +
                "\n" +
                "Work done in rolling is less than lifting due to a extra work has been done in lifting due to \n" +
                "gravity means against the gravity but in rolling on a inclined plane we get a work done by \n" +
                "gravity in downward direction along the gravity.\n" +
                "\n" +
                "Metals are good conductors of electricity, because they allow electric charge to flow freely \n" +
                "through them. According to BBC, metals contain a sea of delocalized \n" +
                "electrons that are able to move throughout the metal structure.\n" +
                "\n" +
                "The International Civil Aviation Organization (ICAO), \n" +
                "is a specialized agency of the United Nations. \n" +
                "It codifies the principles and techniques of international air \n" +
                "navigation and fosters the planning and development of international air \n" +
                "transport to ensure safe and orderly growth. \n" +
                "Its headquarters are located in the Quartier International of \n" +
                "Montreal, Quebec, Canada.\n" +
                "\n" +
                "An international airport is an airport that offers customs and immigration facilities \n" +
                "for passengers travelling between countries. \n" +
                "International airports are typically larger than domestic airports and \n" +
                "often feature longer runways and facilities to accommodate the heavier \n" +
                "aircraft commonly used for international and intercontinental travel. \n" +
                "International airports often also host domestic flights.\n" +
                "\n" +
                "Flaps are a type of high-lift device used to increase the lift of an aircraft \n" +
                "wing at a given airspeed. Flaps are usually mounted on the wing trailing \n" +
                "edges of a fixed-wing aircraft. Flaps are used to lower the minimum speed \n" +
                "at which the aircraft can be safely flown, and to increase the angle of descent for landing.  \n" +
                "\n" +
                "Thrust is the force which moves an aircraft through the air. \n" +
                "Thrust is used to overcome the drag of an airplane, \n" +
                "and to overcome the weight of a rocket. \n" +
                "Thrust is generated by the engines of the aircraft \n" +
                "through some kind of propulsion system.";
        String ans3="---------  Welcome to Intermediate Physics & Aviation Class   ---------\n" +
                "---------\t\t\t\t\t\t\t\t\t\t \t\t\t  ---------\n" +
                "--------- \t\t\t\t\t\t\t\t\t\t \t\t\t  ---------\n" +
                "\n" +
                "The Convention on International Civil Aviation, also known as the Chicago Convention, \n" +
                "established the International Civil Aviation Organization (ICAO), a specialized \n" +
                "agency of the UN charged with coordinating and regulating international air travel. \n" +
                "The Convention establishes rules of airspace, aircraft registration and safety, \n" +
                "and details the rights of the signatories in relation to air travel. \n" +
                "The Convention also exempts air fuels in transit from (double) taxation\n" +
                "The document was signed on December 7, 1944 in Chicago by 52 signatory states. \n" +
                "It received the requisite 26th ratification on March 5, 1947 and went into effect \n" +
                "on April 4, 1947, the same date that ICAO came into being.\n" +
                "\n" +
                "\n" +
                "Membership of the United Nations Security Council is held by the five permanent \n" +
                "members and ten elected, non-permanent members. Prior to 1966, there were six \n" +
                "elected members, while the permanent members have in essence not changed since \n" +
                "the creation of the United Nations in 1945, apart from the representation of China.\n" +
                "\n" +
                "All moving things have kinetic energy. It is energy possessed by an object due \n" +
                "to its motion or movement. These include very large things, like planets, and \n" +
                "very small ones, like atoms. The heavier a thing is, and the faster it moves, \n" +
                "the more kinetic energy it has.\n" +
                "\n" +
                "A capacitor is a passive two-terminal electrical component that stores electrical \n" +
                "energy in an electric field.The effect of a capacitor is known as capacitance. \n" +
                "While capacitance exists between any two electrical conductors of a circuit in \n" +
                "sufficiently close proximity, a capacitor is specifically designed to provide \n" +
                "and enhance this effect for a variety of practical applications by consideration \n" +
                "of size, shape, and positioning of closely spaced conductors, and the intervening \n" +
                "dielectric material.\n" +
                "\n" +
                "The Airbus A380 is a double-deck, wide-body, four-engine jet airliner manufactured \n" +
                "by European Union manufacturer Airbus. It is the world's largest passenger airliner, \n" +
                "and the airports at which it operates have upgraded facilities to accommodate it. \n" +
                "It was initially named Airbus A3XX and designed to challenge Boeing's monopoly \n" +
                "in the large-aircraft market.";
        String ans4="----  Go study on your own  ---\n" +
                "----\t\t\t\t\t\t---\n" +
                "----\t\t\t\t\t\t---\n" +
                "\n" +
                "What's coming in the EXAM?\n" +
                "\n" +
                "\n" +
                "---\t\t\t\t\t\t ---\n" +
                "--- I CANT TELL YOU THAT ---\n" +
                "---\t\t\t\t\t\t ---\n" +
                "\n" +
                "\n" +
                "---- \t\t\t\t\t\t   ----\n" +
                "---- ALL I CAN SAY IS GOODLUCK ----\n" +
                "---- \t\t\t\t\t\t   ----\n" +
                "\n" +
                "\n" +
                "---\t\t\t\t\t\t  ---\n" +
                "--- INTERNET CAN HELP YOU ---\n" +
                "---\t\t\t\t\t\t  ---";
        String check1 = Map.moveEast1();
        String check2 = Map.moveEast2();
        String check3 = Map.moveEast3();
        String check4 = Map.moveEast4();

        System.out.println(check1);
        assertTrue(check1==ans1);
        assertTrue(check2==ans2);
        assertTrue(check3==ans3);
        assertTrue(check4==ans4);
        System.out.println("All ok!");

    }

    @Test
    public void checkLicense() throws Exception{
        String empt = "";
        assertFalse(License.singleEngine()==empt);
        assertFalse(License.multiEngine()==empt);
        assertFalse(License.twinEngine()==empt);
        assertFalse(License.singleEngine()==empt);
        System.out.println("all ok!");
    }
}
