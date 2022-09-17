package kethuajava.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Student> list =new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten= sc.nextLine();
            String s = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = sc.nextDouble();
            int index =0;
            String ns="",diachi="";
            while(s.charAt(index)=='/'|| Character.isDigit(s.charAt(index))){
                ns=ns+s.charAt(index);
                ++index;
            }
            while(index< s.length()){
                diachi=diachi+s.charAt(index);
                ++index;
            }
            list.add(new Student(ten,ns,diachi,lop,(i+1),gpa));

        }
        for(Student x : list){
            x.chuanHoa();
            System.out.println(x);
        }
    }
}
