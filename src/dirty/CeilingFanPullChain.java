package dirty;
public class CeilingFanPullChain {
    private Speed currentState;

    public CeilingFanPullChain() {
        this.currentState = Speed.TURNING_OFF;
    }

    public void pull() {
        switch (this.currentState) {
            case TURNING_OFF:
                currentState = Speed.LOW_SPEED;
                break;
            case LOW_SPEED:
                currentState = Speed.MEDIUM_SPEED;
                break;
            case MEDIUM_SPEED:
                currentState = Speed.HIGH_SPEED;
                break;
            default:
                currentState = Speed.TURNING_OFF;
                break;
        }
        this.currentState.showNameJa();
    }
}
