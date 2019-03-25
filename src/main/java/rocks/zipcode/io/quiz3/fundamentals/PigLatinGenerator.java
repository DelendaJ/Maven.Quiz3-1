package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String tuffSay[] = str.split(" ");
        StringBuilder aStringBuilder = new StringBuilder();
        for (String thing : tuffSay) {
            aStringBuilder.append(translateWord(thing)).append(" ");
        }
        return aStringBuilder.toString().substring(0, aStringBuilder.length() - 1);
    }

    public String translateWord(String string) {
        if (startsWithVowel(string)) {
            string += "way";
        } else if (!hasVowels(string)) {
            string += "ay";
        } else {
            int blah = getIndexOfFirstVowel(string);
            String aSubstringOne = string.substring(0, blah);
            String aSubStringTwo = string.substring(blah);
            string = aSubStringTwo + aSubstringOne + "ay";

        }
        return string;
    }

}

