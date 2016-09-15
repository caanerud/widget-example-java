package entity;

/**
 * Created by doug on 9/6/16.
 */
public class Note {

    private int id;
    private String text;

    public Note(String text) {
        this.text = text;
    }
    public Note(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}