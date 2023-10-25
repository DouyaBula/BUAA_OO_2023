import com.oocourse.elevator1.TimableOutput;

public class Main {
    private static final boolean LOG = false; // 调试信息输出开关
    private static final boolean DEBUG = false; // Debug类开关
    private static final int ELEVATOR = 6;  // 电梯总数
    private static final int FLOOR = 11;    // 楼层总数

    public static void main(String[] args) {
        TimableOutput.initStartTimestamp();
        if (DEBUG) {
            Debug debug = new Debug();
            debug.start();
            return;
        }
        Distributor distributor = new Distributor(ELEVATOR, FLOOR);
        distributor.start();
        if (LOG) {
            System.out.println(">> Main Thread exited");
        }
    }
}
