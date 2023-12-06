package com.pruebas;

import java.util.Random;
import java.util.Scanner;

public class Game_rock_paper_sccisors {
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {
        // start game
        System.out.println("Vamos a jugar piedra, papel y tijeras!");
        System.out.println("Escribe 'Rock', \"Paper\", O \"Scissors\" para indicar tu seleccion. O otra cosa \"Quit\" para salir.");
        String choice = input.nextLine(); // prompt response
        choice = choice.toLowerCase(); // change to lowercase for consistency
        
        // initialize variables
        int tienum = 0;
        int winnum = 0;
        int lossnum = 0;

        while (!choice.equals("quit")) // do the following if the user does not put in "quit"
        {
            int choicenum = 0;
            if (choice.equals("rock")) // assign numbers to string
            {
                choicenum = 1;
            } else if (choice.equals("paper")) // assign numbers to string
            {
                choicenum = 2;
            } else if (choice.equals("scissors"))// assign numbers to string
            {
                choicenum = 3;
            } else // not valid responses
            {
                while (choicenum == 0) // continue while user input is still not valid
                {
                    System.out.println("Lo siento, parece que no es la entrada correcta. Intenta de nuevo.");
                    choice = input.nextLine();
                    choice = choice.toLowerCase();
                    if (choice.equals("rock")) {
                        choicenum = 1;
                    } else if (choice.equals("paper")) {
                        choicenum = 2;
                    } else if (choice.equals("scissors")) {
                        choicenum = 3;
                    } else if (choice.equals("quit"))
                        System.exit(0); // quit program
                }
            }
            int compnum = (int) (random.nextInt(3)) + 1; // computer generate random num
            // print computer choice
            if (compnum == 1)
                System.out.println("Maquina escogio piedra");
            if (compnum == 2)
                System.out.println("Maquina escogio papel");
            if (compnum == 3)
                System.out.println("Maquina escogio tijeras");

            if (choicenum == compnum) //tie cases
            {
                System.out.println("Fue un empate");
                tienum++;
            } else if (choicenum == 1 && compnum == 3) // user wins rock vs scissors
            {
                System.out.println("Ganaste!");
                winnum++;
            } else if (choicenum == 3 && compnum == 2) // user wins scissors vs paper
            {
                System.out.println("Ganaste!");
                winnum++;
            } else if (choicenum == 2 && compnum == 1) // user wins paper vs rock
            {
                System.out.println("Ganaste!");
                winnum++;
            } else // otherwise computer wins
            {
                System.out.println("Perdiste.");
                lossnum++;
            }
            System.out.println("wins:" + winnum + "\nloses:" + lossnum + "\nties:" + tienum); // print out number of
                                                                                              // wins, ties, and loses
            System.out.println("Vamos a jugar de nuevo! \n \n"); // start game again
            System.out.println("Escribe \"Rock\", \"Paper\", o \"Scissors\" para indicar tu seleccion. O otra cosa \"Quit\" para salir.");
            choice = input.nextLine(); // prompt for new user input
            choice = choice.toLowerCase();
        }
        if (choice.equals("quit")) // if user prints "quit", then quit program
            return;
    }

    public static void main(String[] args) {
        Game_rock_paper_sccisors app = new Game_rock_paper_sccisors();
        app.play();
    }
}
