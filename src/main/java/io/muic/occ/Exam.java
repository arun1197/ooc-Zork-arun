package io.muic.occ;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Exam extends ExamMaker {

    public static void examLevel1(){
        WeaponLevel1.setQuestions();
        examMaker(WeaponFactory.questionsLevel1(),WeaponLevel1.questionsLevel1);
    }

    public static void examLevel2(){
        WeaponLevel2.setQuestions();
        examMaker(WeaponFactory.questionsLevel2(),WeaponLevel2.questionsLevel2);
    }

    public static void examLevel3(){
        WeaponLevel3.setQuestions();
        examMaker(WeaponFactory.questionsLevel3(),WeaponLevel3.questionsLevel3);
    }

    public static void examLevel4(){
        WeaponLevel4.setQuestions();
        examMaker(WeaponFactory.questionsLevel4(),WeaponLevel4.questionsLevel4);
    }
}
