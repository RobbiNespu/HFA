package io.robbinespu;

import io.robbinespu.database.Question01;
import io.robbinespu.database.Question02;
import io.robbinespu.datastructure.Questionare;
import io.robbinespu.datastructure.QuestionareOptions;
import io.robbinespu.datastructure.Respondent;
import io.robbinespu.datastructure.RespondentOptions;
import io.robbinespu.hashing.QuadraticProbing;
import io.robbinespu.hashing.TableFullException;

import java.util.ArrayList;
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
        Question01 question01 = new Question01();
        Question02 question02 = new Question02();

        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        hashQuadratic.insert(0, TABLE_SZ);
        hashQuadratic.insert(1, TABLE_SZ);
        hashQuadratic.insert(2, TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
