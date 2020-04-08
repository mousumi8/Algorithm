import java.util.Arrays;

public class Anagram {
        public static void main(String[] args) {
            String str = checkAnagram("Mary","armY") ? "Anagram strings":"Not anagram strings";
            System.out.println(str);
        }

        public static boolean checkAnagram(String string,String anagram){
            if(string.length() != anagram.length()){
                return false;
            }
            char[] chars = string.toCharArray();
            boolean flag = false;
            for(Character c:chars) {
                c = Character.toLowerCase(c);
                int index = anagram.toLowerCase().indexOf(c);
                if(index != -1){
                    anagram = anagram.substring(0,index) + anagram.substring(index+1,anagram.length());
                }else{
                    return false;
                }
            }
            return anagram.isEmpty();
        }

    public static boolean checkAnagramApproach1(String string,String anagram){
        string = string.toLowerCase();
        anagram = anagram.toLowerCase();
        char[] firstArray = string.trim().toCharArray();
        char[] secondArray = anagram.trim().toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }

    public static boolean checkAnagramApproach2(String string,String anagram){
        if(string.trim().length() != anagram.trim().length()){
            return false;
        }
        string = string.toLowerCase();
        anagram = anagram.toLowerCase();
        char[] chars = string.toCharArray();
        StringBuffer sb = new StringBuffer(anagram);
        for(Character ch:chars){
            int index = sb.indexOf(""+ch);
            if( index != -1){
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        System.out.println(sb);
        return sb.length()==0 ? true : false;
    }
    }
