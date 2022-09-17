package Oopjava_hackerrank;

import java.util.*;

public class WordSet {
    private TreeSet<String> set;
    public WordSet(){
        set= new TreeSet<>();
    }
    public WordSet (String s ){
        set = new TreeSet<>();
        String [] a=s.split("\\s+");
        for(String x : a){
            set.add(x);
        }
    }

    public WordSet union (WordSet other ){
        WordSet res = new WordSet();
        for(String x : other.set){
            res.set.add(x);
        }
        for(String x : this.set){
            res.set.add(x);
        }
        return  res;
    }
    public  WordSet intersection(WordSet other ){
        HashMap<String,Integer>  mp =new HashMap<>();
         for(String x : this.set){
             mp.put(x,1);
         }
         for(String x  : other.set){
             if(mp.containsKey(x)){
                 mp.put(x,2);
             }
         }
         WordSet res = new WordSet();
        Set<Map.Entry<String, Integer>> entry = mp.entrySet();
         for(Map.Entry<String, Integer> x : entry){
             if(x.getValue()==2){
                 res.set.add(x.getKey());
             }
         }
         return res;


    }
    @Override

    public String toString (){
        String ans ="";
        for(String x : set){
            ans+=x+" ";
        }
        return  ans ;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1= new WordSet(sc.nextLine());
        WordSet s2= new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));


    }
}
