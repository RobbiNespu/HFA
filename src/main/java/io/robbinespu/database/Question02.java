package io.robbinespu.database;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;
import io.robbinespu.datastructure.TempSurveyQuestionsOptions;
import io.robbinespu.datastructure.TempRespondentOptions;

import java.util.LinkedHashMap;

public class Question02 {

    SurveyQuestions q1 = new SurveyQuestions();
    LinkedHashMap<String,String> mcq1 = new LinkedHashMap<>();




    public TempRespondentOptions getQ1r1() {
        return q1r1;
    }

    public void setQ1r1(TempRespondentOptions q1r1) {
        this.q1r1 = q1r1;
    }

    TempRespondentOptions q1r1 = new TempRespondentOptions();


    public SurveyQuestions getQ1() {
        return q1;
    }

    public void setQ1(SurveyQuestions q1) {
        this.q1 = q1;
    }

    public LinkedHashMap<String, String> getMcq1() {
        return mcq1;
    }

    public void setMcq1(LinkedHashMap<String, String> mcq1) {
        this.mcq1 = mcq1;
    }



    public Question02() {

        q1.setQuestionString("What is your age?");
        q1.setQuestionType(Constants.ANSWER_SINGLE);

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

        TempSurveyQuestionsOptions qo1 = new TempSurveyQuestionsOptions(mcq1);
        //q1.setQuestionareOptions(qo1);



        // Add respondent

        q1r1.setText("A"); //<------------ responded answers


    }
}
