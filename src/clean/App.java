package clean;
import java.util.Scanner;

public class App {
    private static final Scanner STDIN = new Scanner(System.in);
    private static final String MSG_PRESS_ENTER = "ENTER キーを押してください.";
    private static final String BREAK_LINE = "\n";
    public static void main(String[] args) {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        spendLife(chain);
    }

    private static void spendLife(CeilingFanPullChain chain) {
            show(MSG_PRESS_ENTER);
            recieveInputtedEnterKey();
            chain.pull();
            show(BREAK_LINE);
            spendLife(chain);
    }

    private static void show(String message) {
        System.out.print(message);
    }

    private static String recieveInputtedEnterKey() {
        return STDIN.nextLine();
    }
}
