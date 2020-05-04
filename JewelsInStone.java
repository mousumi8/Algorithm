package leetcode.may.challenge;

public class JewelsInStone {

         public static void main(String[] args){
             int num = numJewelsInStones("aA","aAAbbbb");
             System.out.println(num);
         }
         public static int numJewelsInStones(String J, String S) {

            char[] arrs = S.toCharArray();
            int noOfJewels = 0;
            for(int i=0;i<arrs.length;i++){
                if(J.contains(Character.toString(arrs[i]))){
                    ++noOfJewels;
                }
            }

            return noOfJewels;
        }
}
