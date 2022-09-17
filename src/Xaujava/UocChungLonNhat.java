package Xaujava;

import java.util.Scanner;

public class UocChungLonNhat {
   public static long  find(String s, long k ){
       long ans =0;
       for(int i=0;i<s.length();i++){
           ans = ans * 10 + s.charAt(i)-'0';
           ans %=k;
       }
       return (long ) ans;
   }
   public static  long  gcd(long  a, long   b ){
       while(b!=0){
           long  r =a%b;
           a=b;
           b=r;
       }
       return (long) a;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long  m = sc.nextLong();;
        long   tmp =find(n,m);
        long  res =gcd(tmp, m );
        System.out.println(res);

    }
}
