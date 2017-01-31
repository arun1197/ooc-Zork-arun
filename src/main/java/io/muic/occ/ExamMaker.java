package io.muic.occ;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Don on 1/31/2017 AD.
 */
public class ExamMaker {
    public static void examMaker(Set<String> questions, HashMap<String, String> questionMap) {
        Scanner scanner = new Scanner(System.in);
        int index = 1;
        while (index <= questions.size()) {
            for (String i : questions) {
                System.out.println(index + ". " + i);
                String inputLine = scanner.nextLine();
                if (Weapon.checkAnswer(questionMap, i, inputLine)) {
                    System.out.println("score +1");
                    index++;
                } else {
                    System.out.println("wrong answer");
                    index++;
                }
            }
        }
    }
}
