package io.robbinespu.database;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.Questionare;
import io.robbinespu.datastructure.QuestionareOptions;

import java.util.LinkedHashMap;

public class Question01 {

    Questionare question = new Questionare();
    LinkedHashMap<String,String> questionOptionTypeMCQ = new LinkedHashMap<>();

    public Questionare getQuestion() {
        return question;
    }

    public void setQuestion(Questionare question) {
        this.question = question;
    }

    public LinkedHashMap<String, String> getQuestionOptionTypeMCQ() {
        return questionOptionTypeMCQ;
    }

    public void setQuestionOptionTypeMCQ(LinkedHashMap<String, String> questionOptionTypeMCQ) {
        this.questionOptionTypeMCQ = questionOptionTypeMCQ;
    }



    public Question01() {

        question.setQuestionString("What is your age?");
        question.setQuestionType(Constants.SINGLE_CHOOSE_QUESTION);

        questionOptionTypeMCQ.put("A","Under 18");
        questionOptionTypeMCQ.put("B","18 - 24 years");
        questionOptionTypeMCQ.put("C","25 - 29 years");
        questionOptionTypeMCQ.put("D","30 - 34 years");
        questionOptionTypeMCQ.put("E","35 - 39 years");
        questionOptionTypeMCQ.put("F","40 - 44 years");
        questionOptionTypeMCQ.put("G","45 - 49 years");
        questionOptionTypeMCQ.put("H","50 - 54 years");
        questionOptionTypeMCQ.put("I","55 - 59 years");
        questionOptionTypeMCQ.put("J","60 years and above");

        QuestionareOptions qo1 = new QuestionareOptions(questionOptionTypeMCQ);
        question.setQuestionareOptions(qo1);

    }
}
