package io.muic.occ;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Don on 1/31/2017 AD.
 */
public class ExamMaker extends Score {
    public static int score;
    public static void examMaker(Set<String> questions, HashMap<String, String> questionMap) {
        //int score = 0;
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
                else{
                    questionNumber++;
                }
            }
        }
        System.out.println("Your score is " + score + "/10");
    }
    public static int getScore(){
        return score;
    }
}
