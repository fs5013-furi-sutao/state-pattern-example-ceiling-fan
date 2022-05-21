package clean.state;

import clean.CeilingFanPullChain;
import clean.state.constant.SpeedStateType;

public class High implements SpeedState {
    public static final SpeedStateType STATE = SpeedStateType.HIGH;

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setSpeedState(new Off());
        STATE.showNameJa();
    }
}
