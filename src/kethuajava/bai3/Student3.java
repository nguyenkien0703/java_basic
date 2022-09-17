package kethuajava.bai3;

public class Student3  extends  Person3{
    private String msv,className;
    private  double gpa;
    public Student3(String ten,String ns,String diachi,String msv,String className,double gpa ){
        super(ten,ns,diachi);
        this.msv=msv;
        this.className=className;
        this.gpa=gpa;
    }
    @Override
    public String toString(){
        return this.msv+" "+super.toString()+" "+this.className+" "+String.format("%.2f",this.gpa);

    }
}
