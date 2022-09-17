package kethuajava.bai5;

import kethuajava.bai3.Student3;
import kethuajava.bai3.Teacher3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student5> list1=new ArrayList<>();
        List<Teacher5> list2=new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            if(ma.substring(0,2).equals("GV")){
                String ten =sc.nextLine();
                String ns = sc.nextLine();
                String diachi= sc.nextLine();;
                String khoa = sc.nextLine();
                int luong =sc.nextInt();
                Teacher5 l =new Teacher5(ten,ns,diachi,ma,khoa,luong);
                l.chuanHoa();
                list2.add(l);

            }else {
                String ten =sc.nextLine();
                String ns = sc.nextLine();
                String diachi= sc.nextLine();;
                String lop = sc.nextLine();

                double gpa =sc.nextDouble();
                Student5 l= new Student5(ten,ns,diachi,ma,lop,gpa);
                l.chuanHoa();
                list1.add(l);

            }

        }
        Collections.sort(list1,new Sort51());
        Collections.sort(list2,new Sort52());
        System.out.println("DANH SACH GIAO VIEN :");
        for(Teacher5 x : list2){
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for(Student5 x : list1){
            System.out.println(x);
        }
    }
}
