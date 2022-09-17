package Oopjava_hackerrank;

import java.util.Scanner;

public class LopHCN {
    private  double width, height;
    private  static  String color;

    public LopHCN(){
    }
    public LopHCN (double width, double height ,String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public static String getColor(){
        return  color;
    }
    public static void setColor(){
        LopHCN.color=color;
    }
    public double findArea(){
        return (this.width*this.height);
    }
    public double findPerimeter(){
        return 2*(this.width+this.height);
    }
    public  void ChuanHoa(){
        String cnt1=this.color;
        String kien="";
        kien+=Character.toUpperCase(cnt1.charAt(0));
        for(int i=1;i<cnt1.length();i++){
            kien+=Character.toLowerCase(cnt1.charAt(i));
        }
    }

    @Override
    public String toString(){
        return String.format("%.0f",findPerimeter())+" "+String.format("%.0f",findArea())+" "+this.color;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        if(n<=0 || m<=0 ){
            System.out.println("INVALID");
            return ;
        }
        String s =sc.nextLine();
        LopHCN x= new LopHCN(n,m,s);
        x.ChuanHoa();;
        System.out.println(x);
    }

}
