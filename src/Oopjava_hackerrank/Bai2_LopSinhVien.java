package Oopjava_hackerrank;

import java.util.Scanner;

public class Bai2_LopSinhVien {
    private String ht,ns;
    private  double d1,d2,d3;
    public   Bai2_LopSinhVien(String ht, String ns, double d1, double d2, double d3 ){
        this.ht=ht;
        this.ns=ns;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }
    @Override
    public String toString(){
        String tmp =String.format("%.1f",this.d1+this.d2+this.d3);
        return this.ht +" "+this.ns+" "+tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ns = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        Bai2_LopSinhVien x = new Bai2_LopSinhVien(name, ns, d1, d2, d3);
        System.out.println(x);

    }
    
    
}

