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
    }
