package solid;

public interface  GameRules {
    GameResult determineWinner(Gesture humanGesture, Gesture computerGesture);
}
