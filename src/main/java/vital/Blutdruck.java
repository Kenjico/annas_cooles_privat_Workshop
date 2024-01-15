package vital;

import java.time.LocalDateTime;

public class Blutdruck {

    public static int MAX = 160;
    public static int MIN = 100;
    private String wert;
    private LocalDateTime time;
    private int max;
    private int min;

    public Blutdruck(String wert, int max, int min) {
        this.max = MAX;
        this.min = MIN;
        this.wert = wert;
        this.min = min;
        this.max = max;
        if (min < 100) {
            throw new IllegalArgumentException("Der diastolische Wert ist zu niedrig!");
        } else if (max > 160) {
            throw new IllegalArgumentException("Der systolische Wert ist zu hoch!");
        } else {
            this.time = LocalDateTime.now();
        }
    }

    public Blutdruck(String wert) {
        this(wert, MAX, MIN);
    }

    public Blutdruck() {
        this("NA");
    }

    public String auslesen() {
        return Integer.valueOf(this.wert.split("/")[0]) >= this.max ? "!!!: " + this.wert + "/ um " + this.time.toLocalDate() : this.wert + "/ um " + this.time.toLocalDate();
    }

    public void erfassen(String wert) {
        if (wert.equalsIgnoreCase("NA")) {
            this.wert = wert;
        }

    }
}
