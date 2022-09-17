package kethuajava.bai1;

public class Student extends  Person{
    private String  className,msv;
    private  double gpa;
    public Student(String ten,String ns , String diachi ,String className,int msv,double gpa){
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
