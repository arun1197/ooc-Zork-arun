package io.muic.occ;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App extends Score {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Welcome to Aviation School. These are the following commands to play the game. \n" +
                "n: For moving north \n" +
                "s: For moving south \n" +
                "e: For moving east \n" +
                "w: For moving west \n" +
                "quit: To quit the game \n" +
                "show: To see the items that you've collected");
        while (!quit) {
            String inputLine = input.nextLine();
            if (inputLine.equals("score")) {
                System.out.println(Score.getCount());
            }
            if (inputLine.equals("quit")) {
                quit = true;
            }
            if (inputLine.equals("n")) {
                Map.moveNorth();
                quit = false;
            }
            if(inputLine.equals("show")){
                System.out.println("Your items: "+Item.items);
            }
            if(inputLine.equals("s")){
                if(Score.getCount()<=0 && Item.items.size()==0){
                    Map.moveSouth1();
                }
                if(getCount()>=8 && Item.items.size()==1){
                    Map.moveSouth2();
                }
            }
            if(inputLine.equals("e")){
                if(getCount()<=0 && Item.items.size()==0){
                    try {
                        Map.moveEast1();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(getCount()>=8 && Item.items.size()==1){
                    try {
                        Map.moveEast2();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if(inputLine.equals("w")){
                if(getCount()<=0 && Item.items.size()==0){
                    System.out.println("Your score: "+getCount()+"/10");
                }
                if(getCount()>=8 && Item.items.size()==1){
                    try {
                        Map.moveWest2();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


