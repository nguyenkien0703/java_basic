package Oopjava_hackerrank;

import java.util.Scanner;

public class Matrix {
    private int n,m ;
    private int [][] a ;
    public Matrix(int n , int m ){
        this.m=m;
        this.n=n;
        a= new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                this.a[i][j]=sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix other){
        Matrix res =new Matrix(this.n,other.m);
        for(int i=0;i<this.n;i++){
            for(int j=0;j<other.m;j++){
                res.a[i][j]=0;
                for(int k=0;k<this.m;k++){
                    res.a[i][j]+=(this.a[i][k]* other.a[k][j]);

                }
            }
        }
        return res ;
    }

    @Override
    public String toString (){
        String ans ="";
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.m;j++){
                ans += this.a[i][j]+" ";
            }
            ans +="\n";
        }
        return  ans ;

    }

    public  Matrix trans(){
        Matrix ans = new Matrix(this.m,this.n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) ans.a[i][j] = a[j][i];
        }
        return  ans;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m= sc.nextInt(),p=sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);

        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));

    }
}
