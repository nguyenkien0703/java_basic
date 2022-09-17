package kethuajava.bai7;

public class XeOto7 extends  Person7 {
    private int maluc,giaban;
    public XeOto7(String ma,String ten,String hang,String color ,int maluc,int giaban ){
        super(ma,ten,hang,color);
        this.maluc=maluc;
        this.giaban=giaban;
    }
    public String getHang(){
        return this.hang;
    }
    @Override
    public String toString(){
        return super.toString() +" "+this.maluc+" "+this.giaban;
    }


}
