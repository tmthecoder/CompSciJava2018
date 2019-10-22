/****
 * Name: Tejas Mehta
 * Date: May 23rd, 2019
 * Lab Name: LabOOP5-Real-Gettysberg Address
 * Extra: Listed in Main
 */
package com.tejasmehta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Reader {
    private File file;
    private ArrayList<String> words = new ArrayList<>();
    private String message = "";
    //State vars and constructor
    Reader(File f){
        file = f;
    }
    //Scan ask
    void scan() {
        try {
            Scanner in = new Scanner(file);
            //Get vals and add to arrayllist
            while (in.hasNext()) {
                String s = in.next();
                System.out.println(s);
                words.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //Conv to set and back to remove all dupe words
    void removeDupe() {
        Set<String> set = new LinkedHashSet<>(words);
        words.clear();
        words.addAll(set);
    }
    //Sorting function, use comparator
    void sort() {
        words.sort(new Sort());
        message = words.toString();
    }
    //Sorting function, use comparatorRev
    void revSort() {
        words.sort(new RevSort());
        message = words.toString();
    }
    //toString message
    @Override
    public String toString() {
        return message;
    }
}
//Normal sorter, compare via comparator
class Sort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
//reverse sorter, compare via comparator
class RevSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
