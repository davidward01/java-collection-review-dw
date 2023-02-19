import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergio");
        map.put(2, "Moses");
        System.out.println(map.get(2));

        /**
         * Algorithm Problem:
         * Find the first non-repeating char in a string
         * Example String = "Java Developer"
         * Output should be J because it is the first char that doesn't repeat
         */

        System.out.println(findFirstNonRepeatingChar("Java Developer"));

    }

    public static Character findFirstNonRepeatingChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        int count;
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }

}
