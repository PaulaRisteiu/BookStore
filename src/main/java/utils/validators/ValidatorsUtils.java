package utils.validators;

import domain.validator.ValidatorException;

public class ValidatorsUtils {
    public static void stringLengthLimitation(String attributeName, String input, int min, int max) {
        if (input.length() < 1 || input.length() >= 100) {
            throw new ValidatorException("Invalid input <<" + input + ">> for <<" + attributeName + ">> : please enter a string between " + min + " and " + max + ".");
        }
    }

    public static void yearNumber(String attributeName, Integer input) {
        if (input < 1000 && input>2025) {
            throw new ValidatorException("Invalid input <<" + input + ">> for <<" + attributeName + ">> : please enter a positive number.");
        }
    }

    public static void positiveNumber(String attributeName, Double input) {
        if (input < 0) {
            throw new ValidatorException("Invalid input <<" + input + ">> for <<" + attributeName + ">> : please enter a positive number.");
        }
    }

    public static Boolean validateAndParseBoolean(String attributeName, String input){
        if(input == null || (!input.equalsIgnoreCase("true") && !input.equalsIgnoreCase("false"))){
            throw new IllegalArgumentException("Invalid input <<" + input + ">> for <<" + attributeName + ">>: please enter 'true'  or 'false'.");
        }
        //convert to Boolean
        return Boolean.parseBoolean(input.toLowerCase());
    }
}
