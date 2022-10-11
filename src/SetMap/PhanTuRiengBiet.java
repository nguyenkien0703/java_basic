package SetMap;
import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;


public class PhanTuRiengBiet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );

        TreeSet<Integer> set = new TreeSet<>();
        long n =sc.nextLong();
        for(int i=0;i<n;i++){
            int   x =sc.nextInt();
            set.add(x);
        }
        System.out.println(set.size());


    }
}
