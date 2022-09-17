package Xaujava;

import java.util.Scanner;

public class TinhTongCacSoXuatHienTrongXau {

    public static  String ChuanHoa(String s ){
        StringBuilder tmp =new StringBuilder(s);
        while(tmp.length()> 1 && tmp.charAt(0)=='0'){
            tmp.deleteCharAt(0);
        }
        return tmp.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        s+="@";
        long sum =0, cnt =0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                cnt =cnt * 10 + s.charAt(i)-'0';

            }else {
                sum+=cnt ;
                cnt =0;
            }
        }

        System.out.println(sum);
    }
}
