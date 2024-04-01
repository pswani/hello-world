package pwani.ddd.guards;

import org.apache.commons.lang3.StringUtils;

public class StringGuards {
    private StringGuards(){}

    public static void checkNotEmpty(String name, String value){
        if (StringUtils.isBlank(value)){
            throw new IllegalArgumentException(String.format("%s cannot be null or empty", name));
        }
    }

    public static void checkNotMultiline(String name, String value){
        if (value ==null||value.matches(".*\\n.*")){
            throw new IllegalArgumentException(String.format("%s cannot be null or span multiple lines", name));
        }
    }

}
