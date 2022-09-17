/*
*
* Xây dựng lớp Person với các thuộc tính : Tên (xâu kí tự không quá 100 kí tự), ngày sinh, địa chỉ và các hàm khởi tạo không tham số (gán các trường là xâu rỗng) và hàm khởi tạo đầy đủ tham số, phương thức toString để trả về thông tin. Lớp Student kế thừa từ lớp Person và có thêm thuộc tính là mã sinh viên, GPA và lớp, ghi đè phương thức toString. Nhập danh sách sinh viên từ bàn phím và in ra màn hình danh sách sinh viên trong đó tên được chuẩn hóa và ngày sinh đưa về đúng chuẩn dd/mm/yyyy. Tên sinh viên được sắp xếp theo thứ tự từ điển tăng dần, thứ tự từ điển của tên được xét từ tên, họ, đệm. Nếu 2 bạn cùng tên thì bạn nào xuất hiện trong danh sách trước được in ra trước.

Input Format

Dòng 1 là N : số lượng sinh viên. Các dòng tiếp theo là thông tin sinh viên, mỗi sinh viên được mô tả bằng 5 dòng : Tên, ngày sinh, địa chỉ, lớp, gpa.

Constraints

1<=N<=1000;

Output Format

In ra danh sách sinh viên sau khi được chuẩn hóa, mã sinh viên tăng tự động từ 0001. Các thông tin viết cách nhau một dấu cách, điểm GPA in ra với 2 số sau dấu phẩy.

Sample Input 0

6
trAN Phuong HaI
17/4/2004
Ha Noi
DTVT1
2.50
trAN Phuong TuaN
28/1/2004
Ha Nam
DTVT1
2.50
Nguyen AnH MaNH
11/3/2004
Ha Noi
CNTT1
2.70
pham duC TuaN
21/5/2004
Ha Noi
DTVT1
2.50
trAN VAn LoNG
24/6/2004
Ha Noi
CNTT1
2.80
Luong Ngoc LoNG
12/11/2004
Nam Dinh
CNTT2
3.05
Sample Output 0

0001 Tran Phuong Hai 17/04/2004 Ha Noi DTVT1 2.50
0006 Luong Ngoc Long 12/11/2004 Nam Dinh CNTT2 3.05
0005 Tran Van Long 24/06/2004 Ha Noi CNTT1 2.80
0003 Nguyen Anh Manh 11/03/2004 Ha Noi CNTT1 2.70
0004 Pham Duc Tuan 21/05/2004 Ha Noi DTVT1 2.50
0002 Tran Phuong Tuan 28/01/2004 Ha Nam DTVT1 2.50
*
* */


package kethuajava.bai2;

public class Person2 {
    protected String ten,ns,diachi;
    public Person2(){
        this.ten=this.ns=this.diachi="";
    }
    public Person2(String ten,String ns,String diachi){
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
