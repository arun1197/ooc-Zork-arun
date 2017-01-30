package io.muic.occ;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends CommandParser{

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        String inputLine = scanner.nextLine();
        if (inputLine.equals(1)) {
            System.out.println("You're at the door");
        }
        if (inputLine.equals("s")) {
            Exam.examLevel1();
        }
        if (inputLine.equals("e")) {
            Study.getContentLevel1();
        }
        if (inputLine.equals("w")) {
            License.reportCard();
        }
    }
}


