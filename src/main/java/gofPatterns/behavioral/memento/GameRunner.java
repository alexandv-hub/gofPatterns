package gofPatterns.behavioral.memento;

public class GameRunner {
    public static void main(String[] args) throws InterruptedException {
        PacManGame game = new PacManGame();

        System.out.println("\nStarting new PacMan game...");

        Level level1 = new Level(1);
        game.setLevelAndDate(level1);
        System.out.println("\nPlaying Level 1...");
        Thread.sleep(1000);
        System.out.println("\nLevel 1 passed successfully!");
        System.out.println(game);

        Level level2 = new Level(2);
        game.setLevelAndDate(level2);
        System.out.println("\nPlaying Level 2...");
        Thread.sleep(1000);
        System.out.println("\nLevel 2 passed successfully!");
        System.out.println(game);

        Save save = game.save(); // Сохраняем состояние игры на уровне 2

        Level level3 = new Level(3);
        game.setLevelAndDate(level3);
        System.out.println("\nPlaying Level 3...");
        Thread.sleep(1000);
        System.out.println("\nLevel 3 failed !!!");

        game.load(save); // Восстанавливаем сохраненное состояние игры на уровне 2
        System.out.println(game);
    }
}
