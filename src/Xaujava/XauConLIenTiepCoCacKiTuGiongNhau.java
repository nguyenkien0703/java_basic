package Xaujava;

import java.util.Map;
import java.util.Scanner;

public class XauConLIenTiepCoCacKiTuGiongNhau  {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        s+="@";
        long  cnt =1, ans =1;
        char kitu =s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                ++cnt ;
            }else {
                if(cnt > ans ){
                    ans =cnt ;
                   kitu=s.charAt(i-1);
                }else if(cnt ==ans ){
                    if(s.charAt(i-1)> kitu){
                        kitu = s.charAt(i-1);
                    }
                }
                cnt =1;
            }
        }
        for(int i=0;i<ans ;i++){
            System.out.print(kitu);
        }

    }
}
