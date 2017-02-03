package io.muic.occ;

import java.util.Scanner;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class CommandParser extends Score{
    public static void parser(){
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Welcome to Aviation School. These are the following commands to play the game. \n" +
                "move north: For moving north \n" +
                "move south: For moving south \n" +
                "move east: For moving east \n" +
                "move west: For moving west \n" +
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
            if(inputLine.equals("show")){
                System.out.println("Your items: "+Item.showItem());
            }
            if (inputLine.equals("move north")) {
                if(Score.getCount()<=0 && Item.items.size()==0){
//                    System.out.println("MOVING NORTH");
                    Map.moveNorth();
                    System.out.println("This is LEVEL 1");
                }
                if(getCount()>=8 && Item.items.size()==1){
//                    System.out.println("MOVING NORTH");
                    Map.moveNorth();
                    System.out.println("This is LEVEL 2");
                }
                if(getCount()>=17 && Item.items.size()==2){
//                    System.out.println("MOVING NORTH");
                    Map.moveNorth();
                    System.out.println("This is LEVEL 3");
                }
                if(getCount()>=26 && Item.items.size()==3){
//                    System.out.println("MOVING NORTH");
                    Map.moveNorth();
                    System.out.println("This is LEVEL 4");
                }
                quit = false;
            }
            if(inputLine.equals("move south")){
                if(Score.getCount()<=0 && Item.items.size()==0){
//                    System.out.println("MOVING SOUTH");
                    Map.moveSouth1();
                }
                if(getCount()>=8 && Item.items.size()==1){
//                    System.out.println("MOVING SOUTH");
                    Map.moveSouth2();
                }
                if(getCount()>=17 && Item.items.size()==2){
//                    System.out.println("MOVING SOUTH");
                    Map.moveSouth3();
                }
                if(getCount()>=26 && Item.items.size()==3){
//                    System.out.println("MOVING SOUTH");
                    Map.moveSouth4();
                }
            }
            if(inputLine.equals("move east")){
                if(getCount()<=0 && Item.items.size()==0){
                    try {
//                        System.out.println("MOVING EAST");
                        Map.moveEast1();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(getCount()>=8 && Item.items.size()==1){
                    try {
                        System.out.println("MOVING EAST");
                        Map.moveEast2();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(getCount()>=17 && Item.items.size()==2){
                    try {
//                        System.out.println("MOVING EAST");
                        Map.moveEast3();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(getCount()>=26 && Item.items.size()==3){
                    try {
//                        System.out.println("MOVING EAST");
                        Map.moveEast4();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if(inputLine.equals("move west")){
                if(getCount()<=0 && Item.items.size()==0){
                    System.out.println("Your score: "+getCount()+"/10");
                }
                if(getCount()>=8 && Item.items.size()==0){
                    System.out.println("ITEM COLLECTED");
                    Item.rewardLevel1();
                }
                if(getCount()>=17 && Item.items.size()==1){
                    System.out.println("ITEM COLLECTED");
                    try {
                        System.out.println(License.singleEngine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Item.rewardLevel2();

                }
                if(getCount()>=26 && Item.items.size()==2){
                    System.out.println("ITEM COLLECTED");
                    try {
                        System.out.println(License.twinEngine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Item.rewardLevel3();
                }
                if(getCount()>=36 && Item.items.size()==3){
                    System.out.println("ITEM COLLECTED");
                    try {
                        System.out.println(License.multiEngine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Item.rewardLevel4();
                }
                if(getCount()>=8 && Item.items.size()==1){
                    try {
//                        System.out.println("MOVING WEST");
                        Map.moveWest2();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(getCount()>=17 && Item.items.size()==2){
                    try {
//                        System.out.println("MOVING WEST");
                        Map.moveWest3();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(getCount()>=26 && Item.items.size()==3){
                    try {
//                        System.out.println("MOVING WEST");
                        Map.moveWest4();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
