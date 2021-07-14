package io.robbinespu;

import io.robbinespu.hashing.QuadraticProbing;
import io.robbinespu.hashing.TableFullException;

/**
 * Hello world!
 *
 */
public class App {
    private static final int TABLE_SZ = 3; // a prime number 2,3,5,7,11..101

    public static void main( String[] args ) throws TableFullException {
        //System.out.println( "Hello World!" );



        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        hashQuadratic.insert(0, TABLE_SZ);
        hashQuadratic.insert(1, TABLE_SZ);
        hashQuadratic.insert(2, TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
