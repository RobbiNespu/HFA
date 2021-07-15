package io.robbinespu.datastructure;

public class RespondentOptions {
    private String id;// A B C
    private String text;

    public RespondentOptions(String text) {
        this.text = text;
    }

    public RespondentOptions() {

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "\n RespondentOptions{ " +
                "\n  text=" + getText() +
                "\n}";
    }
}
