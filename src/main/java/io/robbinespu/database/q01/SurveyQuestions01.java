package io.robbinespu.database.q01;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions01 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions01() {
        this.questions.setQuestionType(Constants.ANSWER_SINGLE);
        this.questions.setQuestionString("What is your age?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "Under 18",
                "18 - 24 years",
                "25 - 29 years",
                "30 - 34 years",
                "35 - 39 years",
                "40 - 44 years",
                "45 - 49 years",
                "50 - 54 years",
                "55 - 59 years",
                "60 years and above"
        });
    }
}
