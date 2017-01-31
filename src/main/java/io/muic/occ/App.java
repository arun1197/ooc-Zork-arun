package io.muic.occ;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        boolean quit = false;
        while(!quit){
            if(inputLine.equals("n")){
                Map.moveNorth();
            }
            else if(inputLine.equals("s")){
                Map.moveSouth1();
                break;
            }
            else if(inputLine.equals("e")){
                try {
                    Map.moveEast1();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(inputLine.equals("w")){
                Map.moveWest1();
            }
            else if(inputLine.equals("quit")){
                quit = false;
            }
        }

    }
}


