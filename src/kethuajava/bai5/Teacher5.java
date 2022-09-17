package kethuajava.bai5;

public class Teacher5 extends Person5{
    private String mgv,khoa;
    private  int luong ;
    public Teacher5(String ten,String ns,String diachi,String mgv,String khoa,int luong ){
        super(ten,ns,diachi);
        this.mgv=mgv;
        this.khoa=khoa;
        this.luong=luong;
    }
    public int getLuong(){
        return  this.luong;
    }
    public String  getMgv(){
        return  this.mgv;
    }
    @Override
    public String toString(){
        return this.mgv+" "+super.toString()+" "+this.khoa+" "+this.luong;
    }
}
