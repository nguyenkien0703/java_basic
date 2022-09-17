package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pair {

    private  int fi;
    private  int se;
    public Pair(int fi, int se){
        this.fi=fi;
        this.se=se;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();;
        ArrayList<Pair> a =new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();;
            int y = sc.nextInt();;
            a.add(new Pair(x,y));
        }

        Collections.sort(a, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return  o1.se - o2.se;
            }
        });
        int cnt =1;
        int last= a.get(0).se;
        for(int i=1;i<n;i++){
            if(a.get(i).fi> last){
                ++cnt ;
                last = a.get(i).se;
            }
        }
        System.out.println(cnt );
    }
}
