package best.reich.ingros.util.game;

/**
 * @author fluffycq
 */


//
//

public class StopwatchUtil {
    private static long previousMS;

    public StopwatchUtil() {
        reset();
    }

    public static boolean hasCompleted(long milliseconds) {
        return (getCurrentMS() - previousMS >= milliseconds);
    }

    public void reset() {
        this.previousMS = getCurrentMS();
    }

    public long getPreviousMS() {
        return this.previousMS;
    }

    public static long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }
}