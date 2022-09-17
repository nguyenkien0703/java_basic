/*
*
* Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222).

Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0

9
GV1
Nguyen duC TuaN
4/6/1977
Thai Binh
CNTT
12000000
SV2
Luong VAn HaI
1/6/2004
Thai Binh
CNTT2
2.50
SV3
Nguyen AnH MaNH
14/2/2004
Thai Binh
CNTT2
2.50
GV4
Nguyen AnH HaI
20/3/1974
Ha Nam
KT
20000000
SV5
pham AnH MaNH
8/5/2004
Ha Nam
CNTT1
2.70
SV6
pham Phuong MaNH
18/7/2004
Ha Noi
CNTT2
2.50
GV7
trAN Phuong LoNG
6/2/1979
Ha Noi
ATTT
20000000
SV8
Nguyen VAn HaI
25/8/2004
Nam Dinh
CNTT2
2.70
SV9
Luong Ngoc HaI
16/11/2004
Ha Noi
CNTT1
3.20
Sample Output 0

DANH SACH GIAO VIEN :
GV1 Nguyen Duc Tuan 04/06/1977 Thai Binh CNTT 12000000
GV4 Nguyen Anh Hai 20/03/1974 Ha Nam KT 20000000
GV7 Tran Phuong Long 06/02/1979 Ha Noi ATTT 20000000
DANH SACH SINH VIEN :
SV2 Luong Van Hai 01/06/2004 Thai Binh CNTT2 2.50
SV3 Nguyen Anh Manh 14/02/2004 Thai Binh CNTT2 2.50
SV5 Pham Anh Manh 08/05/2004 Ha Nam CNTT1 2.70
SV6 Pham Phuong Manh 18/07/2004 Ha Noi CNTT2 2.50
SV8 Nguyen Van Hai 25/08/2004 Nam Dinh CNTT2 2.70
SV9 Luong Ngoc Hai 16/11/2004 Ha Noi CNTT1 3.20
*
* */
package kethuajava.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student3> list1=new ArrayList<>();
        List<Teacher3> list2=new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            if(ma.substring(0,2).equals("GV")){
                String ten =sc.nextLine();
                String ns = sc.nextLine();
                String diachi= sc.nextLine();;
                String khoa = sc.nextLine();
                int luong =sc.nextInt();
                Teacher3 l =new Teacher3(ten,ns,diachi,ma,khoa,luong);
                l.chuanHoa();
                list2.add(l);

            }else {
                String ten =sc.nextLine();
                String ns = sc.nextLine();
                String diachi= sc.nextLine();;
                String lop = sc.nextLine();

                double gpa =sc.nextDouble();
                Student3 l= new Student3(ten,ns,diachi,ma,lop,gpa);
                l.chuanHoa();
                list1.add(l);

            }

        }
        System.out.println("DANH SACH GIAO VIEN :");
        for(Teacher3 x : list2){
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for(Student3 x : list1){
            System.out.println(x);
        }
    }
}
