/****
 * Name: Tejas Mehta
 * Date: April 10th, 2019
 * Lab Name: Lab8.16-Project FBI Program
 * Extra: Added an insurance company Array
 */
package com.tejasmehta;

public class Main {
    public static void main(String[] args) {
        //Declare all initial arrays(parallel)
        String[] names = {"Bowman", "Walker", "Christian", "Edwards", "Cummings", "Halpern", "Scott", "Rhineheart", "Haley", "Brooks"};
        String[] adrress = {"Canaan", "Newark", "Hardwick", "Montgomery", "Trenton", "Liverpool", "Sheridan", "Houston", "Westfield", "Syosset"};
        String[] state = {"CT", "NJ", "VT", "AL", "NJ", "NY", "WY", "TX", "NJ", "NY"};
        int[] ages = {48, 39, 46, 71, 31, 38, 51, 62, 22, 32};
        char[] sex = {'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M'};
        int[] salary = {18000, 27000, 59000, 78000, 25000, 45000, 19000, 91000, 33000, 40000};
        int[] savings = {4200, 3600, 1900, 500, 7800, 12000, 400, 53200, 4700, 3900};
        String[] car = {"Saturn", "Olds", "Chev", "Chev", "Ford", "Chev", "Ford", "Cad", "Honda", "Ford"};
        String[] insurance = {"Company A","Company B", "Company D", "Company 7", "Company 99", "Company A", "Company Z", "Company XX", "Company N", "Company 666"};
        int[] year = {2009, 2006, 2010, 2013, 2009, 2012, 2008, 2017, 2004, 2011};
        int j;
        //Declare looper & flag
        boolean flag = true;
        //Declare all tempVars
        String temp;
        String adTemp;
        String sTemp;
        int ageTmp;
        char seTmp;
        int salTmp;
        int savTmp;
        String carTmp;
        int yearTmp;
        String insTmp;
        //While flag is true
        while (flag) {
            flag = false;
            for(j = 0; j < names.length-1; j++) {
                //Check ascending and perform actions accordingly
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    //All swap code for each array parallel
                    temp = names[j];
                    adTemp = adrress[j];
                    sTemp = state[j];
                    ageTmp = ages[j];
                    seTmp = sex[j];
                    salTmp = salary[j];
                    savTmp = savings[j];
                    carTmp = car[j];
                    yearTmp = year[j];
                    insTmp = insurance[j];
                    names[j] = names[j+1];
                    adrress[j] = adrress[j+1];
                    state[j] = state[j+1];
                    ages[j] = ages[j+1];
                    sex[j] = sex[j+1];
                    salary[j] = salary[j+1];
                    savings[j] = savings[j+1];
                    car[j] = car[j+1];
                    insurance[j] = insurance[j+1];
                    year[j] = year[j+1];
                    names[j+1] = temp;
                    adrress[j+1] = adTemp;
                    state[j+1] = sTemp;
                    ages[j+1] = ageTmp;
                    sex[j+1] = seTmp;
                    salary[j+1] = salTmp;
                    savings[j+1] = savTmp;
                    car[j+1] = carTmp;
                    year[j+1] = yearTmp;
                    insurance[j+1] = insTmp;
                    flag = true;
                }
            }
        }
        //Get the lists for each detective
        GetHolmes(names, adrress, state, ages, sex, salary, savings, car, year, insurance);
        GetClouseau(names, adrress, state, ages, sex, salary, savings, car, year, insurance);
        GetSimon(names, adrress, state, ages, sex, salary, savings, car, year, insurance);
        GetPanther(names, adrress, state, ages, sex, salary, savings, car, year, insurance);
    }
    //Homes function
    private static void GetHolmes(String[] names, String[] address, String[] state, int[] age, char[] sex, int[] salary, int[] savings, String[] car, int[] year, String[] insurance) {
        System.out.println("Homes's possible list: ");
        //Loop through list and print according to conditions
        for(int i = 0; i < names.length; i++) {
            if (age[i] > 30 && car[i].equals("Ford") && salary[i] > 20000) {
                System.out.println("\t\t" + names[i] + "\t" + address[i] + "\t" + state[i] + "\t" + age[i] + "\t" + sex[i]  + "\t" + salary[i]  + "\t" + savings[i]  + "\t" + car[i]  + "\t" + insurance[i] + "\t" + year[i]);
            }
        }
    }
    //Clouseau Function
    private static void GetClouseau(String[] names, String[] address, String[] state, int[] age, char[] sex, int[] salary, int[] savings, String[] car, int[] year, String[] insurance) {
        System.out.println("Clouseau's possible list: ");
        //Loop through list and print according to conditions
        for(int i = 0; i < names.length; i++) {
            if ((car[i].equals("Ford") || car[i].equals("Chev") || car[i].equals("Honda")) && salary[i] > 15000 && savings[i] < 2000) {
                System.out.println("\t\t" + names[i] + "\t" + address[i] + "\t" + state[i] + "\t" + age[i] + "\t" + sex[i]  + "\t" + salary[i]  + "\t" + savings[i]  + "\t" + car[i] + "\t" + insurance[i]  + "\t" + year[i]);
            }
        }
    }
    //Simon function
    private static void GetSimon(String[] names, String[] address, String[] state, int[] age, char[] sex, int[] salary, int[] savings, String[] car, int[] year, String[] insurance) {
        System.out.println("Simon's possible list: ");
        //Loop through list and print according to conditions
        for(int i = 0; i < names.length; i++) {
            if (sex[i] == 'F') {
                System.out.println("\t\t" + names[i] + "\t" + address[i] + "\t" + state[i] + "\t" + age[i] + "\t" + sex[i]  + "\t" + salary[i]  + "\t" + savings[i]  + "\t" + car[i] + "\t" + insurance[i]  + "\t" + year[i]);
            }
        }
    }
    //Panther function
    private static void GetPanther(String[] names, String[] address, String[] state, int[] age, char[] sex, int[] salary, int[] savings, String[] car, int[] year, String[] insurance) {
        System.out.println("Panther's possible list: ");
        //Loop through list and print according to conditions
        for(int i = 0; i < names.length; i++) {
            if (sex[i] == 'M' && age[i] < 35 && car[i].equals("Ford") && state[i].equals("NJ")) {
                System.out.println("\t\t" + names[i] + "\t" + address[i] + "\t" + state[i] + "\t" + age[i] + "\t" + sex[i]  + "\t" + salary[i]  + "\t" + savings[i]  + "\t" + car[i] + "\t" + insurance[i]  + "\t" + year[i]);
            }
        }
    }
}
