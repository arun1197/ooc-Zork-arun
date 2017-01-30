package io.muic.occ;

import org.apache.commons.cli.Options;

/**
 * Created by Don on 1/27/2017 AD.
 */
public class CommandParser extends Item {
    public static Options options;

    public void addOptions(){
        options.addOption("start",false,"Welcome to Aviation game. Here are the instructions; Press n or N to go North" +
                "Press s or S to go South, Press w or W to go West, Press e or E to go East");
        options.addOption("n",false,"You're moving north");
        options.addOption("s",false,"You're moving south");
        options.addOption("w",false,"You're moving west");
        options.addOption("e",false,"You're moving east");
        options.addOption("show",false,"Here are your items");
        options.addOption("quit",false,"You've quit the game");
    }

    public static void doSomething() throws Exception {

        if(options.hasOption("start")){
            System.out.println("Welcome, press N to enter");

        }
        if(options.hasOption("n")){
            Map.moveNorth();

        }
        if(options.hasOption("s")){
            Map.moveSouth();

        }
        if(options.hasOption("w")){
            Map.moveWest();
        }
        if(options.hasOption("e")){
            Map.moveEast();

        }
        if(options.hasOption("show")){
            showItem();
        }
        if(options.hasOption("quit")){
            System.exit(0);
        }
    }
}
