package es.jesustfk.javatest.util;

public class StringUtil {
    public static String repeat(String str, int times) {
        StringBuilder resutl = new StringBuilder();

        if(times < 0)
            throw new IllegalArgumentException("negative times not allowed");

        for (int i = 0; i < times; i++) {
            resutl.append(str);
        }

        return resutl.toString();
    }

    public static boolean isEmpty(String str) {

        return str == null || str.trim().length() == 0;
    }
}
