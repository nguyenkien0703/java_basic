package HocKeThua;

public class Person {
    protected String ten ,diachi, ngaysinh;
    public Person(){
        System.out.println("ham cha dc goi");
    }
    public Person(String ten,String diachi,String ngaysinh){
        this.ten=ten;
        this.diachi=diachi;
        this.ngaysinh=ngaysinh;
    }
    @Override
    public  String toString(){
        return this.ten+" "+this.ngaysinh+" "+this.diachi;
    }
}
