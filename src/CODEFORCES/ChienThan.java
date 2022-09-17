
import java.util.Scanner;

public class ChienThan {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        int t=sc.nextInt();

        while(t-- >0 ){
            int n = sc.nextInt();
            sc.nextLine();
            String s =sc.nextLine();
            n/=2;
            char mid =s.charAt(n);
            int cnt =0;
            for(int i=n;i>=0;i--){
                if(s.charAt(i)==  mid) ++cnt ;
                else break;;
            }
            for(int i=n+1;i<s.length();i++){
                if(s.charAt(i)== mid ) ++cnt ;
                else break;
            }

            System.out.println(cnt);

        }
    }
}
