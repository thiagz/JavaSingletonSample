package org.thiagz.singleton;

/**
 *
 * @author Thiagz
 */
public class PersonalLoggerSimple {

    private StringBuilder logString;
    private static PersonalLoggerSimple personalLoggerSimple;

    private PersonalLoggerSimple() {
        logString = new StringBuilder();
    }

    public static PersonalLoggerSimple getInstance() {
        if (personalLoggerSimple == null) {
            personalLoggerSimple = new PersonalLoggerSimple();
        }
        
        return personalLoggerSimple;
    }
    
    public void log(String message){
        logString.append(message);
    }
}
