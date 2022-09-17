package kethuajava.bai9;

public class XeOto9 extends Person9{
    private int maluc,giaban;
    public XeOto9(String ma,String ten,String hang,String color ,int maluc,int giaban ){
        super(ma,ten,hang,color);
        this.maluc=maluc;
        this.giaban=giaban;
    }
    public int getGiaban(){
        return this.giaban;
    }


    @Override
    public String toString(){
        return super.toString() +" "+this.maluc+" "+this.giaban;
    }

}
