package io.robbinespu;

import io.robbinespu.hashing.QuadraticProbing;
import io.robbinespu.hashing.TableFullException;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    private static final int TABLE_SZ = 3; // a prime number 2,3,5,7,11..101

    public static void main( String[] args ) throws TableFullException {
        //System.out.println( "Hello World!" );

        // Create questionnaire
        String questionString = "Siapa nak berhenti?";
        int questionType = Constants.MULTI_CHOOSE_QUESTION;

        // Add options (answers?)
        if(questionType == Constants.MULTI_CHOOSE_QUESTION){
            LinkedHashMap<String,String> mcq = new LinkedHashMap<>();
            mcq.put("A","kari ayam");
            mcq.put("B","kari ikan");
            mcq.put("C","kari katak");
            mcq.put("D","kari lembu");
            for(Map.Entry m:mcq.entrySet()){
                System.out.println(m.getKey()+" -> "+m.getValue());
            }
            // Add respondent

        }

        int choiceNum = 1;
        String choiceStr = "";

        // Add respondent

        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        hashQuadratic.insert(0, TABLE_SZ);
        hashQuadratic.insert(1, TABLE_SZ);
        hashQuadratic.insert(2, TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
