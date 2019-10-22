/****
 * Name: Tejas Mehta
 * Date: March 21th, 2019
 * Lab Name: Lab8.8-Project Database Sorting
 * Extra: Sort by first name added as well
 */
package com.tejasmehta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	//Declare scanner and all arrays
		Scanner in = new Scanner(System.in);
		String[] names = {"Barney Fife", "Luke Skywalker", "Cruella Deville", "Sally Smith", "Marsha Brady", "Gomez Addams", "John Adams", "Marie Antoinette", "Albert Einstein", "Mick Jagger", "Mickey Mouse"};
		String[] addresses = {"10 Warbler Rd.", "R2 Death Star Ave.", "123 Witchey Way", "3682 Street Blvd", "1970 Groovy Street", "1 Spooky Circle", "3445 Presidential Plaza", "2 Rue Morgue", "7 Relativity Rd.", "100 Rolling Stone Path", "2 Disney Lane"};
		String[] city = {"Mountainville, SC 34765", "Jupiter, MD 44623", "Hollywood, CA 12345", "Springfield, IL 31733", "Arlington, VA 51266", "Tombstone, AZ 63341", "New York, NY 11220", "New Orleans, LA 25993", "Topeka, KS 3121", "Seattle, WA 23733", "Orlando FL 72272"};
		System.out.println("Would you like to sort by First Name(1), Last Name(2), Name of City(3) or Zip Code(4)");
		//Ask and get sorting preference
		String choice = in.nextLine();
		//Call method based on preference or exit
		switch (choice) {
			case "1":
				FirstSort(names, addresses, city);
				break;
			case "2":
				LastSort(names, addresses, city);
				break;
			case "3":
				CitySort(names, addresses, city);
				break;
			case "4":
				ZipSort(names, addresses, city);
				break;
			default:
				System.out.println("Okay... Exiting!");
				System.exit(0);
		}
    }
    //Method to sort by first name
    private static void FirstSort(String[] names, String[] addresses, String[] city) {
		int j;
		boolean flag = true;
		//While flag is true
		//Normal bubblesort, and just call swap metgod upon need
		while (flag) {
			flag = false;
			for(j = 0; j < names.length-1; j++) {
					if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
						flag = Swap(names, addresses, city, j);
					}
			}
		}
		//Print out all data shown by sort
		System.out.println("Sorted by first names:");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t\t" + addresses[i] + "\t\t" + city[i]);
		}
	}
	//Method to sort by last name
	private static void LastSort(String[] names, String[] addresses, String[] city) {
		int j;
		boolean flag = true;
		//While flag is true
		//Normal bubblesort, and call swap method upon need
		while (flag) {
			flag = false;
			for(j = 0; j < names.length-1; j++) {
				//Get the last name and compare
				if (names[j].substring(names[j].indexOf(" ")).compareToIgnoreCase(names[j + 1].substring(names[j+1].indexOf(" "))) > 0) {
					flag = Swap(names, addresses, city, j);
				}
			}
		}
		System.out.println("Sorted by last names:");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t\t" + addresses[i] + "\t\t" + city[i]);
		}
	}
	//Method to sort by city
	private static void CitySort(String[] names, String[] addresses, String[] city) {
		int j;
		boolean flag = true;
		//While flag is true
		//Normal bubblesort, call swap metgod upon need
		while (flag) {
			flag = false;
			for(j = 0; j < city.length-1; j++) {
				if (city[j].compareToIgnoreCase(city[j+1]) > 0) {
					flag = Swap(names, addresses, city, j);
				}
			}
		}
		System.out.println("Sorted by city:");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t\t" + addresses[i] + "\t\t" + city[i]);
		}
	}
	//Method to sort by zip
	private static void ZipSort(String[] names, String[] addresses, String[] city) {
		int j;
		boolean flag = true;
		//While flag is true
		while (flag) {
			flag = false;
			for(j = 0; j < city.length-1; j++) {
				//Check ascending and perform actions accordingly
				//Get the zip and parse as int
				if (Integer.parseInt(city[j].substring(city[j].length() - 5).replace(" ", "")) > Integer.parseInt(city[j+1].substring(city[j+1].length() - 5).replace(" ", ""))) {
					flag = Swap(names, addresses, city, j);
				}
			}
		}
		System.out.println("Sorted by Zip:");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t\t" + addresses[i] + "\t\t" + city[i]);
		}
	}
	//Method to swap arrays
	private static boolean Swap(String[] names, String[] addresses, String[] city, int j) {
    	//Declare all temps, and swap in the same manner
		String temp;
		String temp2;
		String temp3;
		boolean flag;
		temp = names[j];
		temp2 = addresses[j];
		temp3 = city[j];
		names[j] = names[j+1];
		addresses[j] = addresses[j+1];
		city[j] = city[j+1];
		names[j+1] = temp;
		addresses[j+1] = temp2;
		city[j+1] = temp3;
		flag = true;
		return flag;
	}
}
