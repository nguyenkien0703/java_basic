package kethuajava.bai6;

public class Person6 {
    protected String ten,ns,diachi;
    public Person6(){
        this.ten=this.ns=this.diachi="";
    }
    public Person6(String ten,String ns,String diachi){
        this.ten=ten;
        this.ns=ns;
        this.diachi=diachi;
    }
    public  String getName(){
        return this.ten;
    }
    public void chuanHoa(){
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
        StringBuilder sb2=new StringBuilder(this.ns);
        if(sb2.charAt(1)=='/'){
            sb2.insert(0,"0");
        }
        if(sb2.charAt(4)=='/'){
            sb2.insert(3,"0");
        }
        this.ns=sb2.toString();
    }
    @Override
    public String toString(){
        return this.ten+" "+this.ns+" "+this.diachi;
    }

}
