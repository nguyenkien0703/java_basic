package Oopjava_hackerrank;

import java.util.Scanner;

public class TinhLuongNhanVien {

    private String hoTen,ma;
    private int luongCoBan,soNgay;
    private  long luongThang, thuong, phuCap, thuNhap;


    public  TinhLuongNhanVien(String hoTen, String ma, int luongCoBan, int soNgay){
        this.hoTen=hoTen;
        this.ma=ma;
        this.luongCoBan=luongCoBan;
        this.soNgay=soNgay;
        luongThang=1l*luongCoBan*soNgay;
        thuong =0;
        if(soNgay>=25){
            thuong = (long) (1l*0.2*luongThang);
        }else if(soNgay>=22 && soNgay < 25){
            thuong =(long )(1l*0.1*luongThang);
        }else {
            thuong=0;
        }
        phuCap =0;
        if(ma.equals("GD")){
            phuCap=250000;
        }else if(ma.equals("PGD")){
            phuCap=200000;
        }else if(ma.equals("TP")){
            phuCap =180000;
        }else if(ma.equals("NV")) {
            phuCap=150000;
        }
        thuNhap= luongThang+thuong+phuCap;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        int luongCb=sc.nextInt();
        int ngay =sc.nextInt();
        sc.nextLine();
        String phuCap= sc.nextLine();;
        TinhLuongNhanVien x = new TinhLuongNhanVien(ten,phuCap,luongCb,ngay);
        System.out.println("NV01 "+x.hoTen+" "+x.luongThang+" "+x.thuong+" "+x.phuCap+" "+x.thuNhap );;

    }









}
