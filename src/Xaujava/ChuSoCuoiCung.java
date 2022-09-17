package Xaujava;

import java.util.Scanner;

public class ChuSoCuoiCung {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();;
        int ans =0;
        for(int i=0;i<s.length();i++){
            ans =ans * 10 + s.charAt(i)-'0';
            ans%=4;
        }

        if(ans ==1){
            System.out.println(8);
        }else if(ans ==2){
            System.out.println(4);
        }else if(ans ==3){
            System.out.println(2);
        }else if(ans ==0){
            System.out.println(6);
        }
    }
}
