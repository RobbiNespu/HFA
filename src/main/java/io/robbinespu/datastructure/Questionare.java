package io.robbinespu.datastructure;

import java.util.ArrayList;

public class Questionare {
    String questionString ;
    int questionType;
    QuestionareOptions questionareOptions;

    public Questionare() {

    }

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

    public QuestionareOptions getQuestionareOptions() {
        return questionareOptions;
    }

    public void setQuestionareOptions(QuestionareOptions questionareOptions) {
        this.questionareOptions = questionareOptions;
    }

    public Questionare(String questionString, int questionType, QuestionareOptions questionareOptions) {
        this.questionString = questionString;
        this.questionType = questionType;
        this.questionareOptions = questionareOptions;
    }


    @Override
    public String toString() {
     return "\nQuestion{ " +
             "\ntype=" + getQuestionType() +
               ",\n question="+getQuestionString() +
               ",\n option=" + getQuestionareOptions().toString() +
               "\n}";
   }
}
