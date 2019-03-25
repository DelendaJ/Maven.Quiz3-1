package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        return new String(arr);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char c = baseString.charAt(indexOfString);

        return (c == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        List<String> subsList = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length() - i; j++) {
                String blah = string.substring(i, i + j);
                subsList.add(blah);
            }
        }
        return subsList.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] stuff = getAllSubStrings(input);
        return stuff.length-1;
    }
}
