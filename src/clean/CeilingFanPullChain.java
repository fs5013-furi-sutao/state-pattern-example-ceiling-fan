package clean;

import clean.state.Off;
import clean.state.SpeedState;

public class CeilingFanPullChain {
    private SpeedState currentState;

    public CeilingFanPullChain() {
        this.currentState = new Off();
    }

    public void setSpeedState(SpeedState state) {
        this.currentState = state;
    }

    public void pull() {
        this.currentState.pull(this);
    }
}
