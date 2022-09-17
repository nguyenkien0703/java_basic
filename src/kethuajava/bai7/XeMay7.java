package kethuajava.bai7;

public class XeMay7 extends  Person7{
    private  int tocdo,giaban;
    public XeMay7(String ma,String ten,String hang,String color ,int tocdo,int giaban ){
        super(ma,ten,hang,color);
        this.tocdo=tocdo;
        this.giaban=giaban;
    }
    public String getHang(){
        return this.hang;
    }
    @Override
    public String toString(){
        return super.toString() +" "+this.tocdo+" "+this.giaban;
    }


}
