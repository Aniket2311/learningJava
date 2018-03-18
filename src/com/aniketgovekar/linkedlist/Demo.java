package com.aniketgovekar.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisist = new LinkedList<>();
        placesToVisist.add("Sydney");
        placesToVisist.add("Melbourne");
        placesToVisist.add("Brisbane");
        placesToVisist.add("Perth");
        placesToVisist.add("Canberra");
        placesToVisist.add("Adelaide");
        placesToVisist.add("Darwin");

        printList(placesToVisist);
    }

    private static void printList(LinkedList<String> placesToVisist) {
        Iterator<String> iterator = placesToVisist.iterator();
        while (iterator.hasNext()) {
            System.out.println("Now Visiting " + iterator.next());
        }
        System.out.println("============================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                //todo equal, do not add
                System.out.println(newCity + " is already included as destination.");
                return false;
            } else if (comparison > 0) {
                //todo new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //todo move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}
