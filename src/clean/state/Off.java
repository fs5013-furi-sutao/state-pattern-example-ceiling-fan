package clean.state;

import clean.CeilingFanPullChain;
import clean.state.constant.SpeedStateType;

public class Off implements SpeedState {
    public static final SpeedStateType STATE = SpeedStateType.OFF;

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setSpeedState(new Low());
        STATE.showNameJa();
    }
}
