package io.robbinespu;

import io.robbinespu.database.*;
import io.robbinespu.datastructure.*;
import io.robbinespu.hashing.QuadraticProbing;
import io.robbinespu.hashing.TableFullException;
import io.robbinespu.tables.CustomList;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    private static final int TABLE_SZ = 3; // a prime number 2,3,5,7,11..101

    public static void main( String[] args ) throws TableFullException {
        //System.out.println( "Hello World!" );
        CustomList customList = new CustomList();



//        Survey survey = new Survey();
//        SurveyQuestions01 surveyQuestions01 = new SurveyQuestions01();
//        SurveyAnswers01 surveyAnswers01 = new SurveyAnswers01();
//        LinkedHashMap<SurveyQuestions, SurveyAnswers> surveyQuestionsSurveyAnswersLinkedHashMap = new LinkedHashMap<>();
//        surveyQuestionsSurveyAnswersLinkedHashMap.put(surveyQuestions01.questions,surveyAnswers01.surveyAnswers);
//        surveyQuestionsSurveyAnswersLinkedHashMap.put(surveyQuestions01.questions,surveyAnswers01.surveyAnswers); // just test
//        survey.setSurveyQuestionsSurveyAnswersLinkedHashMap(surveyQuestionsSurveyAnswersLinkedHashMap); // Add Q and survery X
//
//
//        System.out.println(survey);


//        // Create questionnaire
//        Question01 question01 = new Question01();
//        Question01_R001 r001 = new Question01_R001();
//
//        ArrayList<SurveyQuestions> surveyQuestionsArrayList =new ArrayList<>();
//        ArrayList<TempRespondentOptions> tempRespondentOptionsArrayList = new ArrayList<>();
//
//
//        surveyQuestionsArrayList.add(question01.getQuestion()); // Add all questions here
//
//
//        Question01_R002 r002 = new Question01_R002();
//        Question01_R003 r003 = new Question01_R003();
//        Question01_R004 r004 = new Question01_R004();
//        Question01_R005 r005 = new Question01_R005();
//        Question01_R006 r006 = new Question01_R006();
//        Question01_R007 r007 = new Question01_R007();
//        Question01_R008 r008 = new Question01_R008();
//        Question01_R009 r009 = new Question01_R009();
//        Question01_R010 r010 = new Question01_R010();
//
//
//        tempRespondentOptionsArrayList.add(r001.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r002.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r003.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r004.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r005.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r006.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r007.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r008.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r009.getRespondentOptions()); // Add all responded here
//        tempRespondentOptionsArrayList.add(r010.getRespondentOptions()); // Add all responded here
//
//
//        Question02 question02 = new Question02();
//        surveyQuestionsArrayList.add(question02.getQ1()); // Add all questions here
//        //respondentOptionsArrayList.add(question02.getQ1r1()); // Add all responded here
//
//        TempRespondentPersons r=new TempRespondentPersons();
//        r.setTimeStamp("5/28/2021 14:18:22");
//        r.setQuestions(surveyQuestionsArrayList);
//        r.setRespondentOptions(tempRespondentOptionsArrayList);
//        System.out.println("-------------- STATISTIC ---------------");
//        System.out.println(
//                "Questions size: "+ r.getQuestions().size() + " | respondent size: "+ tempRespondentOptionsArrayList.size()
////                "\n"+ r.getQuestions().get(0) +
////                "\n"+ respondentOptionsArrayList.get(0)
//        );
//
//        //Getting Iterator
//        int localCounterQ = 1;
//        for (int counterQ = 0; counterQ < r.getQuestions().size(); counterQ++) {
//            int localQounterR = 1;
//            for (int counterR = 0; counterR < tempRespondentOptionsArrayList.size(); counterR++) {
//                //System.out.println("Question["+localCounterQ+"]"+ " / Responder["+localQounterR+"]" );
//                //System.out.println(r.getQuestions().get(counterQ));
//                //System.out.println(tempRespondentOptionsArrayList.get(counterQ));
//                localQounterR++;
//            }
//            localCounterQ++;
//
//            //System.out.print("\n");
//
//        }



        QuadraticProbing hashQuadratic = new QuadraticProbing(TABLE_SZ);

        hashQuadratic.insert(0, TABLE_SZ);
        hashQuadratic.insert(1, TABLE_SZ);
        hashQuadratic.insert(2, TABLE_SZ);
        //hashQuadratic.insert(4, TABLE_SZ);
        System.out.println(hashQuadratic.toString());
    }
}
