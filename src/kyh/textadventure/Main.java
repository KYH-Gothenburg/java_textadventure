package kyh.textadventure;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[][] map = {
                {"A pink room", "A hall"},
                {"The entrance", "A dark cave"}
        };
        int row = 1;
        int col = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game (TAG)");

        boolean running = true;
        while(running) {
            System.out.println(map[row][col]);

            System.out.print("> ");
            String command = input.nextLine();

            String[] commandParts = command.split(" ");

            if(commandParts[0].equalsIgnoreCase("go")) {
                // Kolla efter riktning
                if(commandParts.length >= 2) {
                    if(commandParts[1].equalsIgnoreCase("north")) {
                        row--;
                        if(row < 0) {
                            row = 0;
                        }
                    }
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
