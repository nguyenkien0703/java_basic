package kethuajava.bai6;

public class Teacher6 extends Person6{
    private String mgv,khoa,lop;
    private  int luong ;
    public Teacher6(String ten,String lop,String ns,String diachi,String mgv,String khoa,int luong ){
        super(ten,ns,diachi);
        this.lop=lop;
        this.mgv=mgv;
        this.khoa=khoa;
        this.luong=luong;
    }
    public String getLop(){
        return this.lop;
    }
    @Override
    public String toString(){
        return this.mgv+" "+super.toString()+" "+this.khoa+" "+this.luong+" "+this.lop;
    }
}
