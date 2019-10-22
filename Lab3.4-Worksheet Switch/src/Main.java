import java.util.Scanner;

/****
 * Name: Tejas Mehta
 * Lab Name: Lab3.4-Worksheet String
 * Date: October 25, 2018
 * Extras: My extra was allowing the user to enter any number grade as well as letters to give the output respectively. I also added many parameters so that the program doesnt crash
 */

public class Main {


    public static void main(String[] args) {
        //make scanner
        Scanner in = new Scanner(System.in);
        boolean running = true;
        //set running and start loop
        while (running) {
            //ask them to pick a lab part
            System.out.println("Pick a Lab Option(1-3) or press any other key to stop");
            String labChoice = in.nextLine();
            //check which lab was picked
            switch (labChoice) {

                case "1":
                    //Ask which channel they like
                    System.out.println("In this town, there are 5 non-cable TV channels.\n" +
                            "Which non-cable channel is your favorite (2, 4, 6, 8, 11)?");
                    String channelNum = in.nextLine();
                    if (channelNum.matches("[0-9]+")) {
                        //print respective output
                        switch (channelNum) {
                            case "2":
                                System.out.println("Channel 2 got top ratings last week!");
                                break;
                            case "4":
                                System.out.println("Channel 4 shows primarily news!");
                                break;
                            case "6":
                                System.out.println("Channel 6 shows old movies!");
                                break;
                            case "8":
                                System.out.println("Channel 8 covers local events!");
                                break;
                            case "11":
                                System.out.println("Channel 11 is public broadcasting!");
                                break;
                            default:
                                System.out.println("That channel does not exist. It must be a cable channel.");
                                break;

                        }
                    }
                    break;
                case "2":
                    //Ask for letter or number grade
                    System.out.println("Enter Your Letter or Number Grade");
                    String grade = in.nextLine();
                    //Check if it is a number
                    if (grade.matches("[0-9]+")) {
                        //Get which range it should be in and print out respectively
                        if (Integer.parseInt(grade) >= 90) {
                            System.out.println("Your work is outstanding!");
                        } else if (Integer.parseInt(grade) <90 && Integer.parseInt(grade) >= 80) {
                            System.out.println("You are doing good work!");
                        } else if (Integer.parseInt(grade) <80 && Integer.parseInt(grade) >= 70) {
                            System.out.println("Your work is satisfactory.");
                        } else if (Integer.parseInt(grade) <70 && Integer.parseInt(grade) >= 60) {
                            System.out.println("You need to work a little harder.");
                        } else {
                            System.out.println("Please see me for extra help!");
                        }
                    } else {
                        //Switch through grade and check which letter and print output respectively
                        switch (grade) {
                            case "A":
                                System.out.println("Your work is outstanding!");
                                break;
                            case "B":
                                System.out.println("You are doing good work!");
                                break;
                            case "C":
                                System.out.println("Your work is satisfactory.");
                                break;
                            case "D":
                                System.out.println("You need to work a little harder.");
                                break;
                            case "F":
                                System.out.println("Please see me for extra help!");
                                break;
                            default:
                                System.out.println("Please enter a valid Grade");
                                break;
                        }
                    }
                    break;
                case "3":
                    //Ask to enter a number between 1 and 10
                    System.out.println("Enter a Number Between 1 and 10");
                    String numEnter = in.nextLine();
                    //Check which nunber was entered and print output respectively
                    switch (numEnter) {
                        case "1":
                            System.out.println("Your number is a low odd number.");
                            break;
                        case "2":
                            System.out.println("Your number is a low even number.");
                            break;
                        case "3":
                            System.out.println("Your number is a low odd number.");
                            break;
                        case "4":
                            System.out.println("Your number is a low even number.");
                            break;
                        case "5":
                            System.out.println("Your number is the middle odd number.");
                            break;
                        case "6":
                            System.out.println("Your number is the middle even number.");
                            break;
                        case "7":
                            System.out.println("Your number is a high odd number.");
                            break;
                        case "8":
                            System.out.println("Your number is a high even number.");
                            break;
                        case "9":
                            System.out.println("Your number is a high odd number.");
                            break;
                        case "10":
                            System.out.println("Your number is a high even number.");
                            break;
                        default:
                            System.out.println("You didn't enter a number between 1 and 10!");
                    }
                    break;
                default:
                    //No lab chose, so set running to false and exit program
                    running = false;
                    break;
            }
        }
    }
}
