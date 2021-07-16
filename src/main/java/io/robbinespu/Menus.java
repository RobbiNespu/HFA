package io.robbinespu;

import java.util.Locale;

public class Menus {
    public static void mainMenuDisplayOnly(){
        System.out.println();
        System.out.println("1. Load data to LIST collections");
        System.out.println("2. Get a number from hash table");
        System.out.println("3. Search for a number in hash table");
        System.out.println("4. Delete a number from hash table");
        System.out.println("5. Clear the hash table");
        System.out.println("6. Sort students by matriculation number");
        System.out.println("0. Exit");
        System.out.println();
    }

    public static void selectHash(String hashTable) {
        switch ( hashTable ){
            case "Quadratic":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            default:
                System.out.println("no match");
        }

    }
}
