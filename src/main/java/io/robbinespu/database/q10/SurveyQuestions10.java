package io.robbinespu.database.q10;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions10 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions10() {
        this.questions.setQuestionType(Constants.ANSWER_SINGLE);
        this.questions.setQuestionString("In your opinion, other than lockdown, do you believe vaccine can help to reduce/prevent the spread of Covid-19?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "YES",
                "NO",
                "Not sure"
        });
    }
}
