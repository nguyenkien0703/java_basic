package Xaujava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TichGiaiThuaCacChuSo {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> a =new ArrayList<>();
        for(int i =0;i< s.length();i++){
            char tmp =s.charAt(i);
            if(tmp =='0' || tmp =='1'){
                continue;
            }else if(tmp=='2'){
                a.add('2');
            }else if(tmp=='3'){
                a.add('3');
            }else if(tmp=='4'){
                a.add('3');
                a.add('2');
                a.add('2');
            }else if(tmp=='5'){
                a.add('5');
            }else if(tmp=='6'){
                a.add('5');
                a.add('3');
            }else if(tmp=='7'){
                a.add('7');
            }else if (tmp =='8'){
                a.add('7');
                a.add('2');
                a.add('2');
                a.add('2');
            }else if(tmp=='9'){
                a.add('2');
                a.add('2');
                a.add('3');
                a.add('7');
            }
        }
        Collections.sort(a, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i));
        }

    }

}
