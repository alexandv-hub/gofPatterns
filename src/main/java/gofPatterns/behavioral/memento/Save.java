package gofPatterns.behavioral.memento;

import java.util.Date;

public class Save {

    private Level level;
    private Date date;

    public Save(Level level) {
        this.level = level;
        this.date = new Date();
    }

    public Level getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Save{" +
                "levelNum=" + level.getLevelNum() +
                ", date=" + date +
                '}';
    }
}
