package kethuajava.bai9;

public class XeMay9 extends  Person9{
    private  int tocdo,giaban;
    public XeMay9(String ma,String ten,String hang,String color ,int tocdo,int giaban ){
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
