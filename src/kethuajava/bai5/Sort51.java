package kethuajava.bai5;
import java.util.Comparator;

public class Sort51 implements Comparator<Student5>{
    public int compare(Student5 a ,Student5 b){
        if(a.getGpa()!=b.getGpa()){
            if(a.getGpa()> b.getGpa()){
                return -1;
            }else return 1;
        }else {
            return a.getMsv().compareTo(b.getMsv());
        }
    }
}
