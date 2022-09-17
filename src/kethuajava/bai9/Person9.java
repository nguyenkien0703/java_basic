package kethuajava.bai9;

public class Person9 {
    protected  String ma,ten,hang,color;
    public Person9(String ma,String ten,String hang,String color){
        this.ma=ma;
        this.ten=ten;
        this.hang=hang;
        this.color=color;
    }
    public String getHang(){
        return this.hang;
    }
    public String getMa(){
        return this.ma;
    }

    @Override
    public String toString(){
        return this.ma+" "+this.ten+" "+this.hang+" "+this.color;
    }

}
