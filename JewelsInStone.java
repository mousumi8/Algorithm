package leetcode.may.challenge;
/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 This code is from leet Code May challenge
 */
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
