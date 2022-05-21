package clean.state.constant;

public enum SpeedStateType {

        LOW("低速"), MEDIUM("中速"), HIGH("高速"), OFF("停止"),;

        private final String nameJa;

        private SpeedStateType(String nameJa) {
            this.nameJa = nameJa;
        }

        public String nameJa() {
            return this.nameJa;
        }

        public void showNameJa() {
            System.out.println(this.nameJa);
        }
}
