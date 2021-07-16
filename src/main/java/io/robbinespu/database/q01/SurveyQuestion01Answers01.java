package io.robbinespu.database.q01;

import io.robbinespu.datastructure.SurveyAnswers;

import java.util.Objects;

public class SurveyQuestion01Answers01 {
    int id;
    public SurveyAnswers surveyAnswers = new SurveyAnswers();
    public SurveyQuestion01Answers01() {
        this.surveyAnswers.setAnswers(new String[]{"30 - 34 years"});
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyQuestion01Answers01 that = (SurveyQuestion01Answers01) o;

        return Objects.equals(surveyAnswers, that.surveyAnswers);
    }

    @Override
    public int hashCode() {
        int result = id ^ (id >>> 0);
        result = 7 * result + surveyAnswers.hashCode();
        return result;
    }
}
