package io.muic.occ;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Don on 1/31/2017 AD.
 */
public class ExamMaker extends Score {
    public static void examMaker(Set<String> questions, HashMap<String, String> questionMap) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        int questionNumber = 1;
        while (questionNumber <= questions.size()) {
            for (String i : questions) {
                System.out.println(questionNumber + ". " + i);
                String inputLine = scanner.nextLine();
                if (Weapon.checkAnswer(questionMap, i, inputLine)) {
                    questionNumber++;
                    score++;
                    increment();
                }
                if(!Weapon.checkAnswer(questionMap, i, inputLine)){
                    questionNumber++;
                }
                if(score>=8 && !Item.items.contains("report card")){
                    Item.items.add("report card");
                }
                if(Score.getCount()>=17 && score>=9 && !Item.items.contains("single engine")){
                    Item.items.add("single engine");
                }
                if(Score.getCount()>=26 && score>=9 && !Item.items.contains("twin engine")){
                    Item.items.add("twin engine");
                }
                if(Score.getCount()>=36 && score==10 && !Item.items.contains("multi engine")){
                    Item.items.add("multi engine");
                }
            }
        }
        System.out.println("Your score is " + score + "/10");
    }
}
