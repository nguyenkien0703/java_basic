package Oopjava_hackerrank;

import java.util.Scanner;

public class ThuNhapGiaoVien {
    private String ma,hoTen;
    private  int  tien;

    public ThuNhapGiaoVien(String ma, String hoTen,int tien){
        this.hoTen=hoTen;
        this.ma=ma;
        this.tien=tien;
    }
    public long getBacLuong(){
        int res=(this.ma.charAt(2)-'0')*10 + this.ma.charAt(3)-'0';
        return res;
    }
    public  long getThuNhap(){
        int thunhap =0;

        String ans =this.ma.substring(0,2);
        if (ans.equals("HT")) {

            thunhap=2000000;
        }else if(ans.equals("HP")){
            thunhap =900000;
        }else if(ans.equals("GV")){
            thunhap=500000;
        }
        return (int) (this.tien*this.getBacLuong() + thunhap);
    }
    @Override
    public String toString(){
        return this.ma +" "+this.hoTen+" "+this.getBacLuong()+" "+this.getThuNhap();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String stt=sc.nextLine();
        String ten=sc.nextLine();
        int n =sc.nextInt();
        ThuNhapGiaoVien x = new ThuNhapGiaoVien(stt,ten,n);
        System.out.println(x);

    }
}
