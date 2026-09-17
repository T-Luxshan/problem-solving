package solid.rockpaperscissors;

import solid.GameResult;
import solid.GameRules;
import solid.Gesture;

public class RockPaperScissorsRules implements GameRules {
    @Override
    public GameResult determineWinner(Gesture humanGesture, Gesture computerGesture) {
        if(humanGesture.equals(computerGesture)){
            return GameResult.DRAW;
        }
        if(humanGesture.getType().equals((new Rock()).getType())){
            return computerGesture.equals(new Paper()) ? GameResult.COMPUTER_WIN : GameResult.HUMAN_WIN;
        }
        if(humanGesture.getType().equals(new Paper().getType())){
            return computerGesture.equals(new Scissors()) ? GameResult.COMPUTER_WIN : GameResult.HUMAN_WIN;
        }
        if(humanGesture.getType().equals(new Scissors().getType())){
            return computerGesture.equals(new Rock()) ? GameResult.COMPUTER_WIN : GameResult.HUMAN_WIN;
        }

        return null;
    }
}
