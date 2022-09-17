package kethuajava.bai8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<XeMay8> list1 = new ArrayList<>();
        List<XeOto8> list2= new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma= sc.nextLine();
            if(ma.substring(0,2).equals("XM")){
                String ten = sc.nextLine();;
                String hang= sc.nextLine();
                String color = sc.nextLine();;
                int tocdo=Integer.parseInt(sc.nextLine());
                int giaban= Integer.parseInt(sc.nextLine());
                XeMay8 l = new XeMay8(ma,ten,hang,color,tocdo,giaban);
                list1.add(l);
            }else if(ma.substring(0,3).equals("OTO")) {
                String ten = sc.nextLine();;
                String hang= sc.nextLine();
                String color = sc.nextLine();;
                int maluc=Integer.parseInt(sc.nextLine());
                int giaban= Integer.parseInt(sc.nextLine());
                XeOto8 l = new XeOto8(ma,ten,hang,color,maluc,giaban);
                list2.add(l);
            }
        }
        Collections.sort(list2,new SortOto());
        Collections.sort(list1,new SortXeMay());
        System.out.println("DANH SACH OTO :");
        for(XeOto8 x : list2){
            System.out.println(x);
        }

        System.out.println("DANH SACH XE MAY :");
        for(XeMay8 x : list1){
            System.out.println(x);
        }



    }
}
