package HocKeThua;

public class Student extends  Person{
    private  String className;
    private double gpa;
    public Student(){
        System.out.println("ham default cuar ham con dc goi");
    }
    public Student(String className,double gpa,String ten,String diachi,String ngaysinh){
        super(ten, diachi, ngaysinh);
        this.className=className;
        this.gpa=gpa;
    }
    public  String getName(){
        return this.ten;
    }
    @Override
    public String toString(){
        return super.toString() + this.className + " " + String.format("%.2f", this.gpa)+" "+this.getName();
    }
}
