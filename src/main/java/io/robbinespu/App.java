package io.robbinespu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
    }
}
