package io.robbinespu.datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Respondent {
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    ArrayList<Questionare> questions = new ArrayList<>();
    ArrayList<RespondentOptions> respondentOptions = new ArrayList<>();

    public Respondent(String timeStamp, ArrayList<Questionare> questions, ArrayList<RespondentOptions> respondentOptions) {
        this.timeStamp = timeStamp;
        this.questions = questions;
        this.respondentOptions = respondentOptions;
    }
}
