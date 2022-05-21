package clean.state;

import clean.CeilingFanPullChain;
import clean.state.constant.SpeedStateType;

public class Medium implements SpeedState {
    public static final SpeedStateType STATE = SpeedStateType.MEDIUM;

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setSpeedState(new High());
        STATE.showNameJa();
    }

}
