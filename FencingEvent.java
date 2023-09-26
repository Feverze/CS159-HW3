/**
 * Enum that handles the actual Fencing Event.
 * 
 * @author frankiebenedetto
 * 
 * @version 1.0
 * 
 */
public enum FencingEvent {
    FOIL(500, false, BodyPart.TORSO, BodyPart.CROTCH),
    EPEE(775, false, BodyPart.TORSO, BodyPart.CROTCH, BodyPart.ARMS,
            BodyPart.LEGS, BodyPart.HANDS, BodyPart.HEAD),
    SABRE(500, true, BodyPart.HEAD, BodyPart.ARMS, BodyPart.TORSO);

    private int maximumWeight;
    private boolean edgeOK;
    private BodyPart[] targets;

    /**
     * Just initializes.
     *
     * @param maximumWeight Its the max weight.
     * @param edgeOK Going to be used to check if the edge is allowed.
     * @param targets Its an array of the body parts that are targets.
     */
    FencingEvent(int maximumWeight, boolean edgeOK, BodyPart... targets) {
        this.maximumWeight = maximumWeight;
        this.edgeOK = edgeOK;
        this.targets = targets;
    }

    /**
     * Gets the max weight.
     *
     * @return maximumWeight It returns the max weight.
     */
    public int getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * Checks to see if the hit is on a target.
     *
     * @param target its an array of targets that can be hit.
     * @return true If the target is allowed to be hit, false otherwise.
     */
    public boolean isOnTarget(BodyPart target) {
        for (BodyPart x : targets) {
            if (target == x) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the part is legal for a hit.
     * 
     * @param part The part of the blade.
     * @return true if the part is legal false if not.
     */
    public boolean isLegalBladePart(BladePart part) {
        if (edgeOK) {
            return true;
        } else {
            return part == BladePart.TIP;
        }
    }

    /**
     * Checks if a point is secured.
     * 
     * @param part blade part.
     * @param target targets allowed to be hit.
     *
     * @return true if a point is allowed false otherwise.
     */
    public boolean isScoringTouch(BladePart part, BodyPart target) {
        return isLegalBladePart(part) && isOnTarget(target);
    }
}
