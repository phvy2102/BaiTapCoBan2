/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg205141100112;

import java.util.ArrayList;

public class DANHSACHHOCVIEN {

    private ArrayList<HocVien> danhSach;
    private ArrayList<HocVien> danhSachDat;

    public DANHSACHHOCVIEN() {
        this.danhSach = new ArrayList<HocVien>();
    }

    public DANHSACHHOCVIEN(ArrayList<HocVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themHocVien(HocVien sv) {
        this.danhSach.add(sv);
    }

    public void inHocVienDat() {
        for (HocVien sinhVien : danhSach) {
            if (sinhVien.getDTB() > 7) {
                System.out.println(sinhVien);
            }
        }
    }
    
    public int laySoLuongHocVienDat() {
        int dem = 0;
        for (HocVien sinhVien : danhSach) {
            if (sinhVien.getDTB() > 7) {
                dem++;
            }
        }
        return dem;
    }
    
    public void inDANHSACHHOCVIEN() {
        for (HocVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    public int laySoLuongHocVien() {
        return this.danhSach.size();
    }

    public boolean kiemTraTonTai(HocVien sv) {
        return this.danhSach.contains(sv);
    }

    public boolean xoaHocVien(HocVien sv) {
        return this.danhSach.remove(sv);
    }

    public float diemTBLonNhat() {
        float max = 0;
        for (HocVien sinhVien : danhSach) {
            if (max < sinhVien.getDTB()) {
                max = sinhVien.getDTB();
            }
        }
        return max;
    }

    public void XuatDiemTBLonNhat() {
        for (HocVien sinhVien : danhSach) {
            if (sinhVien.getDTB() == diemTBLonNhat()) {
                System.out.println(sinhVien);
            }
        }
    }
}

