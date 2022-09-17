package Xaujava;

import java.util.Scanner;

public class B47_UocChungLonNhat {
    public static  long  GCD(long  a, long b ){
        while(b!=0){
            long r =a%b;
            a=b;b=r;
        }
        return a ;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long a = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ans =GCD(x,y);
        for(long i=0;i<ans;i++){
            System.out.print(a);
        }
    }
}
