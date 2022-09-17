package kethuajava.bai6;

public class Student6 extends  Person6{
    private String msv,className;
    private  double gpa;
    public Student6(String ten,String ns,String diachi,String msv,String className,double gpa ){
        super(ten,ns,diachi);
        this.msv=msv;
        this.className=className;
        this.gpa=gpa;
    }
    public  String getClassName(){
        return  this.className;
    }
    @Override
    public String toString(){
        return this.msv+" "+super.toString()+" "+this.className+" "+String.format("%.2f",this.gpa);

    }
}
