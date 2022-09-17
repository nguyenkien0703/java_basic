package kethuajava.bai5;

public class Student5 extends  Person5{
    private String msv,className;
    private  double gpa;
    public Student5(String ten,String ns,String diachi,String msv,String className,double gpa ){
        super(ten,ns,diachi);
        this.msv=msv;
        this.className=className;
        this.gpa=gpa;
    }
    public  double getGpa(){
        return  this.gpa;
    }
    public  String getMsv(){
        return  this.msv;
    }
    @Override
    public String toString(){
        return this.msv+" "+super.toString()+" "+this.className+" "+String.format("%.2f",this.gpa);

    }
}
