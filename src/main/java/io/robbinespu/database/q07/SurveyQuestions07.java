package io.robbinespu.database.q07;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions07 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions07() {
        this.questions.setQuestionType(Constants.ANSWER_FILL);
        this.questions.setQuestionString("If No, why you don't want to take the vaccination?");
    }
}
