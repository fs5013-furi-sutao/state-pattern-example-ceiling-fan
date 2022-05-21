package dirty;
public enum Speed {

    LOW_SPEED("低速"), MEDIUM_SPEED("中速"), HIGH_SPEED("高速"), TURNING_OFF("停止"),;

    private final String nameJa;

    private Speed(String nameJa) {
        this.nameJa = nameJa;
    }

    public String nameJa() {
        return this.nameJa;
    }

    public void showNameJa() {
        System.out.println(this.nameJa);
    }
}
