package SetMap;
/*
*Cho dãy số A[] gồm có N phần tử, có 2 thao tác như sau : Thao tác 1 : Thêm 1 phần tử X vào mảng. Thao tác 2 : Xóa 1 phần tử X khỏi mảng. Trong trường hợp phần tử X không xuất hiện trong mảng, sẽ không thực hiện xóa, nếu trong mảng có nhiều phần tử X thì chỉ xóa đi 1 phần tử X trong mảng. Thao tác 3 : Truy vấn xem phần tử X có xuất hiện trong mảng hay không? Ban đầu mảng A có N phần tử, với các truy vấn phần tử X trong mảng, in ra YES nếu X xuất hiện trong mảng, ngược lại in ra NO.

Input Format

Dòng đầu tiên là số nguyên N. Dòng thứ 2 gồm N số nguyên A[i]. Dòng thứ 3 là số lượng thao tác Q. Q dòng tiếp theo mỗi dòng là thông tin của một thao tác, gồm 2 số, số đầu tiên là loại thao tác, số tiếp theo là phần tử X trong thao tác.

Constraints

1≤ N ≤ 10^4; 0 ≤ A[i], X ≤ 10^9; 1≤ Q ≤ 1000; 0 ≤ X ≤ 10^9;

Output Format

Đối với mỗi thao tác loại 3, in ra YES nếu X xuất hiện trong mảng, ngược lại in ra NO.

Sample Input 0

6
1 2 3 4 5 6
4
1 1
2 6
3 1
3 6
Sample Output 0

YES
NO
Explanation 0

Ban đầu mảng có 6 phần tử 1, 2, 3, 4, 5, 6. Sau thao tác đầu tiên mảng có thêm 1 phần tử 1 và trở thành mảng (1, 1, 2, 3, 4, 5, 6). Sau thao tác thứ 2, mảng xóa đi 1 phần tử 6 và trở thành mảng (1, 1, 2, 3, 4, 5). Thao tác thứ 3 truy vấn phần tử 1, câu trả lời là YES vì 1 xuất hiện trong mảng. Thao tác thứ 4 truy vấn phần tử 6, câu trả lời là NO vì 6 không xuất hiện trong mảng.
*
* */

import java.util.*;
import java.lang.Math;
import java.util.Comparator;
import  java.util.Set;
import  java.util.Scanner;
public class TruyVanTrenMang1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        Map<Integer,Integer> mp=new HashMap<>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(mp.containsKey(x)){
                int tanSuat=mp.get(x);
                ++tanSuat;
                mp.put(x,tanSuat);
            }else {
                mp.put(x,1);
            }
        }


        int q= sc.nextInt();
        while(q--> 0 ){
            int  a=sc.nextInt();
            if(a==1){
                int y =sc.nextInt();
                if(mp.containsKey(y)){
                    int tanSuat=mp.get(y);
                    ++tanSuat;
                    mp.put(y,tanSuat);
                }else {
                    mp.put(y,1);

                }
            }else if(a==2){
                int y =sc.nextInt();
                if(mp.containsKey(y)){
                    int tanSuat= mp.get(y);
                    --tanSuat;
                    if(tanSuat==0){
                        mp.remove(y);
                    }
                }
            }else {
                int y=sc.nextInt();
                if(mp.containsKey(y)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }




    }
}
