package io.robbinespu.tables;

import io.robbinespu.database.q01.*;
import io.robbinespu.database.q01.r01.*;
import io.robbinespu.database.q02.SurveyQuestions02;
import io.robbinespu.database.q02.r01.*;
import io.robbinespu.database.q03.SurveyQuestions03;
import io.robbinespu.database.q04.SurveyQuestions04;
import io.robbinespu.database.q05.SurveyQuestions05;
import io.robbinespu.database.q06.SurveyQuestions06;
import io.robbinespu.database.q07.SurveyQuestions07;
import io.robbinespu.database.q08.SurveyQuestions08;
import io.robbinespu.database.q09.SurveyQuestions09;
import io.robbinespu.database.q10.SurveyQuestions10;
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

        SurveyQuestions02 surveyQuestions02 = new SurveyQuestions02();
        SurveyQuestion02Answers01 SurveyQuestion02Answers01 = new SurveyQuestion02Answers01();
        SurveyQuestion02Answers02 SurveyQuestion02Answers02 = new SurveyQuestion02Answers02();
        SurveyQuestion02Answers03 SurveyQuestion02Answers03 = new SurveyQuestion02Answers03();
        SurveyQuestion02Answers04 SurveyQuestion02Answers04 = new SurveyQuestion02Answers04();
        SurveyQuestion02Answers05 SurveyQuestion02Answers05 = new SurveyQuestion02Answers05();
        SurveyQuestion02Answers06 SurveyQuestion02Answers06 = new SurveyQuestion02Answers06();
        SurveyQuestion02Answers07 SurveyQuestion02Answers07 = new SurveyQuestion02Answers07();
        SurveyQuestion02Answers08 SurveyQuestion02Answers08 = new SurveyQuestion02Answers08();
        SurveyQuestion02Answers09 SurveyQuestion02Answers09 = new SurveyQuestion02Answers09();
        SurveyQuestion02Answers10 SurveyQuestion02Answers10 = new SurveyQuestion02Answers10();

        SurveyQuestions03 surveyQuestions03 = new SurveyQuestions03();

        SurveyQuestions04 surveyQuestions04 = new SurveyQuestions04();

        SurveyQuestions05 surveyQuestions05 = new SurveyQuestions05();

        SurveyQuestions06 surveyQuestions06 = new SurveyQuestions06();

        SurveyQuestions07 surveyQuestions07 = new SurveyQuestions07();

        SurveyQuestions08 surveyQuestions08 = new SurveyQuestions08();

        SurveyQuestions09 surveyQuestions09 = new SurveyQuestions09();

        SurveyQuestions10 surveyQuestions10 = new SurveyQuestions10();


        // Note: Add all instantiated just 1 question and 100 answers from database
        ArrayList<SurveyQuestions> surveyQuestionsArrayList01 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList01 = new ArrayList<>();
        surveyQuestionsArrayList01.add(surveyQuestions01.questions); // <-- only one!
        surveyAnswersArrayList01.add(surveyQuestion01Answers01.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers02.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers03.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers04.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers05.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers06.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers07.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers08.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers09.surveyAnswers);
        surveyAnswersArrayList01.add(surveyQuestion01Answers10.surveyAnswers);

        ArrayList<SurveyQuestions> surveyQuestionsArrayList02 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList02 = new ArrayList<>();
        surveyQuestionsArrayList02.add(surveyQuestions02.questions); // <-- only one!
        surveyAnswersArrayList02.add(SurveyQuestion02Answers01.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers02.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers03.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers04.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers05.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers06.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers07.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers08.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers09.surveyAnswers);
        surveyAnswersArrayList02.add(SurveyQuestion02Answers10.surveyAnswers);

        ArrayList<SurveyQuestions> surveyQuestionsArrayList03 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList03 = new ArrayList<>();
        surveyQuestionsArrayList03.add(surveyQuestions03.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList04 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList04 = new ArrayList<>();
        surveyQuestionsArrayList04.add(surveyQuestions04.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList05 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList05 = new ArrayList<>();
        surveyQuestionsArrayList05.add(surveyQuestions05.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList06 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList06 = new ArrayList<>();
        surveyQuestionsArrayList06.add(surveyQuestions06.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList07 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList07 = new ArrayList<>();
        surveyQuestionsArrayList07.add(surveyQuestions07.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList08 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList08 = new ArrayList<>();
        surveyQuestionsArrayList08.add(surveyQuestions08.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList09 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList09 = new ArrayList<>();
        surveyQuestionsArrayList09.add(surveyQuestions09.questions); // <-- only one!

        ArrayList<SurveyQuestions> surveyQuestionsArrayList10 = new ArrayList<>();
        ArrayList<SurveyAnswers> surveyAnswersArrayList10 = new ArrayList<>();
        surveyQuestionsArrayList10.add(surveyQuestions10.questions); // <-- only one!

        // Note: add all survey responder fo S1..10 only
        s1.setSurveyQuestionsArrayList(surveyQuestionsArrayList01);
        s1.setSurveyAnswersArrayList(surveyAnswersArrayList01);

        s2.setSurveyQuestionsArrayList(surveyQuestionsArrayList02);
        s2.setSurveyAnswersArrayList(surveyAnswersArrayList02);

        s3.setSurveyQuestionsArrayList(surveyQuestionsArrayList03);
        s3.setSurveyAnswersArrayList(surveyAnswersArrayList03);

        s4.setSurveyQuestionsArrayList(surveyQuestionsArrayList04);
        s4.setSurveyAnswersArrayList(surveyAnswersArrayList04);

        s5.setSurveyQuestionsArrayList(surveyQuestionsArrayList05);
        s5.setSurveyAnswersArrayList(surveyAnswersArrayList05);

        s6.setSurveyQuestionsArrayList(surveyQuestionsArrayList06);
        s6.setSurveyAnswersArrayList(surveyAnswersArrayList06);

        s7.setSurveyQuestionsArrayList(surveyQuestionsArrayList07);
        s7.setSurveyAnswersArrayList(surveyAnswersArrayList07);

        s8.setSurveyQuestionsArrayList(surveyQuestionsArrayList08);
        s8.setSurveyAnswersArrayList(surveyAnswersArrayList08);

        s9.setSurveyQuestionsArrayList(surveyQuestionsArrayList09);
        s9.setSurveyAnswersArrayList(surveyAnswersArrayList09);

        s10.setSurveyQuestionsArrayList(surveyQuestionsArrayList10);
        s10.setSurveyAnswersArrayList(surveyAnswersArrayList10);

        // Note: add into TABLE - "LIST"
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);

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
