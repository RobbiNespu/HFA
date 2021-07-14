package io.robbinespu.datastructure;

import java.util.Arrays;

public class Question {
    protected int id;
    private String question;
    private int questionType; // multi, single
    private String answer;
    private int choiceNum;
    private String choiceStr;

    public Question() {
    }

    public Question(int questionType, String question,  String choiceStr, int choiceNum) {
        this.questionType = questionType;
        this.question = question;
        this.choiceStr = choiceStr;
        this.choiceNum = choiceNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getChoiceNum() {
        return choiceNum;
    }

    public void setChoiceNum(int choiceNum) {
        this.choiceNum = choiceNum;
    }

    public String getChoiceStr() {
        return choiceStr;
    }

    public void setChoiceStr(String choiceStr) {
        this.choiceStr = choiceStr;
    }

    @Override
    public String toString() {
        return "Question{" +
                "type=" + getQuestionType() +
                " question"+getQuestion() +
                ", Choice=" + getChoiceNum() +
                '}';
    }
}
