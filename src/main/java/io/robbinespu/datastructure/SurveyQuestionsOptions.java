package io.robbinespu.datastructure;

public class SurveyQuestionsOptions {
    String id;
    String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SurveyQuestionsOptions(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public SurveyQuestionsOptions(String text) {
        this.text = text;
    }
}
