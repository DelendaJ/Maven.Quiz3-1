package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Map<SomeType, Integer> thisIsAMap = new HashMap<>();
        SomeType answer = null;
        for (SomeType aType : array) {
            if (thisIsAMap.containsKey(aType)) {
                thisIsAMap.put(aType, thisIsAMap.get(aType) + 1);
            } else {
                thisIsAMap.put(aType, 1);
            }
        }
        for (Map.Entry<SomeType, Integer> anEntry : thisIsAMap.entrySet()) {
            SomeType key = anEntry.getKey();
            Integer value = anEntry.getValue();
            if (value % 2 != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Integer> map = new HashMap<>();
        SomeType answer = null;
        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<SomeType, Integer> entry : map.entrySet()) {
            SomeType key = entry.getKey();
            Integer value = entry.getValue();
            if (value % 2 == 0) {
                answer = key;
            }
        }
        return answer;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        ArrayList<SomeType> anArrayList = new ArrayList<SomeType>(Arrays.asList(array));
        int count = 0;

        for (SomeType someTypeOfThing: array) {
            if (someTypeOfThing == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
