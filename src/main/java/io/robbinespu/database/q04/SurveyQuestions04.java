package io.robbinespu.database.q04;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions04 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions04() {
        this.questions.setQuestionType(Constants.ANSWER_BOOLEAN);
        this.questions.setQuestionString("Have you been diagnosed with Covid-19?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "YES",
                "NO"
        });
    }
}
