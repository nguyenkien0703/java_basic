package Xaujava;

import java.util.Scanner;

public class LuyThuaVoiCoSoLon {
    public static long MOD= (long) (1e9+7);
    public static long powMod(long a, long b, long MOD){
        long res =1;
        a%= LuyThuaVoiCoSoLon.MOD;
        while(b!=0){
            if((b&1)==1){
                res *=a;
                res%= MOD;
            }
            a*=a;
            a%= MOD;
            b>>=1;
        }
        return res ;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();;
        long k = sc.nextLong();;
        long sum =0;
        for(int i=0;i<s.length();i++){
            sum=sum*10+s.charAt(i)-'0';
            sum%=MOD;
        }
        System.out.println(powMod(sum,k,MOD));
    }
}
