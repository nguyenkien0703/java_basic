/*
*
*Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp mà giáo viên này phụ trách. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222) sau đó hiển thị giáo viên phụ trách và các sinh viên thuộc về 1 lớp theo truy vấn.

Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 7 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp phụ trách. Dòng cuối cùng trong input là tên lớp cần truy vấn.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra giáo viên phụ trách lớp, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, một lớp có thể có nhiều giáo viên cùng phụ trách. Khi đó hãy liệt kê giáo viên theo danh sách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy theo danh sách.

Sample Input 0

8
GV1
Nguyen VAn TuaN
6/2/1975
Nam Dinh
DTVT
25000000
CNTT1
SV2
Vu AnH MaNH
13/10/2004
Ha Noi
DTVT1
2.70
SV3
trAN Phuong TuaN
5/9/2004
Hai Duong
ATTT3
2.80
GV4
trAN duC HaI
14/12/1973
Ha Nam
Co khi
25000000
CNTT2
SV5
Nguyen Ngoc TuaN
13/11/2004
Hai Duong
CNTT1
3.05
SV6
Luong duC LoNG
6/1/2004
Hai Duong
CNTT2
2.70
GV7
Nguyen Phuong TuaN
25/4/1974
Nam Dinh
Co khi
12000000
DTVT1
SV8
Luong duC NAM
3/2/2004
Ha Noi
CNTT1
2.50
CNTT1
Sample Output 0

DANH SACH GIAO VIEN PHU TRACH LOP CNTT1 :
GV1 Nguyen Van Tuan 06/02/1975 Nam Dinh DTVT 25000000 CNTT1
DANH SACH SINH VIEN LOP CNTT1 :
SV5 Nguyen Ngoc Tuan 13/11/2004 Hai Duong CNTT1 3.05
SV8 Luong Duc Nam 03/02/2004 Ha Noi CNTT1 2.50
*
* */


package kethuajava.bai6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student6> list1=new ArrayList<>();
        List<Teacher6> list2=new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            if(ma.substring(0,2).equals("GV")){
                String ten =sc.nextLine();
                String ns = sc.nextLine();
                String diachi= sc.nextLine();;
                String khoa = sc.nextLine();
                int luong =Integer.parseInt(sc.nextLine());
                String lop= sc.nextLine();
                Teacher6 l =new Teacher6(ten,lop,ns,diachi,ma,khoa,luong);
                l.chuanHoa();
                list2.add(l);

            }else {
                String ten =sc.nextLine();
                String ns = sc.nextLine();
                String diachi= sc.nextLine();;
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                Student6 l= new Student6(ten,ns,diachi,ma,lop,gpa);
                l.chuanHoa();
                list1.add(l);
            }
        }
        String find =sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP "+find+" :");
        for(Teacher6 x : list2){
            if(x.getLop().equals(find)){
                System.out.println(x);
            }
        }
        System.out.println("DANH SACH SINH VIEN LOP "+find+" :");
        for(Student6 x : list1){
            if(x.getClassName().equals(find)){
                System.out.println(x);
            }
        }
    }
}
