package io.robbinespu.datastructure;

import java.util.Arrays;

public class SurveyAnswers {
    String[] answers;  // declare without size

    public SurveyAnswers() {

    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public SurveyAnswers(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "\nSurveyAnswers{"+
                "\n answers="+ Arrays.toString(getAnswers()) +
                "\n}";
    }
}
