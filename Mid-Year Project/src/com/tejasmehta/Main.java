/****
 * Name: Tejas Mehta
 * Date: January 29th 2018
 * Lab Name: Mid-Year Project
 * Extra: None needed as midterm
 */
package com.tejasmehta;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printNameLogo();
        printOfficers();
        //Print intro and start
        Scanner in = new Scanner(System.in);
        String products = "";
        int totalCost = 0;
        boolean firstPurchase = true;
        //Start loop
        while(true){
            printProducts();
            System.out.println("Please enter the number you would like to purchase below:");
            //Ask purchase
            String choice = in.nextLine();
            switch (choice) {
                //Based on choice, get purchase, append string and total cost, and then ask if again
                case "1":
                    System.out.println("How many Android apps do you need created?");
                    int amount = in.nextInt();
                    //append by 50
                    System.out.println("Great! That will be " + (amount * 50) + " dollars! Do you wish to buy anything else?");
                    choice = in.nextLine();
                    choice = in.nextLine();
                    totalCost += (amount * 50);
                    //Ask if again and add to list
                    if (firstPurchase) {
                        products = products + amount + " Android App(s)";
                        firstPurchase = false;
                    } else {
                        products = products + ", " + amount + " Android App(s)";
                    }
                    showTotal(products, totalCost, choice);
                    break;
                case "2":
                    System.out.println("How many iOS apps do you need created?");
                    int amountiOS = in.nextInt();
                    //append by 50
                    System.out.println("Great! That will be " + (amountiOS * 50) + " dollars! Do you wish to buy anything else?");
                    choice = in.nextLine();
                    choice = in.nextLine();
                    totalCost += (amountiOS * 50);
                    //Ask if again and add to list
                    if (firstPurchase) {
                        products = products + amountiOS + " iOS App(s)";
                        firstPurchase = false;
                    } else {
                        products = products + ", " + amountiOS + " iOS App(s)";
                    }
                    showTotal(products, totalCost, choice);
                case "3":
                    System.out.println("How many Multiplatform apps do you need created?");
                    int amountMult = in.nextInt();
                    //append by 100
                    System.out.println("Great! That will be " + (amountMult * 100) + " dollars! Do you wish to buy anything else?");
                    choice = in.nextLine();
                    choice = in.nextLine();
                    totalCost += (amountMult * 100);
                    //Ask if again and add to list
                    if (firstPurchase) {
                        products = products + amountMult + " Multiplatform App(s)";
                        firstPurchase = false;
                    } else {
                        products = products + ", " + amountMult + " Multiplatform App(s)";
                    }
                    showTotal(products, totalCost, choice);
                case "4":
                    System.out.println("How many Multiplatform Online apps do you need created?");
                    int amountMultOnline = in.nextInt();
                    //append by 150
                    System.out.println("Great! That will be " + (amountMultOnline * 150) + " dollars! Do you wish to buy anything else?");
                    choice = in.nextLine();
                    choice = in.nextLine();
                    totalCost += (amountMultOnline * 150);
                    //Ask if again and add to list
                    if (firstPurchase) {
                        products = products + amountMultOnline + " Multiplatform Online App(s)";
                        firstPurchase = false;
                    } else {
                        products = products + ", " + amountMultOnline + " Multiplatform Online App(s)";
                    }
                    showTotal(products, totalCost, choice);
                case "5":
                    System.out.println("How many App Updates do you need created?");
                    int amountUpdate = in.nextInt();
                    //append by 25
                    System.out.println("Great! That will be " + (amountUpdate * 25) + " dollars! Do you wish to buy anything else?");
                    choice = in.nextLine();
                    choice = in.nextLine();
                    totalCost += (amountUpdate * 25);
                    //Ask if again and add to list
                    if (firstPurchase) {
                        products = products + amountUpdate + " App Update(s)";
                        firstPurchase = false;
                    } else {
                        products = products + ", " + amountUpdate + " App Update(s)";
                    }
                    showTotal(products, totalCost, choice);
                default:
                    //Exit
                    System.out.println("Invalid entry. Exiting ....");
                    System.exit(0);

            }
        }
    }

    private static void showTotal(String products, int totalCost, String choice) {
        //Function to show total based on entry or more purchase
        if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("Y")) {
            System.out.println("Okay, here is the list again");
        } else {
            System.out.println("Your purchase is " + products + " for a total cost of $" + totalCost + ". Thank you for shopping!");
            System.exit(0);
        }
    }


    private static void printProducts() {
        //function to print products
        System.out.println("Our products are as listed below:\n" +
                "          Product                            Service                                             Price-Per-Unit\n" +
                "1.      Android App                A Full Android App on Your Ideas                        $50.00, with 5% profit royalty\n" +
                "2.     Apple/iOS App                 A Full iOS App on Your Ideas                          $50.00, with 5% profit royalty\n" +
                "3.    Multiplatform App              A Full app for Android and iOS                       $100.00, with 5% profit royalty\n" +
                "4. Multiplatform Online App      A Full, online app for Android and iOS           $150.00, with 5% profit royalty + database costs\n" +
                "5. App Updates(all versions)     A Full-fledged update on your existing app                 $25.00, with 5% profit royalty");
    }

    private static void printOfficers() {
        //Function to print officers
        System.out.println("Our admirable officers are: Tejas, Tejas2, Tejas3, and you heard it first here... Tejas4!!");
    }

    private static void printIsocelesRightDouble() {
        //Function to print intro and logo, with a '&' sign box
        //First for loop for line amnt
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for(int i = 1; i <= 6; i++){
            System.out.print("&");
            //Second for loop for count of chars per line
            for (int num = 1; num <= 15; num++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print("*");
            }
            for (int num = 1; num <= 10 + (10 - (i * 2)); num++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print("*");
            }
            System.out.print("                 &\n");
        }
        System.out.print("&               ");
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }
        System.out.print("                 &\n");
    }
    private static void printNameLogo() {
        //Master function to print name & logo
        //Logo
        printIsocelesRightDouble();
        //Name and Description
        System.out.println("&           Welcome to Tejas Enterprises!            &\n&The Only Solution for your app Development Problems!&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}
