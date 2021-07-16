package io.robbinespu.datastructure;

import java.util.LinkedHashMap;

public class TempSurveyQuestionsOptions {
    LinkedHashMap<String,String> mcq = new LinkedHashMap<>();
    Boolean tf;
    String fillInTheBlank;

    public LinkedHashMap<String, String> getMcq() {
        return mcq;
    }

    public void setMcq(LinkedHashMap<String, String> mcq) {
        this.mcq = mcq;
    }

    public Boolean getTf() {
        return tf;
    }

    public void setTf(Boolean tf) {
        this.tf = tf;
    }

    public String getFillInTheBlank() {
        return fillInTheBlank;
    }

    public void setFillInTheBlank(String fillInTheBlank) {
        this.fillInTheBlank = fillInTheBlank;
    }

    public TempSurveyQuestionsOptions(LinkedHashMap<String,String> mcq) {
        this.mcq = mcq;
    }

    public TempSurveyQuestionsOptions(Boolean tf) {
        this.tf = tf;
    }

    public TempSurveyQuestionsOptions(String fillInTheBlank) {
        this.fillInTheBlank = fillInTheBlank;
    }

@Override
    public String toString(){
    return "QuestionOption{ " +
               "\n   fillInTheBlank=" + getFillInTheBlank()+
               ",\n   trueFalse="+getTf() +
               ",\n   mcq=" + getMcq() +
               "\n  }";
    }
}
