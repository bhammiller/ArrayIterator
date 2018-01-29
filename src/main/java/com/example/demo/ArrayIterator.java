package com.example.demo;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
    public ArrayList iterator() {
        //Create a list of names
        ArrayList names = new ArrayList();

        //Add some names in list
        names.add("Eve");
        names.add("Anna");
        names.add("Tonny");
        names.add("Steve");

        //Method #1 : Iterate using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();//print blank line
        //Method #2 : Iterate using advanced for loop
        System.out.println("Using Advanced for loop");
        for (Object name : names) {
            System.out.println(name);
        }

        System.out.println();//print blank line
        //Method #3 : Iterate using advanced for loop
        System.out.println("Using Iterator");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();//print blank line
        //Method #4 : Iterate using while loop
        System.out.println("Using while  loop");
        int index = 0 ;
        while (names.size()> index) {
            System.out.println(names.get(index));
            index++ ;
        }
        return names;
    }
}
