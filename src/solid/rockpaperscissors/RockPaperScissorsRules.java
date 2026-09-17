package solid.rockpaperscissors;

import solid.GameResult;
import solid.GameRules;
import solid.Gesture;

public class RockPaperScissorsRules implements GameRules {
    @Override
    public GameResult determineWinner(
            Gesture humanGesture,
            Gesture computerGesture) {

        if (humanGesture.getType() == computerGesture.getType()) {
            return GameResult.DRAW;
        }

        if (humanGesture.getType() == GestureType.ROCK) {
            return computerGesture.getType() == GestureType.PAPER
                    ? GameResult.COMPUTER_WIN
                    : GameResult.HUMAN_WIN;
        }

        if (humanGesture.getType() == GestureType.PAPER) {
            return computerGesture.getType() == GestureType.SCISSORS
                    ? GameResult.COMPUTER_WIN
                    : GameResult.HUMAN_WIN;
        }

        if (humanGesture.getType() == GestureType.SCISSORS) {
            return computerGesture.getType() == GestureType.ROCK
                    ? GameResult.COMPUTER_WIN
                    : GameResult.HUMAN_WIN;
        }

        throw new IllegalArgumentException("Unsupported gesture");
    }
}
