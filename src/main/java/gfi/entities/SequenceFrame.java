package gfi.entities;

/**
 * Created by Biel on 8/10/2016.
 */
public class SequenceFrame {
    String color;
    int time;

    public SequenceFrame(String color, int time) {
        this.color = color;
        this.time = time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
