package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        word = word.toLowerCase();
        return (word.contains("a") || word.contains("e") || word.contains("i")
                || word.contains("o") || word.contains("u"));
    }


    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();
        return (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
                || word.startsWith("u"));
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        return (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');

    }
}
