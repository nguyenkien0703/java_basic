package Oopjava_hackerrank;

import java.util.Scanner;

public class PhanSo {
    private  long tu , mau ;
    public  PhanSo(long tu , long mau){
        this.tu=tu;
        this.mau=mau;
    }

    public void   ToiGian(){
        long a =this.tu,b=this.mau;
        while(b!=0){
            long r =a%b;
            a=b;
            b=r;
        }
        this.tu/=a;
        this.mau/=a;
    }
    @Override
    public String toString(){
        return this.tu+"/"+this.mau;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int tu=sc.nextInt();
        int mau=sc.nextInt();
        PhanSo x =new PhanSo(tu,mau);
        x.ToiGian();
        System.out.println(x);
    }

}
