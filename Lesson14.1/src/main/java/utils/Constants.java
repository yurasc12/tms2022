package utils;

import lombok.experimental.UtilityClass;

import java.util.regex.Pattern;

@UtilityClass
public class Constants {
    public static final String REGEX_LOWER_LATIN = "[a-z15]{5,20}";
    public static Pattern PATERN = Pattern.compile(REGEX_LOWER_LATIN);


}
