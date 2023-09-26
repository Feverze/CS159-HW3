/**
 * Class that is the actual bout.
 * 
 * @author frankiebenedetto
 * 
 * @version 1.0
 * 
 */
public class Bout {
    private FencingEvent event;
    private int scoreLeft;
    private int scoreRight;
    private String fencerLeft;
    private String fencerRight;

    /**
     * Just initializes.
     *
     * @param event what event is happening.
     * @param fencerLeft the fencer on the left.
     * @param fencerRight the fencer on the right.
     */
    Bout(FencingEvent event, String fencerLeft, String fencerRight) {
        this.event = event;
        this.fencerLeft = fencerLeft;
        this.fencerRight = fencerRight;
    }

    public FencingEvent getEvent() {
        return event;
    }

    public String getLeftFencer() {
        return fencerLeft;
    }

    public String getRightFencer() {
        return fencerRight;
    }

    /**
     * Increases score of left fencer.
     */
    public void increaseLeftScore() {
        scoreLeft++;
    }

    /**
     * Increases score of right fencer.
     */
    public void increaseRightScore() {
        scoreRight++;
    }

    /**
     * Outputs a string of the matches data.
     * 
     * @return a string.
     */
    public String toString() {
        return String.format("%s %d, %s %d", fencerLeft, scoreLeft, fencerRight,
                scoreRight);

    }
}
