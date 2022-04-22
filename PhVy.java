/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg205141100112;
import java.util.Scanner;

public class PhVy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DANHSACHHOCVIEN dshv = new DANHSACHHOCVIEN();
        int luaChon = 0;
        do {
            System.out.println("---------- Mời chọn ---------- ");
            System.out.println(
                      "1.Thêm học viên vào danh sách.\n"
                    + "2. In danh sách học viên ra màn hình.\n"
                    + "3. In danh sách học viên đạt.\n"
                    + "4. Lấy ra số lượng học viên trong danh sách.\n"
                    + "5. Lấy ra số lượng học viên đạt trong danh sách.\n"        
                    + "6. Kiểm tra học viên có tồn tại trong danh sách hay không, dựa trên mã học viên.\n"
                    + "7. Xóa một học viên ra khỏi danh sách dựa trên mã học viên.\n"
                    + "8. Xuất ra học viên có điểm trung bình cao nhất.\n"
                    + "0. Thoát ");
            System.out.println("Vui lòng chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    {
                        System.out.println("Nhập mã học viên: ");
                        String maHocVien = sc.nextLine();
                        System.out.println("Nhập họ và tên: ");
                        String hoVaTen = sc.nextLine();
                        System.out.println("Nhập năm sinh: ");
                        int namSinh = sc.nextInt();
                        System.out.println("Nhập điểm kiểm tra 1 : ");
                        float diemKT1 = sc.nextFloat();
                        System.out.println("Nhập điểm kiểm tra 2 : ");
                        float diemKT2 = sc.nextFloat();
                        System.out.println("Nhập điểm kiểm tra cuối khóa : ");
                        float diemThiCK = sc.nextFloat();
                        HocVien hv = new HocVien(maHocVien, hoVaTen, namSinh, diemKT1, diemKT2, diemThiCK);
                        dshv.themHocVien(hv);
                        break;
                    }
                case 2:
                    dshv.inDANHSACHHOCVIEN();
                    break;
                case 3:
                    dshv.inHocVienDat();
                    break;
                case 4:
                    System.out.println("Số lượng hiện tại: " + dshv.laySoLuongHocVien());
                    break;
                case 5:
                    
                    System.out.println("Số lượng học viên đạt hiện tại: " + dshv.laySoLuongHocVienDat());
                    break;
                case 6:
                    {
                        System.out.println("Nhập mã học viên: ");
                        String maHocVien = sc.nextLine();
                        HocVien hv = new HocVien(maHocVien);
                        System.out.println("Kiếm tra học viên có trong danh sách: " + dshv.kiemTraTonTai(hv));
                        break;
                    }
                case 7:
                    {
                        System.out.println("Nhập mã học viên: ");
                        String maHocVien = sc.nextLine();
                        HocVien hv = new HocVien(maHocVien);
                        System.out.println("Xóa học viên trong danh sách: " + dshv.xoaHocVien(hv));
                        break;
                    }
                case 8:
                    System.out.println("Học viên có điểm trung bình cao nhất: ");
                    dshv.XuatDiemTBLonNhat();
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }
}
