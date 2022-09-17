package Xaujava;

import java.util.Scanner;

public class SoNhiPhanChiaHetCho2Muk {
    public static boolean Check(String s, long  k ){
        if(s.length()<=k ){
            return false;
        }
        for(int i=s.length()-1;i>=s.length()-k;i--){
            if(s.charAt(i)=='1') return false;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        long k  =sc.nextLong();
        if(Check(s,k)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
