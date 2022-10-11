package SetMap;
/*
*Cho mảng A[] và B[] có N và M phần tử là các số nguyên, hãy tìm các phần tử xuất hiện trong mảng 1 mà không xuất hiện trong mảng 2.

Input Format

Dòng đầu tiên là N và M; Dòng thứ 2 là N số của mảng A[]; Dòng thứ 3 là M số của mảng B[];

Constraints

1<=N, M<=10^6; -10^9<=A[i], B[i] <= 10^9;

Output Format

In ra các số xuất hiện trong mảng 1 mà không xuất hiện trong mảng 2 theo thứ tự từ bé đến lớn, mỗi giá trị thỏa mãn chỉ liệt kê 1 lần.

Sample Input 0

3 4
1 2 3
1 2 4 5
Sample Output 0

3
* */


import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;
public class LoaiTru {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n =sc.nextInt();
        int m =sc.nextInt();
        Map<Integer,Integer> giao = new TreeMap<>();
        for(int i=0;i<n;i++){
            int x =sc.nextInt();
            giao.put(x,1);
        }
        for(int i=0;i<m;i++){
            int x =sc.nextInt();
            if(giao.containsKey(x)){
                giao.put(x,2);
            }
        }

        Set<Map.Entry<Integer,Integer>> entry = giao.entrySet();
        for(Map.Entry<Integer,Integer> x  : entry){
            if(x.getValue()==1){
                System.out.print(x.getKey()+" ");
            }
        }

    }
}
