package Oopjava_hackerrank;

public class LopPhanSo {
    private  int tu ,mau ;
    public  LopPhanSo(int tu, int mau ){
        this.tu=tu;
        this.mau=mau;
    }
    public void RutGon(){
        int a = this.tu, b =this.mau;
        while(b!=0){
             int  r =a%b;
             a=b;
             b=r;

        }
        this.tu/=a;
        this.mau/=a;
    }
    public  int gcd(int a, int b ){
       while(b!=0){
           int r =a%b;
           a=b;
           b=r;
       }
       return a;
    }
    public  int lcm(int a, int  b ){
        return a /gcd(a,b)* b ;
    }
    public void Cong(LopPhanSo a ,LopPhanSo b ){
        a.RutGon();
        b.RutGon();
        int mc=lcm(a.mau,b.mau);
        a.tu=mc/a.mau*a.tu;
        b.tu=mc/b.mau*b.tu;
        a.mau=b.mau=mc;
    }



}
