package io.robbinespu.datastructure;

public class TempRespondentOptions {
    private String id;// A B C
    private String text;

    public TempRespondentOptions(String text) {
        this.text = text;
    }

    public TempRespondentOptions() {

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
        return "\nRespondentOptions{ " +
                "\n text=" + getText() +
                "\n}";
    }
}
