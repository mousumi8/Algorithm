import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharcater {

        public static void main(String[] args) {
            displayNonRepeatedCharcater("mousumi");
        }

        public static void displayNonRepeatedCharcater(String string) {
            char[] chars = string.toCharArray();
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
            for (Character ch : chars) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    Integer count = map.get(ch);
                    map.put(ch, ++count);
                }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println("First non-repeated cahracter is: " + entry.getKey());
                    break;
                }
            }

        }
}
