package io.robbinespu.datastructure;

import java.util.Arrays;

public class SurveyQuestions {
    String questionString ;
    int questionType; // take value from Constants.java
    String[] surveyQuestionsOptions;

    //constructor
    public SurveyQuestions() {

    }

    public SurveyQuestions(String questionString, int questionType) {
        this.questionString = questionString;
        this.questionType = questionType;
    }

    public SurveyQuestions(String questionString, int questionType, String[] surveyQuestionsOptions) {
        this.questionString = questionString;
        this.questionType = questionType;
        this.surveyQuestionsOptions = surveyQuestionsOptions;

    }

    //setter getter
    public String getQuestionString() {
        return questionString;
    }
    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }
    public int getQuestionType() {
        return questionType;
    }
    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }
    public String[] getSurveyQuestionsOptions() {
        return surveyQuestionsOptions;
    }

    public void setSurveyQuestionsOptions(String[] surveyQuestionsOptions) {
        this.surveyQuestionsOptions = surveyQuestionsOptions;
    }

    @Override
    public String toString() {
        return "\nSurveyQuestions{" +
                "\n QuestionString="+getQuestionString() +
                "\n QuestionType="+getQuestionType() +
                "\n QuestionOptions="+ Arrays.toString(getSurveyQuestionsOptions())+
                "\n}";
    }
}
