package io.robbinespu.database.q06;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions06 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions06() {
        this.questions.setQuestionType(Constants.ANSWER_BOOLEAN);
        this.questions.setQuestionString("Have you registered for Covid-19 vaccination program?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "Male",
                "Female"
        });
    }
}
