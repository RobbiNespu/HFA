package io.robbinespu.tables;

import io.robbinespu.database.SurveyAnswers01;
import io.robbinespu.database.SurveyAnswers02;
import io.robbinespu.database.SurveyQuestions01;
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

        // Create just 1 question and 100 answers inside DATABASE
        SurveyQuestions01 surveyQuestions01 = new SurveyQuestions01();
        SurveyAnswers01 surveyAnswers01 = new SurveyAnswers01();
        SurveyAnswers02 surveyAnswers02 = new SurveyAnswers02();


        // Add all instantiated just 1 question and 100 answers from database
        surveyQuestionsArrayList.add(surveyQuestions01.questions); // <-- only one!
        surveyAnswersArrayList.add(surveyAnswers01.surveyAnswers);
        surveyAnswersArrayList.add(surveyAnswers02.surveyAnswers);

        // add all survey responder fo S1 only
        s1.setSurveyQuestionsArrayList(surveyQuestionsArrayList);
        s1.setSurveyAnswersArrayList(surveyAnswersArrayList);

        // add into TABLE - "LIST"
        list.add(s1);

        // DEBUG - Make sure all only 1 question and 100 answers
        System.out.println("size S: "+list.size()); // it always 1..10
        for(Survey s:list){
            System.out.println("size S - question: "+s.getSurveyQuestionsArrayList().size()); // it always 1 !
            System.out.println("size S - answers: "+s.getSurveyAnswersArrayList().size()); // it always more then 1 !
            //System.out.println(s.getSurveyQuestionsArrayList());
            //System.out.println(s.getSurveyAnswersArrayList());
        }
    }
}
