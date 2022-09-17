package Xaujava;

import java.util.Scanner;

public class PhepChiaDu {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        long k =sc.nextLong();
        long ans =0;
        for(int i=0;i<s.length();i++){
            ans =ans * 10 + s.charAt(i)-'0';
            ans %=k;
        }
        System.out.println(ans );
    }
}
