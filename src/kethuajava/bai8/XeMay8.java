package kethuajava.bai8;

public class XeMay8 extends  Person8 {
    private  int tocdo,giaban;
    public XeMay8(String ma,String ten,String hang,String color ,int tocdo,int giaban ){
        super(ma,ten,hang,color);
        this.tocdo=tocdo;
        this.giaban=giaban;
    }
    public int getGiaban(){
        return this.giaban;
    }

    @Override
    public String toString(){
        return super.toString() +" "+this.tocdo+" "+this.giaban;
    }

}
