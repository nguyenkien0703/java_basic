package Oopjava_hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TinhGioQuanNet {
    private  String userName, pass, ten,gioVao,gioRa;
    public TinhGioQuanNet(String userName, String pass,String ten,String gioVao,String gioRa){
        this.userName=userName;
        this.pass=pass;
        this.ten=ten;
        this.gioVao=gioVao;
        this.gioRa=gioRa;
    }
    public  int getPhut(){
        String [] arr1=this.gioVao.split(":");
        String [] arr2=this.gioRa.split(":");
        int phut1=Integer.parseInt(arr1[0])*60+Integer.parseInt(arr1[1]);
        int phut2=Integer.parseInt(arr2[0])*60+Integer.parseInt(arr2[1]);
        return phut2-phut1;


    }
    public  String getUserName(){
        return this.userName;
    }
    @Override
    public String toString(){
        return this.userName+" "+this.pass+" "+this.ten+" "+getPhut()/60 +" gio "+getPhut()%60+" phut";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<TinhGioQuanNet> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            String userName=sc.nextLine();
            String  matkhau= sc.nextLine();
            String ten = sc.nextLine();
            String gioVao=sc.nextLine();
            String gioRa= sc.nextLine();
            ans.add(new TinhGioQuanNet(userName,matkhau,ten,gioVao,gioRa));
        }
        Collections.sort(ans, new Comparator<TinhGioQuanNet>() {
            @Override
            public int compare(TinhGioQuanNet o1, TinhGioQuanNet o2) {
                if(o1.getPhut()!=o2.getPhut()){
                    return o2.getPhut() - o1.getPhut();
                }else {
                    return  o1.getUserName().compareTo(o2.getUserName());
                }
            }
        });
        for(TinhGioQuanNet x : ans){
            System.out.println(x);
        }


    }
}
