package solid.SwordsAndGuns;

import solid.GameResult;
import solid.GameRules;
import solid.Gesture;

public class SwordsAndGunsRules implements GameRules {
    @Override
    public GameResult determineWinner(Gesture humanGesture, Gesture computerGesture) {
        if(humanGesture.getType().equals(computerGesture.getType())){
            return GameResult.DRAW;
        }
        if(humanGesture.getType().equals("SWORD") && computerGesture.getType().equals("GUN")){
            return GameResult.COMPUTER_WIN;
        }
        if(humanGesture.getType().equals("GUN") && computerGesture.getType().equals("SWORD")){
            return GameResult.HUMAN_WIN;
        }
        throw new IllegalArgumentException("Unsupported gesture");
    }
}
