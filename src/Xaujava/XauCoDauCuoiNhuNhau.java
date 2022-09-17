package Xaujava;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class XauCoDauCuoiNhuNhau {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        long  ans =s.length();
        int [] cnt =new int [256];
       for(int i=0;i<s.length();i++){
           cnt[s.charAt(i)-'0']++;
       }
        for(int i=0;i<256;i++){
            ans += 1l*cnt[i]*(cnt[i]-1)/2;
        }
        System.out.println(ans);

    }



}
