/*
*
*Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222). Đầu tiên in ra danh sách giáo viên theo lương giảm dần, nếu 2 giáo viên có cùng lương thì in theo mã giáo viên tăng dần(từ điển), tiếp đó in ra danh sách sinh viên theo gpa giảm dần, nếu 2 sinh viên có cùng gpa thì in theo mã sinh viên tăng dần(từ điển).

Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0

5
GV1
pham duC LoNG
4/3/1976
Ha Nam
CNTT
18000000
SV2
Vu AnH LoNG
3/11/2004
Hai Duong
DTVT1
2.70
SV3
trAN AnH NAM
27/11/2004
Nam Dinh
ATTT3
3.05
GV4
Nguyen VAn MaNH
12/4/1978
Ha Noi
Co khi
25000000
SV5
Luong Phuong HaI
3/4/2004
Nam Dinh
DTVT2
2.50
Sample Output 0

DANH SACH GIAO VIEN :
GV4 Nguyen Van Manh 12/04/1978 Ha Noi Co khi 25000000
GV1 Pham Duc Long 04/03/1976 Ha Nam CNTT 18000000
DANH SACH SINH VIEN :
SV3 Tran Anh Nam 27/11/2004 Nam Dinh ATTT3 3.05
SV2 Vu Anh Long 03/11/2004 Hai Duong DTVT1 2.70
SV5 Luong Phuong Hai 03/04/2004 Nam Dinh DTVT2 2.50
*
*
* */




package kethuajava.bai5;

import java.util.Comparator;

public class Sort52 implements Comparator<Teacher5> {
    public  int compare(Teacher5 a,Teacher5 b){
        if(a.getLuong()!=b.getLuong()){
            if(a.getLuong()> b.getLuong()){
                return -1;
            }else return 1;
        }else {
            return a.getMgv().compareTo(b.getMgv());
        }

    }
}
