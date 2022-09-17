package Oopjava_hackerrank;

import java.util.Scanner;

public class TuyenSinh {
    private  String maThiSinh,hoTen;
    private float d1,d2,d3,tong;
    private  String ans ;

    public  TuyenSinh(String maThiSinh,String hoTen,float d1,float d2,float d3){
        this.maThiSinh=maThiSinh;
        this.hoTen=hoTen;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        tong =d1+d2+d3;
        ans =maThiSinh.substring(0,3);

        if(ans.equals("KV1")){
            tong+=0.5;
        }else if(ans.equals("KV2")){
            tong+=1.0;
        }else if(ans.equals("KV3")) tong+= 2.5;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String ma=sc.nextLine();
        String ten= sc.nextLine();
        float a1=sc.nextFloat();
        float a2=sc.nextFloat();
        float a3=sc.nextFloat();
        TuyenSinh x= new TuyenSinh(ma,ten,a1,a2,a3);

        String res =x.maThiSinh+" "+x.hoTen+" "+x.maThiSinh.charAt(2)+" ";
        double kien=x.tong;
        if(kien==(int)kien){
            res+=String.format("%.0f",kien);
        }else {
            res+=String.format("%.1f",kien);
        }
        String chinh =res+" ";
        if(kien>=24){
            chinh+="TRUNG TUYEN\n";
        }else {
            chinh+="TRUOT\n";

        }
        System.out.println(chinh);
    }




}
