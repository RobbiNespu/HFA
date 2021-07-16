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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyQuestions that = (SurveyQuestions) o;

        if (questionType != that.questionType) return false;
        if (questionString != null ? !questionString.equals(that.questionString) : that.questionString != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(surveyQuestionsOptions, that.surveyQuestionsOptions);
    }

    @Override
    public int hashCode() {
        int result = questionString != null ? questionString.hashCode() : 0;
        result = result+ questionType;
        result = 31 * result + Arrays.hashCode(surveyQuestionsOptions);
        return result;
        // (answers.hashCode())% Constants.TABLE_SZ;
    }
}
