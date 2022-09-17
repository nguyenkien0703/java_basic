package Xaujava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SoLonNhatXuatHienTrongXau {
    public  static  String ChuanHoa(String s){
        StringBuilder tmp =new StringBuilder((s));
        while(tmp.length()> 1 && tmp.charAt(0)=='0'){
            tmp.deleteCharAt(0);
        }
        return tmp.toString();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        s+="@";
        ArrayList<String> ans =new ArrayList<>();
        String num ="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
            }else {
                String tmp =ChuanHoa(num);
                if(!tmp.equals("")){
                    ans.add(num);
                }
                num="";
            }
        }
        Collections.sort(ans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o2.length()-o1.length();
                }else {
                    return o2.compareTo(o1);
                }
            }
        });
        System.out.println(ans.get(0));
    }
}
