package io.robbinespu.datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TempRespondentPersons {
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    ArrayList<SurveyQuestions> questions = new ArrayList<>();
    ArrayList<TempRespondentOptions> tempRespondentOptions = new ArrayList<>();

    public TempRespondentPersons() {

    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setQuestions(ArrayList<SurveyQuestions> questions) {
        this.questions = questions;
    }

    public void setRespondentOptions(ArrayList<TempRespondentOptions> tempRespondentOptions) {
        this.tempRespondentOptions = tempRespondentOptions;
    }

    public ArrayList<SurveyQuestions> getQuestions() {
        return questions;
    }

    public String getRespondentOptions() {
        //return respondentOptions;
        //Getting Iterator
        Iterator itr= tempRespondentOptions.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            TempRespondentOptions st=(TempRespondentOptions)itr.next();
            //System.out.println(st.getText());
            return st.getText();
        }
        return null;
    }

    public TempRespondentPersons(String timeStamp, ArrayList<SurveyQuestions> questions, ArrayList<TempRespondentOptions> tempRespondentOptions) {
        this.timeStamp = timeStamp;
        this.questions = questions;
        this.tempRespondentOptions = tempRespondentOptions;
    }

    @Override
    public String toString() {
        return "\n-------------------------------------------------" +
                "\nRespondent{ " +
                "\ntimeStamp=" + getTimeStamp() +
                ",\n question="+getQuestions() +
                ",\n " + tempRespondentOptions.toString() +
                "\n}";
    }
}
