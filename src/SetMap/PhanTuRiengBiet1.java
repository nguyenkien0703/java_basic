package SetMap;
/*
*
*Cho dãy số A[] gồm có N phần tử, bạn hãy liệt kê các giá trị xuất hiện trong dãy theo thứ tự xuất hiện, mỗi giá trị chỉ liệt kê một lần.

Input Format

Dòng đầu tiên là số nguyên N. Dòng thứ 2 gồm N số nguyên A[i]

Constraints

1≤ N ≤ 10^5; 0 ≤ A[i], X ≤ 10^9;

Output Format

In ra các giá trị xuất hiện trong mảng theo thứ tự xuất hiện.

Sample Input 0

8
1 2 3 2 1 3 4 8
Sample Output 0

1 2 3 4 8
* */

import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;


public class PhanTuRiengBiet1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        long n =sc.nextLong();
        for(int i=0;i<n;i++){
            int   x =sc.nextInt();
            set.add(x);
        }
        for(int x : set){
            System.out.print(x+" ");
        }

    }
}
