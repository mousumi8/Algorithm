import java.util.*;

public class SingleNumber {

        public static void main(String[] args){
            int[] nums = {4,1,2,1,2};
            int num = singleNumberApproach(nums) ;
            System.out.println(num);
        }
        public static int singleNumberApproach(int[] nums) {
            int num = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(Integer in:nums){
                if(map.containsKey(in)){
                    int count = map.get(in);
                    map.put(in,++count);
                } else {
                    map.put(in,1);
                }
            }
            for(Map.Entry<Integer,Integer>entry: map.entrySet()){
                if(entry.getValue() == 1){
                    num = entry.getKey();
                }
            }

            return num;
        }

        public static int anotherApproach(int[] nums){

            Set<Integer> repeating = new HashSet<>();
            List<Integer> nonrepeating = new ArrayList<>();
            for(Integer num:nums){
                if(repeating.contains(num)){
                    continue;
                }
                if(nonrepeating.contains(num)){
                    nonrepeating.remove(num);
                    repeating.add(num);

                } else {
                    nonrepeating.add(num);

                }
            }

            return nonrepeating.isEmpty()?0:nonrepeating.get(0);
        }
}
