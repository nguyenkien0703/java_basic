package kethuajava.bai7;

public class Person7 {
    protected  String ma,ten,hang,color;
    public Person7(String ma,String ten,String hang,String color){
        this.ma=ma;
        this.ten=ten;
        this.hang=hang;
        this.color=color;
    }
    @Override
    public String toString(){
        return this.ma+" "+this.ten+" "+this.hang+" "+this.color;
    }



}
