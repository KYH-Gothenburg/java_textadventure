package kyh.textadventure;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game (TAG)");

        boolean running = true;
        while(running) {
            System.out.println("You are standing in a dark room. You can hear bats flying above you");

            System.out.print("> ");
            String command = input.nextLine();
            String[] commandParts = command.split(" ");
            if(commandParts[0].equalsIgnoreCase("go")) {
                // Kolla efter riktning
                if(commandParts.length >= 2) {
                    System.out.println("Going " + commandParts[1]);
                }
                else {
                    System.out.println("You can't go without any direction");
                }
            }

            if(command.equalsIgnoreCase("quit")) {
                running = false;
            }
        }
        System.out.println("Thanks for playing TAG");
    }
}
