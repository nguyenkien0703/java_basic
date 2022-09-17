package kethuajava.bai8;

public class XeOto8 extends Person8{
    private int maluc,giaban;
    public XeOto8(String ma,String ten,String hang,String color ,int maluc,int giaban ){
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
