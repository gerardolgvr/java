package dev.gerardo.exercises.regex;

public class RegexExercises {


    public static boolean validateName(String str) {
        return str.matches("([u]+)|[you]+|yo[u]+");
    }

    public static String replacement(String str) {
        return str.replaceAll("\\b[you+]+\\b|\\b[u]+\\b", "your client");
    }

    // validate ISBN with 13 digits , always starts with 978 o 979
    public static boolean validateISBN(String str) {
        return str.matches("^(978|979)[0-9]{10}$");
    }

    // validate twitter user
    public static boolean validateTwitterUser(String user) {
        return user.matches("^@([0-9a-zA-Z-_]{1,20})$");
    }

    // validate email
    public static boolean validateEmail(String email) {
        return email.matches("^[0-9a-zA-Z-_\\.]+@[a-zA-Z0-9]+(.[a-z-A-Z])+$");
    }

    public static boolean validateEmailAlt(String email) {
        return email.matches("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
    }

    // validate name
    public static boolean validateNameM(String name) {
        return name.matches("^([(A-Z]{1}[a-z]+ ?){1,3}");
    }


    public static boolean validateInteger(String number) {
        return number.matches("^-?[\\d]+$");
    }

    public static boolean validatePositiveInteger(String positiveNumber) {
        return positiveNumber.matches("^[\\d]+$");
    }

    public static boolean validateNegativeInteger(String negativeNumber) {
        return negativeNumber.matches("^-[\\d]+$");
    }

    public static boolean validateDNI(String dni) {
        return dni.matches("^\\d{8}[A-Z]{1}$");
    }

    public static boolean validateIP(String ip) {
        return ip.matches("(([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]).){3}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])");
    }

    public static boolean validateReg(String string, String pattern) {
        return string.matches(pattern);
    }

    public static boolean validateW(String s) {
        return s.matches("^(http://|https://)?(www.)?([a-zA-Z0-9]+.){2}[a-z]+(\\/[a-zA-Z0-9#_!@.,=:-]+\\/?)*$");
        //return s.matches("(google)");
    }

    public static String validateV(String s) {
        //return s.replaceAll("[\\/0-9aeiou#_!@.,-=:]|(\\b[https]\\b)*", "");
        return s.replaceAll("(\\b*(https|http)\\b*)?[\\/aeiou0-9#_!@.,-=:]?", "");
    }
}
