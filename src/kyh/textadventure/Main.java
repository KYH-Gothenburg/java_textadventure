package kyh.textadventure;

public class Main {
    public static void main(String[] args) {
        TextAdventureGame tag = new TextAdventureGame();
        tag.initialization();
        tag.runGame();
        tag.quit();
    }
}
