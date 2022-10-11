package SetMap;
/*
*Cho mảng A[] gồm N phần tử. Bạn được yêu cầu trả lời cho các truy vấn, mỗi truy vấn yêu cầu bạn đếm số các giá trị khác nhau từ chỉ số L tới chỉ số N - 1.

Input Format

Dòng đầu tiên là N - số lượng phần tử của mảng; Dòng thứ 2 gồm N phần tử A[i] của mảng; Dòng thứ 3 là số truy vấn Q; Q dòng tiếp theo mỗi dòng là một số L.

Constraints

1<=N<=1000000; 1<=A[i]<=10^9; 1<=Q<=10000; 0<=L<=N-1;

Output Format

Với mỗi truy vấn in kết quả trên 1 dòng.

Sample Input 0

9
3 3 3 4 2 0 3 1 2
4
8
6
1
7
Sample Output 0

1
3
5
2
* */


import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;

public class SuffixAndQuery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n =sc.nextInt();

        int  [] a =new int [n];

        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        long [] ans =new long[n];
        Set<Integer> set=new TreeSet<>();
        for(int i=n-1;i>=0;i--){
            set.add(a[i]);
            ans[i]=set.size();
        }
        int t =sc.nextInt();
        while(t--> 0){
            int x =sc.nextInt();
            System.out.println(ans[x]);
        }
    }
}
