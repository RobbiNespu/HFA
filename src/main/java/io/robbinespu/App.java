package io.robbinespu;

import io.robbinespu.hashing.QuadraticProbing;
import io.robbinespu.hashing.TableFullException;
import io.robbinespu.tables.CustomList;

/**
 * Hello world!
 *
 */
public class App {


    public static void main( String[] args ) throws TableFullException {
        //System.out.println( "Hello World!" );
        System.out.println();
        System.out.println("1. Quadratic probing");
        System.out.println("2. Random probing");
        System.out.println("3. Custom probing");
        System.out.println("4. Exit");
        int choice = 1;
        int input;
        while (choice != 4) {
            choice = Console.readIntFromStdin("Please enter a number for an option: ");
            switch (choice) {
                case 1:
                    // TODO: do something
                    Menus.selectHash("Quadratic");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong input. Try again!");
            }
        }

        CustomList customList = new CustomList();

        // Quadratic
        QuadraticProbing hashQuadratic = new QuadraticProbing(Constants.TABLE_SZ);

        hashQuadratic.insert(0, Constants.TABLE_SZ);
        hashQuadratic.insert(1, Constants.TABLE_SZ);
        hashQuadratic.insert(2, Constants.TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
