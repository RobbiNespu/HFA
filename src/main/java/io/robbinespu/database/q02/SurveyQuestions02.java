package io.robbinespu.database.q02;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions02 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions02() {
        this.questions.setQuestionType(Constants.ANSWER_SINGLE);
        this.questions.setQuestionString("What is your gender?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "Male",
                "Female"
        });
    }
}
