import java.util.ArrayList;
class Pair{
    String key;
    int val;
    Pair(String key,int val) {
        this.key = key;
        this.val = val;
    }
}
public class ListLikeMap {
    public static  void main(String[] args){
        Pair p = new Pair("Maina",2);
        Pair p1 = new Pair("Moon",8);
        Pair p2 = new Pair("Majoni",6);
        Pair p3 = new Pair("Maina",4);
        Pair p4 = new Pair("Majoni",0);
        Pair p5 = new Pair("Rishi",10);
        ArrayList<Pair> arr = new ArrayList<>();
        arr.add(p);
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        ArrayList<Pair> arrNew = convertToMap(arr);
        for(Pair pair:arrNew){
            System.out.println(pair.key+" "+pair.val);
        }
    }
    public static ArrayList<Pair> convertToMap(ArrayList<Pair> arr){
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(j).key.equals(arr.get(i).key)){
                    arr.remove(arr.get(j));
                }
            }
        }

        return arr;
    }
}


