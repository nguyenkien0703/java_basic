package Xaujava;

import java.util.Scanner;

public class SoMayMan {
    public static  String solve(String s ){
        StringBuilder  tmp =new StringBuilder(s);
        for (int i = 0; i < tmp.length() - 2; i++) {
            if (tmp.charAt(i) == '1' && tmp.charAt(i + 1) == '1' && tmp.charAt(i + 2) == '1') {
                tmp.delete(i, i + 3);
                --i;
            }
        }
       if(tmp.toString().equals("")){
           return "EMPTY";
       }else return tmp.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();;
        System.out.print(solve(s));
    }
}
