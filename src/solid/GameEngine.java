package solid;

public class GameEngine {
    private final Player humanPlayer;
    private final Player computerPlayer;
    private final GameRules gameRules;

    public GameEngine(Player humanPlayer, Player computerPlayer, GameRules gameRules) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.gameRules = gameRules;
    }
    public GameResult playRound() {

        Gesture humanGesture = humanPlayer.chooseGesture();

        Gesture computerGesture = computerPlayer.chooseGesture();

        return gameRules.determineWinner(
                humanGesture,
                computerGesture
        );
    }
}
