package io.robbinespu.datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Survey {
    LinkedHashMap<SurveyQuestions, SurveyAnswers> surveyQuestionsSurveyAnswersLinkedHashMap;

    public Survey() {

    }

    public LinkedHashMap<SurveyQuestions, SurveyAnswers> getSurveyQuestionsSurveyAnswersLinkedHashMap() {
        return surveyQuestionsSurveyAnswersLinkedHashMap;
    }
    @Override
    public String toString() {
        return "\nSurvey {"+
                "\nsize["+getSurveyQuestionsSurveyAnswersLinkedHashMap().size()+"]"+
                "\nLinkedHashMap"+surveyQuestionsSurveyAnswersLinkedHashMap+
                "\n}";
    }

    public void setSurveyQuestionsSurveyAnswersLinkedHashMap(LinkedHashMap<SurveyQuestions, SurveyAnswers> surveyQuestionsSurveyAnswersLinkedHashMap) {
        this.surveyQuestionsSurveyAnswersLinkedHashMap = surveyQuestionsSurveyAnswersLinkedHashMap;
    }

    public Survey(LinkedHashMap<SurveyQuestions, SurveyAnswers> surveyQuestionsSurveyAnswersLinkedHashMap ) {
        this.surveyQuestionsSurveyAnswersLinkedHashMap = surveyQuestionsSurveyAnswersLinkedHashMap;
    }
}
