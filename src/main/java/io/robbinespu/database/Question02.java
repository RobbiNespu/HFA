package io.robbinespu.database;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.Questionare;
import io.robbinespu.datastructure.QuestionareOptions;
import io.robbinespu.datastructure.Respondent;
import io.robbinespu.datastructure.RespondentOptions;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Question02 {
    ArrayList<Questionare> questionareArrayList =new ArrayList<>();
    Questionare q1 = new Questionare();
    LinkedHashMap<String,String> mcq1 = new LinkedHashMap<>();
    ArrayList<RespondentOptions> respondentOptionsArrayList = new ArrayList<>();
    Respondent r1=new Respondent();

    public ArrayList<Questionare> getQuestionareArrayList() {
        return questionareArrayList;
    }

    public void setQuestionareArrayList(ArrayList<Questionare> questionareArrayList) {
        this.questionareArrayList = questionareArrayList;
    }

    public Questionare getQ1() {
        return q1;
    }

    public void setQ1(Questionare q1) {
        this.q1 = q1;
    }

    public LinkedHashMap<String, String> getMcq1() {
        return mcq1;
    }

    public void setMcq1(LinkedHashMap<String, String> mcq1) {
        this.mcq1 = mcq1;
    }

    public ArrayList<RespondentOptions> getRespondentOptionsArrayList() {
        return respondentOptionsArrayList;
    }

    public void setRespondentOptionsArrayList(ArrayList<RespondentOptions> respondentOptionsArrayList) {
        this.respondentOptionsArrayList = respondentOptionsArrayList;
    }

    public Respondent getR1() {
        return r1;
    }

    public void setR1(Respondent r1) {
        this.r1 = r1;
    }

    public Question02() {

        q1.setQuestionString("What is your gender?");
        q1.setQuestionType(Constants.SINGLE_CHOOSE_QUESTION);

        mcq1.put("A","Male");
        mcq1.put("B","Female");

        QuestionareOptions qo1 = new QuestionareOptions(mcq1);
        q1.setQuestionareOptions(qo1);

        questionareArrayList.add(q1); // Add all questions here

        // Add respondent
        RespondentOptions q1r1 = new RespondentOptions();
        q1r1.setText("A"); //<------------ responded answers
        respondentOptionsArrayList.add(q1r1); // Add all responded here

        r1.setTimeStamp("5/28/2021 14:18:22");
        r1.setQuestions(questionareArrayList);
        r1.setRespondentOptions(respondentOptionsArrayList);
    }
}
