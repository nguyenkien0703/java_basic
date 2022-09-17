package Oopjava_hackerrank;

import java.util.Scanner;

public class Bai3_LopPhanSo {
        private  String maSinhVien, hoTen, lop,ngaySinh;
        private float gpa;

        public Bai3_LopPhanSo(){
                maSinhVien =hoTen=lop="";
                gpa =0;
        }
        public  Bai3_LopPhanSo(String maSinhVien, String hoTen, String lop,String ngaySinh, float gpa ){
                this.maSinhVien=maSinhVien;
                this.hoTen=hoTen;
                this.ngaySinh=ngaySinh;
                this.lop=lop;
                this.gpa=gpa;

        }
        public void ChuanHoa(){
                String [] a=this.ngaySinh.split("/");
                if(a[0].length()==1) a[0]="0"+a[0];
                if(a[1].length()==1) a[1]="0"+a[1];
                this.ngaySinh=a[0]+"/"+a[1]+"/"+a[2];
        }
        @Override
        public String toString(){

                return   this.maSinhVien+" "+this.hoTen+" "+this.lop+" "+this.ngaySinh+" "+String.format("%.1f",this.gpa);

        }

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                String stt=sc.nextLine();
                String ns=sc.nextLine();
                float diem =sc.nextFloat();

//                System.out.println("SV001");

                Bai3_LopPhanSo x =new Bai3_LopPhanSo("SV001",s,stt,ns,diem);
                x.ChuanHoa();;

                System.out.println(x);
        }






}
