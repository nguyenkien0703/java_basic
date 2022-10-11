package SetMap;
/*
*Cho mảng các số nguyên không âm gồm n phần tử, thực hiện đếm tần suất xuất hiện của các phần tử và in theo mẫu.

Input Format

Dòng đầu tiên là số lượng phần tử trong mảng. Dòng thứ 2 là N phần tử trong mảng.

Constraints

2≤n≤10^6; 0≤ai≤10^7

Output Format

In ra tần suất xuất hiện của các phần tử theo thứ tự từ nhỏ tới lớn sau đó bỏ trống 1 dòng và in ra tần suất xuất hiện của các phần tử theo thứ tự xuất hiện trong mảng(mỗi giá trị chỉ liệt kê 1 lần).

Sample Input 0

8
2 1 2 3 4 8 2 3
Sample Output 0

1 1
2 3
3 2
4 1
8 1

2 3
1 1
3 2
4 1
8 1
*
* */
import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;


public class DemTanSuat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n =sc.nextInt();
        Map<Integer,Integer> mp = new TreeMap<>();
        LinkedHashMap<Integer,Integer> mp2 = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            int y =sc.nextInt();
            if(mp.containsKey(y)){
                int tan= mp.get(y);
                ++tan;
                mp.put(y,tan);
                mp2.put(y,tan);
            }else {
                mp.put(y,1);
                mp2.put(y,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entry = mp.entrySet();
        for(Map.Entry<Integer,Integer> x :  entry){
            System.out.println(x.getKey()+" "+ x.getValue());
        }
        Set<Map.Entry<Integer,Integer>> entry2 = mp2.entrySet();
        System.out.println("");
        for(Map.Entry<Integer,Integer> x :  entry2){
            System.out.println(x.getKey()+" "+ x.getValue());
        }
    }

}
