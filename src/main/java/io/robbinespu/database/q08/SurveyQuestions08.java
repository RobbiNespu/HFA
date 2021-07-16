package io.robbinespu.database.q08;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions08 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions08() {
        this.questions.setQuestionType(Constants.ANSWER_BOOLEAN);
        this.questions.setQuestionString("Have you received appointment date for vaccination?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "YES",
                "NO"
        });
    }
}
