package Xaujava;

import java.util.Scanner;

public class XauConLienTiepCoCacKiTuKhacNhau {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();;
        int cnt =1, res =1;
        String ans  ="", tmp ="";
        tmp+=s.charAt(0);
        s+=s.charAt(s.length()-1);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ++cnt ;

                tmp+=s.charAt(i);
            }else {
                if(cnt > res ){
                    res =cnt;
                    ans  =tmp;
                }else if(cnt == res ){
                    if(ans.compareTo(tmp)< 0){
                         ans =tmp ;
                    }

                }
                cnt =1;
                tmp="";
                tmp+=s.charAt(i);


            }
        }
        System.out.println(ans);
    }
}
