package gofPatterns.behavioral.memento;

import java.util.Date;

public class PacManGame {

    private Level level;
    private Date date;

    public void setLevelAndDate(Level level) {
        this.level = level;
        this.date = new Date();
    }

    public Save save() {
        System.out.println("Level " + level.getLevelNum() + " saved!");
        return new Save(level);
    }

    public void load(Save save) {
        System.out.println("\nLoading saved PacMan game...");
        this.level = save.getLevel();
        this.date = save.getDate();
    }

    @Override
    public String toString() {
        return "PacManGame: " +
                "\nlevel = " + level.getLevelNum() +
                "\ndate = " + date;
    }

}
