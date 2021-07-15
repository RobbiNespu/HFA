package io.robbinespu.datastructure;

import java.util.ArrayList;

public class Questionare {
    String questionString ;
    int questionType;
    ArrayList<QuestionareOptions> questionareOptions = new ArrayList<QuestionareOptions>();

    public Questionare(String questionString, int questionType, ArrayList<QuestionareOptions> questionareOptions) {
        this.questionString = questionString;
        this.questionType = questionType;
        this.questionareOptions = questionareOptions;
    }


//    @Override
//    public String toString() {
//        return "Question{" +
//                "type=" + getQuestionType() +
//                " question"+getQuestion() +
//                ", Choice=" + getChoiceNum() +
//                '}';
//    }
}
