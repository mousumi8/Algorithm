import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class maxOfCharcters {
	
	public static void main(String[] args) {
		maxOfCharctersFromString("mousumi");
    }
    
    public static void maxOfCharctersFromString(String S){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = S.toCharArray();
        Integer count = 1;
        for(Character c:chars){
              if(map.containsKey(c)){
                 count = map.get(c);
                  map.put(c,++count);  
              } else {
                  map.put(c,1);
              }
        }       
        int maxVal = Collections.max(map.values());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxVal) {
                System.out.println(entry.getKey());   
            }
        }
    }

}
