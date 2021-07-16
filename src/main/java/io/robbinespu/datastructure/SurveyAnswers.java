package io.robbinespu.datastructure;

import java.util.Arrays;

public class SurveyAnswers {
    int surveyType; // take value from Constants.java
    String[] answers;  // declare without size

    public SurveyAnswers() {

    }

    public int getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(int surveyType) {
        this.surveyType = surveyType;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public SurveyAnswers(int surveyType, String[] answers) {
        this.surveyType = surveyType;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "\nSurveyAnswers{"+
                "\n surveyType="+getSurveyType()+
                "\n answers="+ Arrays.toString(getAnswers()) +
                "\n}";
    }
}
