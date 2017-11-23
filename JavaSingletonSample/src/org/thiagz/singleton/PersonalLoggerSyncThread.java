package org.thiagz.singleton;

/**
 *
 * @author Thiagz
 */
public class PersonalLoggerSyncThread {

    private StringBuilder logString;
    private static PersonalLoggerSyncThread personalLoggerSyncThread;

    private PersonalLoggerSyncThread() {
        logString = new StringBuilder();
    }

    /*
     * This implementation can be expensive because of syncronized keyword but 
     * it is the simplest solution to handle Thread issues in Singleton Pattern
     */
    public static synchronized PersonalLoggerSyncThread getInstance() {
        if (personalLoggerSyncThread == null) {
            personalLoggerSyncThread = new PersonalLoggerSyncThread();
        }

        return personalLoggerSyncThread;
    }

    public void log(String message) {
        logString.append(message);
    }
}
