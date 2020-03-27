public class removeVowels {
	
	    public static void main(String[] args) {
	       String s = "mousumi";
	        String str =removeVowelsFromString(s);
	        System.out.println(str);
	    }
	    
	    public static String removeVowelsFromString(String s){
	        String str = "";
	        char[] chars = s.toCharArray();
	        
	        for(char c:chars){
	            if(!(c == 'a' || c== 'e' || c=='i' || c=='o' || c=='u')){
	              str += new StringBuilder().append(c).toString();
	            }
	        }
	        System.out.println(chars);
	        return str;
	    }
	}