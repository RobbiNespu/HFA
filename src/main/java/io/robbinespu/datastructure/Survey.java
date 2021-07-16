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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Survey survey = (Survey) o;
        return Objects.equals(surveyQuestionsArrayList, survey.surveyQuestionsArrayList) && Objects.equals(surveyAnswersArrayList, survey.surveyAnswersArrayList);
    }

    @Override
    public int hashCode() {
        int result = surveyQuestionsArrayList != null ? surveyQuestionsArrayList.hashCode() : 0;
        result = 31 * result + (surveyAnswersArrayList != null ? surveyAnswersArrayList.hashCode() : 0);
        return result;
    }
}
