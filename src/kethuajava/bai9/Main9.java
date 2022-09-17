package kethuajava.bai9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<XeMay9> list1 = new ArrayList<>();
        List<XeOto9> list2= new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma= sc.nextLine();
            if(ma.substring(0,2).equals("XM")){
                String ten = sc.nextLine();;
                String hang= sc.nextLine();
                String color = sc.nextLine();;
                int tocdo=Integer.parseInt(sc.nextLine());
                int giaban= Integer.parseInt(sc.nextLine());
                XeMay9 l = new XeMay9(ma,ten,hang,color,tocdo,giaban);
                list1.add(l);
            }else if(ma.substring(0,3).equals("OTO")) {
                String ten = sc.nextLine();;
                String hang= sc.nextLine();
                String color = sc.nextLine();;
                int maluc=Integer.parseInt(sc.nextLine());
                int giaban= Integer.parseInt(sc.nextLine());
                XeOto9 l = new XeOto9(ma,ten,hang,color,maluc,giaban);
                list2.add(l);
            }
        }
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("DANH SACH OTO :");
        for(XeOto9 x : list2){
            if(x.getGiaban()>a && x.getGiaban() < b){

                System.out.println(x);
            }
        }

        System.out.println("DANH SACH XE MAY :");
        for(XeMay9 x : list1){
            if(x.getGiaban()>a && x.getGiaban() < b){

                System.out.println(x);
            }
        }



    }
}
