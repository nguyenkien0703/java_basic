package SetMap;
/*
*Cho 2 mảng số nguyên a và b gồm n và m phần tử, các phần tử trong mảng là đôi một khác nhau, các phần tử trong 2 mảng đã được sắp xếp theo thứ tự tăng dần. Hãy tìm mảng giao và mảng hợp của 2 mảng. Độ phức tạp mong muốn O(n+m)

Input Format

Dòng đầu tiên là số lượng phần tử của 2 dãy n và m. Dòng thứ 2 là n phần tử trong dãy số 1. Dòng thứ 3 là m phần tử trong dãy thứ 2.

Constraints

1≤n,m≤10^7; -10^7≤ai≤10^7

Output Format

Dòng đầu tiên in ra mảng hợp của 2 mảng Dòng thứ 2 in ra mảng giao của 2 mảng

Sample Input 0

4 5
1 2 3 4
2 3 5 6 7
Sample Output 0

1 2 3 4 5 6 7
2 3
* */


import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;
public class TimHopVaGiaoHaiMang2 {

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

        for(int x : hop){
            System.out.print(x+" ");
        }
        System.out.println("");
        Set<Map.Entry<Integer,Integer>> entry = giao.entrySet();
        for(Map.Entry<Integer,Integer> x  : entry){
            if(x.getValue()==2){
                System.out.print(x.getKey()+" ");
            }
        }
    }
}
