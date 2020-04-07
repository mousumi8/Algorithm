import java.util.HashSet;

public class DisplayDuplicate {

	    public static void main(String[] args) {
	        System.out.println("Duplicate Characters:");
	        displayDuplicateChar("mousumi");
	    }
	    
	    public static void displayDuplicateChar(String input){
	        char[] chars = input.toCharArray();
	        HashSet<Character> set= new HashSet<Character>();
	        for(Character c:chars){
	            if(!set.contains(c)){
	                set.add(c);
	            } else {
	                 System.out.print(c+" ");
	            }
	        }
	    }
}