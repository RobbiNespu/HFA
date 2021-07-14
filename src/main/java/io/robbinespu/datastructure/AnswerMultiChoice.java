package io.robbinespu.datastructure;

public class AnswerMultiChoice {
    private Option[] options;
    private char[] answers;

    public AnswerMultiChoice(int id, String text, Option[] options, char[] answers) {
        this.answers = answers;
        this.options = options;
    }
}
