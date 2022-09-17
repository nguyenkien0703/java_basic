package kethuajava.bai8;

import java.util.Comparator;

public class SortOto implements Comparator<XeOto8> {
    public int compare(XeOto8 a,XeOto8 b){
        if(a.getGiaban()!=b.getGiaban()){
            if(a.getGiaban()> b.getGiaban()){
                return -1;
            }else return 1;
        }else {
            return a.getMa().compareTo(b.getMa());
        }
    }
}
