package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien1 {
    private String tenSinhVien,lop, ns,maSinhVien;
    private  float gpa;
    //    private  int maSinhVien;
    public SinhVien1(int maSinhVien,String tenSinhVien,String lop, String ns,float gpa) {
        this.maSinhVien = "SV" + String.format("%03d", maSinhVien);

        this.tenSinhVien =tenSinhVien;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;

    }
    public void   ChuanHoa1(){
        String [] ans = this.tenSinhVien.split("\\s+");
        String res ="";
        for(int i=0;i<ans.length;i++){
            res+=Character.toUpperCase(ans[i].charAt(0));
            for(int j=1;j<ans[i].length();j++){
                res+=Character.toLowerCase(ans[i].charAt(j));
            }
            res+=" ";


        }
        res=res.trim();
        this.tenSinhVien=res;
    }
    public void  ChuanHoa(){
        String [] a = this.ns.split("/");
        if(a[0].length()==1) a[0]="0"+a[0];
        if(a[1].length()==1) a[1]="0"+a[1];
        this.ns= a[0]+"/"+a[1]+"/"+a[2];
    }
    public String getMaSinhVien(){
        return maSinhVien;
    }
    public float getGpa(){
        return gpa;
    }
    public  String toString(){
        return this.maSinhVien+" "+this.tenSinhVien +" "+this.lop+" "+this.ns+" "+String.format("%.2f",this.gpa);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int   n =sc.nextInt();
        ArrayList<SinhVien1> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String lop= sc.nextLine();
            String ns = sc.nextLine();
            float diem = sc.nextFloat();
            SinhVien1 x =new SinhVien1(i+1,ten,lop,ns,diem);
            x.ChuanHoa();
            x.ChuanHoa1();
            a.add(x);

        }
        Collections.sort(a, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
               if(o1.getGpa() > o2.getGpa()){
                   return -1;
               }else if(o1.getGpa() < o2.getGpa()){
                   return  1;
               }else {
                   return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
               }

            }
        });
        for(SinhVien1 x : a){
            System.out.println(x);
        }
    }
}
