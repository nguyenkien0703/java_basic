package kethuajava.bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<XeMay7> list1 = new ArrayList<>();
        List<XeOto7> list2= new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma= sc.nextLine();
            if(ma.substring(0,2).equals("XM")){
                String ten = sc.nextLine();;
                String hang= sc.nextLine();
                String color = sc.nextLine();;
                int tocdo=Integer.parseInt(sc.nextLine());
                int giaban= Integer.parseInt(sc.nextLine());
                XeMay7 l = new XeMay7(ma,ten,hang,color,tocdo,giaban);
                list1.add(l);
            }else if(ma.substring(0,3).equals("OTO")) {
                String ten = sc.nextLine();;
                String hang= sc.nextLine();
                String color = sc.nextLine();;
                int maluc=Integer.parseInt(sc.nextLine());
                int giaban= Integer.parseInt(sc.nextLine());
                XeOto7 l = new XeOto7(ma,ten,hang,color,maluc,giaban);
                list2.add(l);
            }
        }
        String find= sc.nextLine();
        System.out.println("DANH SACH XE HANG "+find+" :");
        for(XeOto7 x : list2){
            if(x.getHang().equals(find)){
                System.out.println(x);
            }
        }
        for(XeMay7 x : list1){
            if(x.getHang().equals(find)){
                System.out.println(x);
            }
        }
    }
}
