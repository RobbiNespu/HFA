package io.robbinespu.database.q09;

import io.robbinespu.Constants;
import io.robbinespu.datastructure.SurveyQuestions;

public class SurveyQuestions09 {
    public SurveyQuestions questions = new SurveyQuestions();
    public SurveyQuestions09() {
        this.questions.setQuestionType(Constants.ANSWER_MULTIPLE);
        this.questions.setQuestionString("If you been given an option to choose which brand of vaccine, which one would you choose?");
        this.questions.setSurveyQuestionsOptions(new String[]{
                "Pfizer-BioNTech",
                "Oxford Uni-AstraZeneca",
                "Sinovac",
                "others"
        });
    }
}
