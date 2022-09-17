package Oopjava_hackerrank;

import java.util.Scanner;

public class B13_LopPhanSo {
    private static long tu;
    private static long mau;
    public   B13_LopPhanSo(){

    }
    public B13_LopPhanSo(long tu , long mau ){
        this.tu=tu;
        this.mau=mau;
    }

    public static long gcd(long a, long b ){
        if(b==0){
            return a;
        }else return gcd(b,a%b);

    }
    public  static  void RutGon(){
        long x =gcd(tu,mau);
       tu =tu /x;
       mau = mau /x;

    }
    public static B13_LopPhanSo tongPhanSo(B13_LopPhanSo a ,B13_LopPhanSo b){
        a.RutGon();
        b.RutGon();;
        B13_LopPhanSo ps =new B13_LopPhanSo();
        ps.tu= a.mau*b.tu+b.mau*a.tu;
        ps.mau = a.mau*b.mau;
        ps.RutGon();
        ps.tu*=ps.tu;
        ps.mau*=ps.mau;
        return ps ;
    }

    public  static B13_LopPhanSo nhanPhanSo(B13_LopPhanSo a ,B13_LopPhanSo b ,B13_LopPhanSo c ){
        a.RutGon();
        b.RutGon();
        c.RutGon();
        B13_LopPhanSo ps = new B13_LopPhanSo();
        ps.tu= a.tu*b.tu*c.tu;
        ps.mau=a.mau*b.mau*c.mau;
        ps.RutGon();
        return ps ;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-- > 0){

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            B13_LopPhanSo A= new B13_LopPhanSo(a,b);
            B13_LopPhanSo B= new B13_LopPhanSo(c,d);
            B13_LopPhanSo sum = tongPhanSo(A,B);
            System.out.print(sum.tu+"/"+sum.mau+" ");
            B13_LopPhanSo tich = nhanPhanSo(A,B,sum);
            System.out.println(tich.tu+"/"+tich.mau);


        }
    }
}
