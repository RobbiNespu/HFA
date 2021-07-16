package io.robbinespu.database.q05;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions05 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions05() {
        this.questions.setQuestionType(Constants.ANSWER_SINGLE);
        this.questions.setQuestionString("In your opinion, when is the best time to take the vaccination?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "Immediately",
                "Next 3 months",
                "Next 6 months",
                "Next year",
                "I'm not sure"
        });
    }
}
