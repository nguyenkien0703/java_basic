package kethuajava.bai3;

public class Teacher3 extends Person3 {
    private String mgv,khoa;
    private  int luong ;
    public Teacher3(String ten,String ns,String diachi,String mgv,String khoa,int luong ){
        super(ten,ns,diachi);
        this.mgv=mgv;
        this.khoa=khoa;
        this.luong=luong;
    }
    @Override
    public String toString(){
        return this.mgv+" "+super.toString()+" "+this.khoa+" "+this.luong;
    }
}
