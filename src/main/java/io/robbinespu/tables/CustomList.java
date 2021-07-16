package io.robbinespu.tables;

import io.robbinespu.database.q01.*;
import io.robbinespu.database.q01.r01.*;
import io.robbinespu.datastructure.Survey;
import io.robbinespu.datastructure.SurveyAnswers;
import io.robbinespu.datastructure.SurveyQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomList {
    public CustomList() {
        List<Survey> list = new LinkedList<>();

        Survey s1 = new Survey();
        Survey s2 = new Survey();
        Survey s3 = new Survey();
        Survey s4 = new Survey();
        Survey s5 = new Survey();
        Survey s6 = new Survey();
        Survey s7 = new Survey();
        Survey s8 = new Survey();
        Survey s9 = new Survey();
        Survey s10 = new Survey();

        ArrayList<SurveyQuestions> surveyQuestionsArrayList = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList = new ArrayList<>();

        // Note: Create just 1 question and 100 answers inside DATABASE
        SurveyQuestions01 surveyQuestions01 = new SurveyQuestions01();
        SurveyQuestion01Answers01 surveyQuestion01Answers01 = new SurveyQuestion01Answers01();
        SurveyQuestion01Answers02 surveyQuestion01Answers02 = new SurveyQuestion01Answers02();
        SurveyQuestion01Answers03 surveyQuestion01Answers03 = new SurveyQuestion01Answers03();
        SurveyQuestion01Answers04 surveyQuestion01Answers04 = new SurveyQuestion01Answers04();
        SurveyQuestion01Answers05 surveyQuestion01Answers05 = new SurveyQuestion01Answers05();
        SurveyQuestion01Answers06 surveyQuestion01Answers06 = new SurveyQuestion01Answers06();
        SurveyQuestion01Answers07 surveyQuestion01Answers07 = new SurveyQuestion01Answers07();
        SurveyQuestion01Answers08 surveyQuestion01Answers08 = new SurveyQuestion01Answers08();
        SurveyQuestion01Answers09 surveyQuestion01Answers09 = new SurveyQuestion01Answers09();
        SurveyQuestion01Answers10 surveyQuestion01Answers10 = new SurveyQuestion01Answers10();



        // Note: Add all instantiated just 1 question and 100 answers from database
        surveyQuestionsArrayList.add(surveyQuestions01.questions); // <-- only one!
        surveyAnswersArrayList.add(surveyQuestion01Answers01.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers02.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers03.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers04.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers05.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers06.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers08.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers09.surveyAnswers);
        surveyAnswersArrayList.add(surveyQuestion01Answers10.surveyAnswers);

        // Note: add all survey responder fo S1 only
        s1.setSurveyQuestionsArrayList(surveyQuestionsArrayList);
        s1.setSurveyAnswersArrayList(surveyAnswersArrayList);

        // Note: add into TABLE - "LIST"
        list.add(s1);

        // DEBUG - Make sure all only 1 question and 100 answers
        System.out.println("size S: "+list.size()); // it always 1..10 (start from 0)
        for(Survey s:list){
            System.out.println("size S - question: "+s.getSurveyQuestionsArrayList().size()); // it always 1 !
            System.out.println("size S - answers: "+s.getSurveyAnswersArrayList().size()); // more then 1..10
            //System.out.println(s.getSurveyQuestionsArrayList());  // uncomment to see data
            //System.out.println(s.getSurveyAnswersArrayList());    // uncomment to see data
        }
    }
}
