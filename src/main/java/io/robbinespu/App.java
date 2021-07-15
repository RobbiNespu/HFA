package io.robbinespu;

import io.robbinespu.database.Question01;
import io.robbinespu.database.Question01_R001;
import io.robbinespu.database.Question02;
import io.robbinespu.datastructure.Questionare;
import io.robbinespu.datastructure.Respondent;
import io.robbinespu.datastructure.RespondentOptions;
import io.robbinespu.hashing.QuadraticProbing;
import io.robbinespu.hashing.TableFullException;

import java.util.ArrayList;

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
        ArrayList<RespondentOptions> respondentOptionsArrayList = new ArrayList<>();

        Question01 question01 = new Question01();
        questionareArrayList.add(question01.getQuestion()); // Add all questions here
        Question01_R001 r1 = new Question01_R001();
        respondentOptionsArrayList.add(r1.getRespondentOptions()); // Add all responded here


        Question02 question02 = new Question02();
        questionareArrayList.add(question02.getQ1()); // Add all questions here
        respondentOptionsArrayList.add(question02.getQ1r1()); // Add all responded here

        Respondent r=new Respondent();
        r.setTimeStamp("5/28/2021 14:18:22");
        r.setQuestions(questionareArrayList);
        r.setRespondentOptions(respondentOptionsArrayList);
        System.out.println("Size: "+ r.getQuestions().size() +"\n"+ r.getQuestions().get(0) +"\n"+ respondentOptionsArrayList.get(0));

        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        hashQuadratic.insert(0, TABLE_SZ);
        hashQuadratic.insert(1, TABLE_SZ);
        hashQuadratic.insert(2, TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
