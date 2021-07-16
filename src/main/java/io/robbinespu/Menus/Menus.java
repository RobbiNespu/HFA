package io.robbinespu.Menus;

import io.robbinespu.Console;
import io.robbinespu.hashing.*;

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
        int m = 10;
        switch ( hashTable ){
            case "Quadratic":
                HashTableQuadratic tableQuadratic = new HashTableQuadratic(m, new HashQuadratic(m), new QuadraticProbing());
                MenuQuadratic.choice(tableQuadratic);
                break;
            case "Random":
                HashTableRandom tableRandom = new HashTableRandom(m, new HashRandom(m), new RandomProbing());
                MenuRandom.choice(tableRandom);
                System.out.println("two");
                break;
            default:
                System.out.println("no match");
        }

    }

    public static void apps() {
        int choice = 1;
        int input;
        while (choice != 4) {
            System.out.println("1. Quadratic probing");
            System.out.println("2. Random probing");
            System.out.println("3. Custom probing");
            System.out.println("4. Exit");
            choice = Console.readIntFromStdin("Please enter a number for an option: ");
            switch (choice) {
                case 1:
                    Menus.selectHash("Quadratic");
                    break;
                case 2:
                    // TODO: do something
                    Menus.selectHash("Random");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong input. Try again!");
            }
        }
    }
}
