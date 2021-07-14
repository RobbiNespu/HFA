package io.robbinespu;

/**
 * Hello world!
 *
 */
public class App {
    private static final int TABLE_SZ = 101; // a prime number

    public static void main( String[] args ) throws Exception{
        System.out.println( "Hello World!" );

        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        System.out.println(hashQuadratic.toString());
    }
}
