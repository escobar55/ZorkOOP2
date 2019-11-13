import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int option = 0;
        //Room roomOne = new Room("the foyer room #1","a dead scorpion");
        //Room roomTwo = new Room("the front room #2", "a piano");
        Room roomThree = new Room("the library room #3", "spiders");
        Room roomFour = new Room("the kitchen room #4", "bats");
        Room roomFive = new Room("the dining room #5", "some dust and an empty box");
        Room roomSix = new Room("the vault room #6", "3 walking skeletons");
        Room roomSeven = new Room("the parlor room #7", "a treasure chest");
        Room roomEight = new Room("the secret room #8", "piles of gold");
        roomOne();
        if(option == 2){
            option = roomTwo();
        }
    }

    public static int roomOne(){
        Scanner key = new Scanner(System.in);
        Room roomOne = new Room("the foyer room #1","a dead scorpion");
        roomOne.message();
        int option = 0;
        System.out.println("You can go North (N), or Quit (Q).");
        String answer = key.nextLine();
        if (answer.equalsIgnoreCase("n")) {
            option = 2;  // will call method roomTwo from inside main()
        } else if (answer.equalsIgnoreCase("q")) {
           option =  0;
        } else {
            System.out.println("Please enter a valid choice (N:North, Q:Quit): ");
        }

        return option;
    }

    public static int roomTwo(){
        Room roomTwo = new Room("the front room #2", "a piano");
        roomTwo.message();
        int option = 0;
        Scanner key = new Scanner(System.in);
        System.out.println("You can go South (S), West (W), East (E), or Quit (Q).");
        String answer = key.nextLine();
        if (answer.equalsIgnoreCase("s")) {
            option = 1;  // will call method roomOne from inside main()
        } else if(answer.equalsIgnoreCase("w")){
            option = 3; // will call method roomThree from inside main()
        } else if(answer.equalsIgnoreCase("e")){
            option =  4; // will call method roomFour from inside main()
        } else if (answer.equalsIgnoreCase("q")) {
            option=  0;
        } else {
            System.out.println("Please enter a valid choice (S:South, W:West, E:East, Q:Quit): ");
        }
        return option;
    }

}

/*

/Welcome room
        roomOne.message();
        System.out.println("You can go North (N), or Quit (Q).");
        String choice = key.nextLine();

     //end while




while(true) {
           if (choice.equalsIgnoreCase("n")) {
               roomTwo.message();
               System.out.println("You can go South (S), West (W), East (E), or Quit (Q).");
               choice = key.nextLine();
               if(choice.equalsIgnoreCase("s")){
                   roomOne.message();
               }
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
           }



           else if (choice.equalsIgnoreCase("q")) {
               System.out.println("Ok, Goodbye!");
               break;
           }

       }

 */
