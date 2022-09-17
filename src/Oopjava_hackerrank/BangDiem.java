package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BangDiem {
    private String ten,maUser ;
    private float m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;

    public BangDiem(String ten , int maUser, float m1, float m2, float m3, float m4, float m5, float m6, float m7, float m8, float m9, float m10){
        this.ten=ten;
        this.maUser="HS"+String.format("%02d", maUser);
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
        this.m6=m6;
        this.m7=m7;
        this.m8=m8;
        this.m9=m9;
        this.m10=m10;

    }
    public String getDiemTB(){
        String  result = String.format ("%.1f",1.0*(this.m1+this.m2+this.m3+this.m4+this.m5+this.m6+this.m7+this.m8+this.m9+this.m10)/10);
        result+='0';
        return result;
    }
    public String ketqua(){
        float kien =  Float.parseFloat(getDiemTB());
        String hoa ="";
        if(kien >=9){
            hoa = "XUATSAC";
        }else if(kien>=8 && kien <=8.9){
            hoa = "GIOI";
        }else if(kien >=7 && kien <=7.9){
            hoa ="KHA";
        }else if(kien>=5 && kien <=6.9){
            hoa ="TB";
        }else {
            hoa ="YEU";
        }
        return hoa;
    }
    public String getma(){
        return this.maUser;
    }
    @Override
    public  String toString(){
        return this.maUser+" "+this.ten+" "+getDiemTB()+" "+ketqua();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.nextLine();
        ArrayList<BangDiem> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            float m4 = sc.nextFloat();
            float m5 = sc.nextFloat();
            float m6 = sc.nextFloat();
            float m7 = sc.nextFloat();
            float m8 = sc.nextFloat();
            float m9 = sc.nextFloat();
            float m10 = sc.nextFloat();
            ans.add(new BangDiem(ten,i+1,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10));
        }
        Collections.sort(ans, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if(Float.parseFloat(o1.getDiemTB()) != Float.parseFloat(o2.getDiemTB())){
                    return (int) (Float.parseFloat(o1.getDiemTB()) - Float.parseFloat(o2.getDiemTB()));
                }else if(Float.parseFloat(o1.getDiemTB()) == Float.parseFloat(o2.getDiemTB())) {
                    return o1.getma().compareTo(o2.getma());
                }
                return 0;
            }
        });
        for(BangDiem x : ans ){
            System.out.println(x);
        }
    }
}
