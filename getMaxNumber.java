import java.util.ArrayList;
import java.util.Collections;

public class getMaxNumber {
	
	public static void main(String[] args) {
        String s = "101jadmc897llddwqd0883yt";
        Integer number = getMaxNumberFromString(s);
        System.out.println(number);
    }
    
    public static int getMaxNumberFromString(String s){
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = "";
        char[] chars = s.toCharArray();
        for(Character c:chars){
            if(Character.isDigit(c)){
             str += new StringBuilder().append(c).toString();  
            }else{
             if(!str.isEmpty()){
                list.add(Integer.parseInt(str)); 
             }   
             str = "";
            } 
        }
         Collections.sort(list);
        return list.get(list.size()-1);
    }
  
 }
