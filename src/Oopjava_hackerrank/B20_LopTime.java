package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class B20_LopTime {
    private int gio,phut ,giay;
    public B20_LopTime(int gio ,int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public  int getGiay(){
        return this.gio*3600 + this.phut*60 + this.giay;
    }

    @Override
    public String toString(){
        return this.gio+" "+this.phut+" "+this.giay;
    }



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        ArrayList<B20_LopTime> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new B20_LopTime(sc.nextInt(), sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(a, new Comparator<B20_LopTime>() {
            @Override
            public int compare(B20_LopTime o1, B20_LopTime o2) {
                return o1.getGiay()- o2.getGiay();
            }
        });
        for(B20_LopTime x : a ){
            System.out.println(x);
        }

    }
}
