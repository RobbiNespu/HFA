package io.robbinespu.database;

import io.robbinespu.datastructure.TempRespondentOptions;

public class Question01_R007 {
    TempRespondentOptions tempRespondentOptions = new TempRespondentOptions();

    public TempRespondentOptions getRespondentOptions() {
        return tempRespondentOptions;
    }

    public void setRespondentOptions(TempRespondentOptions tempRespondentOptions) {
        this.tempRespondentOptions = tempRespondentOptions;
    }

    public Question01_R007() {
        // Add respondent
        tempRespondentOptions.setText("A"); //<------------ responded answers
    }
}
