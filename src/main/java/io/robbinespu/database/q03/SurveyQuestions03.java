package io.robbinespu.database.q03;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions03 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions03() {
        this.questions.setQuestionType(Constants.ANSWER_BOOLEAN);
        this.questions.setQuestionString("Do you believe in Covid-19?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "YES",
                "NO"
        });
    }
}
