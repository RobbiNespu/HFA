package io.robbinespu.datastructure;

import java.util.*;

public class Survey {
    ArrayList<SurveyQuestions> surveyQuestionsArrayList;
    ArrayList<SurveyAnswers> surveyAnswersArrayList;

    public Survey(ArrayList<SurveyQuestions> surveyQuestionsArrayList, ArrayList<SurveyAnswers> surveyAnswersArrayList) {
        this.surveyQuestionsArrayList = surveyQuestionsArrayList;
        this.surveyAnswersArrayList = surveyAnswersArrayList;
    }

    public Survey() {

    }

    public ArrayList<SurveyQuestions> getSurveyQuestionsArrayList() {
        return surveyQuestionsArrayList;
    }

    public void setSurveyQuestionsArrayList(ArrayList<SurveyQuestions> surveyQuestionsArrayList) {
        this.surveyQuestionsArrayList = surveyQuestionsArrayList;
    }

    public ArrayList<SurveyAnswers> getSurveyAnswersArrayList() {
        return surveyAnswersArrayList;
    }

    public void setSurveyAnswersArrayList(ArrayList<SurveyAnswers> surveyAnswersArrayList) {
        this.surveyAnswersArrayList = surveyAnswersArrayList;
    }
}
