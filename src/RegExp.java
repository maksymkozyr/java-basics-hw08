import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression
        String bytePattern = "(2[0-4][0-9]|25[0-5]|1\\d{2}|\\d{1,2})";
        Pattern p = Pattern.compile(String.format("(?<!\\d)(%s\\.){3}%s(?!\\d)", bytePattern, bytePattern));

        Matcher m = p.matcher(text);


        if (m.find()){
            return m.group();
        } else {
            return "";
        }
    }
}