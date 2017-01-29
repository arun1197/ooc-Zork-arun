package io.muic.occ;

import java.util.Scanner;
import java.util.Set;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> questions = WeaponLevel2.getQuestions();
        int index =1;
        while (index <= questions.size()) {
            for(String i: questions){
                System.out.println(index+". "+i);
                String inputLine = scanner.nextLine();
                if(WeaponLevel2.checkAnswer(i,inputLine)){
                    System.out.println("score +1");
                    index++;
                } else{
                    System.out.println("wrong answer");
                    index++;
                }
            }
        }
    }
}
