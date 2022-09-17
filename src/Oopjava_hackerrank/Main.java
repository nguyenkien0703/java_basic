package Oopjava_hackerrank;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0 ){
            Triangle a =new Triangle(Point.nextPoint(sc),Point.nextPoint(sc),Point.nextPoint(sc));
            if(!a.Valid()){
                System.out.println("INVAlID");
            }else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}

class Point {
    private double x, y ;
    public Point() {

    }
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public  static Point nextPoint(Scanner sc){
        Point a = new Point(0,0);
        a.x=sc.nextDouble();
        a.y=sc.nextDouble();
        return a ;
    }
    public  double getX(){
        return x ;
    }
    public  double getY(){
        return y ;
    }
};


class  Triangle{
    private Point A,B,C;
    public Triangle(Point A, Point B, Point C) {
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public  static double edgeLength(Point a, Point b ) {
        return Math.sqrt((a.getX()-b.getX())* (a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));


    }
    public  boolean Valid() {
        double AB =edgeLength(A,B);
        double AC =edgeLength(A,C);
        double BC =edgeLength(B,C);
        return  AB> 0 && BC> 0 && AC > 0 && AC+BC>AB && AC+AB>BC && AC<AB+BC;
    }
    public String getPerimeter() {
        double AB =edgeLength(A,B);
        double AC =edgeLength(A,C);
        double BC =edgeLength(B,C);
        double CV=AB+AC+BC;
        double p=CV/2;
        double S = Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
        return String.format("%.3f %.3f",CV,S);


    }

}


