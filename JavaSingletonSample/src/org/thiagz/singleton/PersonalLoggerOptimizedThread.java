package org.thiagz.singleton;

/**
 *
 * @author Thiagz
 */
public class PersonalLoggerOptimizedThread {

    private StringBuilder logString;
    //The Java volatile keyword guarantees visibility of changes to variables across threads
    private static volatile PersonalLoggerOptimizedThread personalLoggerOptimizedThread;

    private PersonalLoggerOptimizedThread() {
        logString = new StringBuilder();
    }

    /*
     * Most optimized implementation in Singleton Pattern for Thread issues.
     * The syncronized block will be executed once during object creation only
     */
    public static PersonalLoggerOptimizedThread getInstance() {
        if (personalLoggerOptimizedThread == null) {
            synchronized (PersonalLoggerOptimizedThread.class) {
                if (personalLoggerOptimizedThread == null) {
                    personalLoggerOptimizedThread = new PersonalLoggerOptimizedThread();
                }
            }
        }

        return personalLoggerOptimizedThread;
    }

    public void log(String message) {
        logString.append(message);
    }
}
