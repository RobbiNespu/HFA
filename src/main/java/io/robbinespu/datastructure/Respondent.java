package io.robbinespu.datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Respondent {
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    ArrayList<Questionare> questions = new ArrayList<>();
    ArrayList<RespondentOptions> respondentOptions = new ArrayList<>();

    public Respondent() {

    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setQuestions(ArrayList<Questionare> questions) {
        this.questions = questions;
    }

    public void setRespondentOptions(ArrayList<RespondentOptions> respondentOptions) {
        this.respondentOptions = respondentOptions;
    }

    public ArrayList<Questionare> getQuestions() {
        return questions;
    }

    public String getRespondentOptions() {
        //return respondentOptions;
        //Getting Iterator
        Iterator itr=respondentOptions.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            RespondentOptions st=(RespondentOptions)itr.next();
            //System.out.println(st.getText());
            return st.getText();
        }
        return null;
    }

    public Respondent(String timeStamp, ArrayList<Questionare> questions, ArrayList<RespondentOptions> respondentOptions) {
        this.timeStamp = timeStamp;
        this.questions = questions;
        this.respondentOptions = respondentOptions;
    }

    @Override
    public String toString() {
        return "\n-------------------------------------------------" +
                "\nRespondent{ " +
                "\ntimeStamp=" + getTimeStamp() +
                ",\n question="+getQuestions() +
                ",\n " + respondentOptions.toString() +
                "\n}";
    }
}
