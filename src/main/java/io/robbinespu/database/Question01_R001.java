package io.robbinespu.database;

import io.robbinespu.datastructure.RespondentOptions;

public class Question01_R001 {
    RespondentOptions respondentOptions = new RespondentOptions();

    public RespondentOptions getRespondentOptions() {
        return respondentOptions;
    }

    public void setRespondentOptions(RespondentOptions respondentOptions) {
        this.respondentOptions = respondentOptions;
    }

    public Question01_R001() {
        // Add respondent
        respondentOptions.setText("A"); //<------------ responded answers
    }
}
