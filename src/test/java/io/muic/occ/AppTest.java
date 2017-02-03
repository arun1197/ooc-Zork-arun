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
    public void checkLicense() throws Exception{
        String empt = "";
        assertFalse(License.singleEngine()==empt);
        assertFalse(License.multiEngine()==empt);
        assertFalse(License.twinEngine()==empt);
        assertFalse(License.singleEngine()==empt);
        System.out.println("all ok!");
    }
}
