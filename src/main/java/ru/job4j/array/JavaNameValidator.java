package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            return isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)
                || Character.isDigit(name.charAt(i));
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
         return code == 36 || code == 95 ? true : false;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90 ? true : false;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122 ? true : false;
    }
}
