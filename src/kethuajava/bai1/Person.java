package kethuajava.bai1;

public class Person {
    protected  String ten, ns,diachi;

    public Person(){

    }
    public Person(String ten,String ns,String diachi){
        this.ten=ten;
        this.ns=ns;
        this.diachi=diachi;
    }
    public  void chuanHoa(){
        StringBuilder sb=new StringBuilder("");
        String [] arr = this.ten.split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1;i<x.length();i++){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        this.ten=sb.toString();
        StringBuilder sb1= new StringBuilder(this.ns);
        if(sb1.charAt(1)=='/'){
            sb1.insert(0,"0");
        }
        if(sb1.charAt(4)=='/'){
            sb1.insert(3,"0");
        }
        this.ns= sb1.toString();
    }


    @Override
    public String toString(){
        return this.ten+" "+this.ns+" "+this.diachi;

    }
}
