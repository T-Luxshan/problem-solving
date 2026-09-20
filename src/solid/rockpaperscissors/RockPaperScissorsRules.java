package solid.rockpaperscissors;

import solid.GameResult;
import solid.GameRules;
import solid.Gesture;

import java.util.Objects;

public class RockPaperScissorsRules implements GameRules {
    @Override
    public GameResult determineWinner(
            Gesture humanGesture,
            Gesture computerGesture) {

        if (humanGesture.getType() == computerGesture.getType()) {
            return GameResult.DRAW;
        }

        if (Objects.equals(humanGesture.getType(), "ROCK")) {
            return Objects.equals(computerGesture.getType(), "PAPER")
                    ? GameResult.COMPUTER_WIN
                    : GameResult.HUMAN_WIN;
        }

        if (Objects.equals(humanGesture.getType(), "PAPER")) {
            return Objects.equals(computerGesture.getType(), "SCISSORS")
                    ? GameResult.COMPUTER_WIN
                    : GameResult.HUMAN_WIN;
        }

        if (Objects.equals(humanGesture.getType(), "SCISSORS")) {
            return Objects.equals(computerGesture.getType(), "ROCK")
                    ? GameResult.COMPUTER_WIN
                    : GameResult.HUMAN_WIN;
        }

        throw new IllegalArgumentException("Unsupported gesture");
    }
}
