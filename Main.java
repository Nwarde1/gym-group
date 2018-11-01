package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the IS147 Gym Group Gym.");
        System.out.println(" ");
        System.out.print("\t");

        //Attempt at main menu
        do {
            System.out.println("Enter any of the following number keys to continue followed by the 'Enter' key");
            System.out.printf("\t");
            System.out.println("Enter 0 to quit");
            System.out.println("----------------------------------------------------");
                //would include scanner to store user input and user id system
            System.out.println("(1) - New Member Sign Up");
                //would give them a welcome back and prompt to check previous visits or buy something
            System.out.println("(2) - Existing Member Sign In");
                //would give array of product options along with prices with running tally of adding numbers
                //and tax with a receipt when user checks out
            System.out.println("(3) - Retail");
                //would overview pricing options
            System.out.println("(4) - Physical Training Options");
            System.out.println("(5) - Fill Out Our Free FITNESS EVALUATION and get instant feedback");
                Scanner input = new Scanner(System.in);
                int route = input.nextInt();
                switch (route) {
                    case 1:
                            break;
                    case 2:
                            break;
                    case 3:
                            break;
                    case 4:
                            break;
                    case 5:
                            break;
                    default: System.out.println("Error: invalid input");
            }
        } while (false);            // ----- needs to be changed -> placeholder -----

        public static void evaluation() {
            Scanner evaluate = new Scanner(System.in);
            System.out.println("What is your age?");
                int age = evaluate.nextInt();
            System.out.println("What is your current weight? (in lbs)");
                int weight = evaluate.nextInt();
            System.out.println("How many hours of activity do you participate in weekly?");
                int actHours = evaluate.nextInt();
            System.out.println("Are you disabled?");

                boolean disabled = evaluate.nextBoolean();              //(make it so yes == true?)
            System.out.println("");
        }

    }


}

}
