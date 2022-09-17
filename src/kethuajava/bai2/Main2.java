package kethuajava.bai2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();
        List<Student2> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ns=sc.nextLine();
            String diachi=sc.nextLine();
            String lop= sc.nextLine();
            double gpa = sc.nextDouble();
            list.add(new Student2(ten,ns,diachi,lop,(i+1),gpa));
        }
        for(Student2 x : list){
            x.chuanHoa();
        }
        Collections.sort(list,new SortByName());
        for(Student2 x : list){
            System.out.println(x);
        }

    }

}
