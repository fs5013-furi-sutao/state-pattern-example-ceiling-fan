package clean.state;

import clean.CeilingFanPullChain;
import clean.state.constant.SpeedStateType;

public class Low implements SpeedState{
    public static final SpeedStateType STATE = SpeedStateType.LOW;

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setSpeedState(new Medium());
        STATE.showNameJa();
    }

}
