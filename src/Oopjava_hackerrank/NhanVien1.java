package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NhanVien1 {
    private String tenNhanVien,sex,ns,diaChi,kiHopDong,maNhanVien,soThue;
    public NhanVien1(int maNhanVien, String tenNhanVien,String sex,String ns,String diaChi,String soThue,String kiHopDong){
        this.maNhanVien= String.format("%05d",maNhanVien);
        this.tenNhanVien=tenNhanVien;
        this.sex=sex;
        this.ns=ns;
        this.diaChi=diaChi;
        this.soThue=soThue;
        this.kiHopDong=kiHopDong;
    }

    public String toString(){
        return this.maNhanVien+" "+this.tenNhanVien +" "+this.sex+" "+this.ns+" "+this.diaChi+" "+this.soThue+" "+this.kiHopDong;

    }
    public  void ChuanHoa(){
        String [] a=this.ns.split("/");
        if(a[0].length()==1) a[0]="0"+a[0];
        if(a[1].length()==1) a[1]="0"+a[1];
        this.ns= a[0]+"/"+a[1]+"/"+a[2];
    }
    public  void ChuanHoa1(){
        String [] ans=this.kiHopDong.split("/");
        if(ans[0].length()==1) ans[0]="0"+ans[0];
        if(ans[1].length()==1) ans[1]="0"+ans[1];
        this.kiHopDong= ans[0]+"/"+ans[1]+"/"+ans[2];
    }
    public String  getNgaysinhGia(){
        String [] kien = this.ns.split("/");
        String hoa ="";
        for(String x : kien ){
            hoa = x +hoa;
        }
        return hoa ;
    }
    public String getMaNhanVien(){
        return  maNhanVien;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<NhanVien1> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
                String ten = sc.nextLine();
                String gioiTinh = sc.nextLine();
                String ns= sc.nextLine();
                String dc = sc.nextLine();
                String soThue=sc.nextLine();
                String ki= sc.nextLine();
                NhanVien1 x = new NhanVien1(i+1,ten,gioiTinh,ns,dc,soThue,ki);
                x.ChuanHoa();
                x.ChuanHoa1();
                a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien1>() {
            @Override
            public int compare(NhanVien1 o1, NhanVien1 o2) {
                String chinh1=o1.getNgaysinhGia();
                String chinh2 = o2.getNgaysinhGia();
                if(chinh1.compareTo(chinh2)> 0  ){
                    return 1;
                }else if(chinh1.compareTo(chinh2)< 0 ){
                    return -1 ;
                }else{
                    return o1.getNgaysinhGia().compareTo(o2.getNgaysinhGia());

                }
            };
        });
        for(NhanVien1 x : a ){
            System.out.println(x);
        }
    }

}
