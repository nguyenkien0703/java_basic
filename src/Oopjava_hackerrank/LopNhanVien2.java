package Oopjava_hackerrank;

import java.util.Scanner;

public class LopNhanVien2 {

    private String hoTen, sex, ngaySinh, addRess,phone,kiHop;


    public  void ChuanHoa(){
        String [] ans =this.ngaySinh.split("/");
        if(ans[0].length()==1) ans[0]="0"+ans[0];
        if(ans[1].length()==1) ans[1]="0"+ans[1];
        this.ngaySinh=ans[0]+"/"+ans[1]+"/"+ans[2];

    }
    public  void ChuanHoa1(){
        String [] ans1 =this.kiHop.split("/");
        if(ans1[0].length()==1) ans1[0]="0"+ans1[0];
        if(ans1[1].length()==1) ans1[1]="0"+ans1[1];
        this.kiHop=ans1[0]+"/"+ans1[1]+"/"+ans1[2];

    }
    public  void ChuanHoa2(){
        String [] ans2 =this.hoTen.split("\\s+");
        String res ="";
        for(String x : ans2){
            res+=Character.toUpperCase(x.charAt(0));
            for(int j=1;j<x.length();j++){
                res+=Character.toLowerCase(x.charAt(j));
            }
            res+=" ";
        }
        res=res.trim();
        this.hoTen=res;
    }

    public LopNhanVien2(String hoten ,String sex ,String ngaySinh,String addRess, String phone,String kiHop){
        this.hoTen=hoten;
        this.sex=sex;
        this.addRess=addRess;
        this.ngaySinh=ngaySinh;
        this.phone=phone;
        this.kiHop=kiHop;
    }
    @Override
    public String toString(){

        return   this.hoTen+" "+this.sex+" "+this.ngaySinh+" "+this.addRess+" "+this.phone+" "+this.kiHop;

    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String ten=sc.nextLine();
        String gt=sc.nextLine();
        String ns=sc.nextLine();
        String dc=sc.nextLine();
        String sdt=sc.nextLine();
        String ki=sc.nextLine();
        System.out.print("00001 ");

        LopNhanVien2 x =new LopNhanVien2(ten,gt,ns,dc,sdt,ki);
        x.ChuanHoa2();
        x.ChuanHoa();
        x.ChuanHoa1();
        System.out.println(x);


    }

}
