package SetMap;
/*
*Cho 2 mảng số nguyên a và b gồm n và m phần tử. Gọi mảng c và d lần lượt là mảng chỉ bao gồm các phần tử khác nhau của a và b. Hãy tìm mảng giao và hợp của mảng c và d và liệt kê theo thứ tự tăng dần.

Input Format

Dòng đầu tiên là số lượng phần tử của 2 dãy n và m. Dòng thứ 2 là n phần tử trong dãy số 1. Dòng thứ 3 là m phần tử trong dãy thứ 2.

Constraints

1≤n,m≤10^6; 0≤ai≤10^7

Output Format

Dòng đầu tiên in ra giao của 2 mảng c và d. Dòng thứ 2 in ra hợp của 2 mảng c và d.

Sample Input 0

5 6
1 2 1 2 7
1 2 3 4 5 6
Sample Output 0

1 2
1 2 3 4 5 6 7
* */

import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;

public class TimHopVaGiaoCuaHaiMang {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n =sc.nextInt();
        int m =sc.nextInt();
        Set<Integer> hop =new TreeSet<>();
        Map<Integer,Integer> giao = new TreeMap<>();
        for(int i=0;i<n;i++){
            int x =sc.nextInt();
            hop.add(x);
            giao.put(x,1);
        }
        for(int i=0;i<m;i++){
            int x =sc.nextInt();
            hop.add(x);
            if(giao.containsKey(x)){
                giao.put(x,2);
            }
        }
        // casch duyet map
        Set<Map.Entry<Integer,Integer>> entry = giao.entrySet();
        for(Map.Entry<Integer,Integer> x  : entry){
            if(x.getValue()==2){
                System.out.print(x.getKey()+" ");
            }
        }
        System.out.println("");
        for(int x : hop){
            System.out.print(x+" ");
        }
    }

}
