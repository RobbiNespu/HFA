package io.robbinespu.datastructure;

public class Option {
    private char id;// A B C
    private String text;//

    public Option() {
    }

    public Option(char id, String text) {
        this.id = id;
        this.text = text;
    }

    public char getId(){
        return id;
    }
    public void setId(char id){
        this.id = id;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}
