package org.thiagz.singleton;

/**
 *
 * @author Thiagz
 */
public class PersonalLoggerJVMThread {

    private StringBuilder logString;
    private static PersonalLoggerJVMThread personalLoggerJVMThread 
            = new PersonalLoggerJVMThread();;

    private PersonalLoggerJVMThread() {
        logString = new StringBuilder();
    }

    /*
     * This implementation can be less expensive compared to syncronized because 
     * we rely on JVM to create instance of PersonalLogger. The JVM ensures 
     * the instance is created before any thread accesses the method
     */
    public static PersonalLoggerJVMThread getInstance() {
        return personalLoggerJVMThread;
    }

    public void log(String message) {
        logString.append(message);
    }
}
