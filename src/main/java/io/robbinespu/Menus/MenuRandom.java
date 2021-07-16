package io.robbinespu.Menus;

import io.robbinespu.Console;
import io.robbinespu.hashing.HashInvokerQuadratic;
import io.robbinespu.hashing.HashInvokerRandom;
import io.robbinespu.hashing.HashTableQuadratic;
import io.robbinespu.hashing.HashTableRandom;

public class MenuRandom {
    public static void mainMenu() {
        System.out.println();
        System.out.println("1.Loads QUESTIONARE to hash table");
        System.out.println("2.Open specific QUESTIONARE from hash table (input: index based )");
        System.out.println("3.Search for a number in hash table (Binary search)");
        System.out.println("4.Delete a QUESTIONARE from hash table");
        System.out.println("5.Clear the hash table");
        System.out.println("6.Sort students by matriculation number");
        System.out.println("0.Exit");
        System.out.println();
    }

    public static void choice(HashTableRandom table) {
        int choice = 1;
        int input;
        while (choice != 0) {
            mainMenu();
            choice = Console.readIntFromStdin("Please enter a number for an option: ");
            switch (choice) {
                case 1:
                    input = Console.readIntFromStdin("Please enter which QUESTIONARE for adding: ");
                    HashInvokerRandom.insert(table,input);
                    break;
                case 2:
                    input = Console.readIntFromStdin("Please enter an index:");
                    HashInvokerRandom.getValue(table, input);
                    break;
                case 3:
                    input = Console.readIntFromStdin("Please enter a number for searching: ");
                    HashInvokerRandom.search(table, input);
                    break;
                case 4:
                    input = Console.readIntFromStdin("Please enter a QUESTIONARE number for deleting: ");
                    HashInvokerRandom.remove(table, input);
                    break;
                case 5:
                    HashInvokerRandom.clear(table);
                    break;
                case 6:
                    //SortMenu.executeSortMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong input. Try again!");
            }
        }
    }
}
