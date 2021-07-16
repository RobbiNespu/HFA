package io.robbinespu.datastructure;

import io.robbinespu.Constants;

import java.util.Arrays;

public class SurveyAnswers {
    int id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyAnswers that = (SurveyAnswers) o;

        if (id != that.id) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(answers, that.answers);
    }

    @Override // NOTE: Awesome!
    public int hashCode() {
        int index = (answers.hashCode())% Constants.TABLE_SZ;
        //return Math.floorMod(key, Constants.TABLE_SZ);
        return index;
    }

    @Override
    public String toString() {
        return "\nSurveyAnswers{"+
                "\n answers="+ Arrays.toString(getAnswers()) +
                "\n}";
    }
}
