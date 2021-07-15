package io.robbinespu;

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
        ArrayList<Questionare> questionareArrayList =new ArrayList<>();
        Questionare q1 = new Questionare();
        LinkedHashMap<String,String> mcq1 = new LinkedHashMap<>();

        q1.setQuestionString("What is your age?");
        q1.setQuestionType(Constants.SINGLE_CHOOSE_QUESTION);

        mcq1.put("A","Under 18");
        mcq1.put("B","18 - 24 years");
        mcq1.put("C","25 - 29 years");
        mcq1.put("D","30 - 34 years");
        mcq1.put("E","35 - 39 years");
        mcq1.put("F","40 - 44 years");
        mcq1.put("G","45 - 49 years");
        mcq1.put("H","50 - 54 years");
        mcq1.put("I","55 - 59 years");
        mcq1.put("J","60 years and above");

        QuestionareOptions qo1 = new QuestionareOptions(mcq1);
        q1.setQuestionareOptions(qo1);

        questionareArrayList.add(q1); // Add all questions here

        // Add respondent
        ArrayList<RespondentOptions> respondentOptionsArrayList = new ArrayList<>(); // Add all responded here
        RespondentOptions q1r1 = new RespondentOptions();
        q1r1.setText("A");
        respondentOptionsArrayList.add(q1r1);

        Respondent r1=new Respondent("5/28/2021 14:18:22",questionareArrayList, respondentOptionsArrayList);

        System.out.println(r1);

        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        hashQuadratic.insert(0, TABLE_SZ);
        hashQuadratic.insert(1, TABLE_SZ);
        hashQuadratic.insert(2, TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
