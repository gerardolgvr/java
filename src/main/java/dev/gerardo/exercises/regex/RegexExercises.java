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
}
