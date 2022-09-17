package Xaujava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GhepSo {
    public static String ChuanHoa(String s){
        StringBuilder tmp =new StringBuilder(s);
        while(tmp.length()> 1 && tmp.charAt(0)=='0'){
            tmp.deleteCharAt(0);
        }
        return tmp.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        s+="@";
        ArrayList<String> ans =new ArrayList<>();

        String num ="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
            }else {
                String tmp =ChuanHoa(num);
                if(!tmp.equals("")){
                    ans.add(tmp);
                }
                num ="";
            }
        }
        Collections.sort(ans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String tmp1=o1+o2;
                String tmp2=o2+o1;
                return  tmp2.compareTo(tmp1);
            }
        });
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
        }
    }


}
