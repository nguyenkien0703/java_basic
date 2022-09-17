package kethuajava.bai2;

public class Student2 extends  Person2 {
    private String className,msv;
    private double gpa;
    public Student2(String ten,String ns,String diachi,String className,int msv,double gpa){
        super(ten,ns,diachi);
        this.className=className;
        this.gpa=gpa;
        this.msv=String.format("%04d",msv);
    }
    @Override
    public String toString(){
        return this.msv+" "+super.toString()+" "+this.className+" "+String.format("%.2f",this.gpa);

    }
}
