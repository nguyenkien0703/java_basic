package kethuajava.bai2;


import java.util.Comparator;

public class SortByName implements Comparator<Student2> {
    public int compare(Student2 a, Student2 b){
        String [] arr1=a.getName().split("\\s+");
        String [] arr2=b.getName().split("\\s+");
        String s1="",s2="";
        s1+=arr1[arr1.length-1];
        for(int i=0;i<arr1.length;i++){
            s1+=" "+arr1[i];
        }
        s2+=arr2[arr2.length-1];
        for(int i=0;i<arr2.length;i++){
            s2+=" "+arr2[i];
        }

        return s1.compareTo(s2);

    }

}
