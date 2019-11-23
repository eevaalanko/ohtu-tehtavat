package ohtu;

public class Main {
    public static void main(String[] args) {
        TennisGame game = new TennisGame("Borg", "Navratilova");

        System.out.println(game.getScore());

        game.wonPoint("player1");
        System.out.println(game.getScore());

        game.wonPoint("player1");
        System.out.println(game.getScore());

        game.wonPoint("player2");
        System.out.println(game.getScore());

        game.wonPoint("player1");
        System.out.println(game.getScore());
    }
}
