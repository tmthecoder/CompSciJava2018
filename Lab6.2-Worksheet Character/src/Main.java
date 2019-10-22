/****
 * Name: Tejas Mehta
 * Date: February 8, 2019
 * Lab Name: Lab6.2-Worksheet Character
 * Extra: Asked teh user for a clue instead of having one by default
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner and start loop
        while (true) {
            System.out.println("Enter your choice of lab(1-3) or any other key to quit");
            //Ask for choice
            String choice = in.nextLine();
            switch (choice) {
                //Check choice
                case "1":
                    char prim1 = 's';
                    char prim2 = 'h';
                    char prim3 = 'p';
                    char prim4 = 'i';
                    //Declare chars and print string
                    prim1 = Character.toUpperCase(prim1);
                    prim2 = Character.toUpperCase(prim2);
                    prim3 = Character.toUpperCase(prim3);
                    prim4 = Character.toUpperCase(prim4);
                    System.out.println(prim1 + "." + prim2 + ". is a " + prim3 + "." + prim4 + ".");
                    System.out.println("Sherlock Homes of course!");
                    break;
                case "2":
                    System.out.println("If you enter the right clue, you will get the right answer");
                    //Ask for a clue and print respectively if its uppercase or not
                    char characterClue = in.next().charAt(0);
                    if (Character.isUpperCase(characterClue)) {
                        System.out.println("Clue: 22 Baker Street");
                    } else {
                        System.out.println("This could be a trap!");
                    }
                    break;
                case "3" :
                    System.out.println("Enter your first initial");
                    //Ask for the initial and check if its alphabetic
                    char initial = in.nextLine().charAt(0);
                    if (Character.isAlphabetic(initial)){
                        System.out.println(initial + ". is a P. I.");
                    } else {
                        System.out.println("Error, you didn't enter a letter!");
                    }
                default:
                    //Exit the program
                    System.exit(0);
            }
        }
    }
}
