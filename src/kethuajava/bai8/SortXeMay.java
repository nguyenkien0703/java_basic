package kethuajava.bai8;

import java.util.Comparator;

public class SortXeMay implements Comparator<XeMay8> {
    public int compare(XeMay8 a,XeMay8 b){
        if(a.getGiaban()!=b.getGiaban()){
            if(a.getGiaban()> b.getGiaban()){
                return -1;
            }else return 1;
        }else {
            return a.getMa().compareTo(b.getMa());
        }
    }
}