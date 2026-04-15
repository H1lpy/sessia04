package sessia29;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    public static Map<Character, Integer> characterFrequency(String str) {
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int countChar = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == str.charAt(i))
                    countChar += 1;
            }
            res.put(str.charAt(i), countChar);
        }

        return res;
    }

    public static char mostFrequentCharacter(String str) {
        Character res = ' ';
        int count = 0;
        
        for(Map.Entry<Character, Integer> el : characterFrequency(str).entrySet()) {
            if(el.getValue() > count) {
                res = el.getKey();
                count = el.getValue();
            }
        }
        
        return res;
    }

    public static char leastFrequentCharacter(String str) {
        Character res = ' ';
        Integer count = null;

        for(Map.Entry<Character, Integer> el : characterFrequency(str).entrySet()) {
            if(count == null) {
                count = el.getValue();
                res = el.getKey();
                continue;
            }
            if(el.getValue() < count) {
                res = el.getKey();
                count = el.getValue();
            }
        }

        return res;
    }
}
