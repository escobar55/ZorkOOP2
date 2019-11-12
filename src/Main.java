import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        Room roomOne = new Room("the foyer room","a dead scorpion");
        Room roomTwo = new Room("the front room", "a piano");
        Room roomThree = new Room("the library room", "spiders");
        Room roomFour = new Room("the kitchen room", "bats");
        Room roomFive = new Room("the dining room", "some dust and an empty box");
        Room roomSix = new Room("the vault room", "3 walking skeletons");
        Room roomSeven = new Room("the parlor room", "a treasure chest");
        Room roomEight = new Room("the secret room", "piles of gold");

        //Welcome room
        roomOne.message();
        System.out.println("You can go North (N), or Quit (Q).");
        String choice = key.nextLine();

       while(true) {
           if (choice.equalsIgnoreCase("n")) {
               roomTwo.message();
               System.out.println("You can go South (S), West (W), East (E), or Quit (Q).");
               choice = key.nextLine();
           }

           if (choice.equalsIgnoreCase("s")) {
               roomOne.message();
               System.out.println("You can go North (N), or Quit (Q).");
               choice = key.nextLine();
           }

           if (choice.equalsIgnoreCase("w")) {
               roomThree.message();
               System.out.println("You can go North (N), East (E), or Quit (Q).");
               choice = key.nextLine();
           }

           if (choice.equalsIgnoreCase("e")) {
               roomFour.message();
               System.out.println("You can go West (W), North (N), or Quit (Q).");
               choice = key.nextLine();

           } else if (choice.equalsIgnoreCase("q")) {
               System.out.println("Ok, Goodbye!");
               break;
           }

       }//end while

    }
}
