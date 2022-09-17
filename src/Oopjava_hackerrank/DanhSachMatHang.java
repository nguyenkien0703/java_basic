package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachMatHang {
    private  String maMatHang,tenMatHang,donViTinh;
    private  int giaBan,giaMua;

    public  DanhSachMatHang(int  maMatHang, String tenMatHang, String donViTinh,int giaMua, int giaBan){
        this.maMatHang="MH"+String.format("%04d",maMatHang);
        this.tenMatHang=tenMatHang;
        this.donViTinh= donViTinh;
        this.giaMua= giaMua;
        this.giaBan=giaBan;
    }
    public  int getLoiNhuan(){
        return this.giaBan-this.giaMua;
    }

    public String getMaMatHang(){
        return  this.maMatHang;
    }
    public  String toString(){
        return this.maMatHang +" "+this.tenMatHang+" "+this.donViTinh+" "+this.giaMua+" "+this.giaBan+" "+this.getLoiNhuan();
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();;
        ArrayList<DanhSachMatHang> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String  tenMatHang = sc.nextLine();
            String donvi = sc.nextLine();
            int giaMua   = sc.nextInt();
            int giaBan   = sc.nextInt();
            a.add(new DanhSachMatHang(i+1,tenMatHang,donvi,giaMua,giaBan));
        }
        Collections.sort(a, new Comparator<DanhSachMatHang>() {
            @Override
            public int compare(DanhSachMatHang o1, DanhSachMatHang o2) {
                if(o1.getLoiNhuan()!=o2.getLoiNhuan()){
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                }else {
                   return o1.getMaMatHang().compareTo(o2.getMaMatHang());


                }
            };
        });
        for(DanhSachMatHang x : a ){
            System.out.println(x);
        }
    }







}
