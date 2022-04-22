/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg205141100112;
import java.util.Objects;

public class HocVien implements Comparable<HocVien> {

    private String maHocVien;
    private String hoVaTen;
    private int namSinh;
    private float DiemKT1;
    private float DiemKT2;
    private float DiemThiCK;

    public HocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public HocVien(String maHocVien, String hoVaTen, int namSinh, float DiemThiCK, float DiemKT1, float DiemKT2) {
        this.maHocVien = maHocVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.DiemKT1 = DiemKT1;
        this.DiemKT2 = DiemKT2;
        this.DiemThiCK = DiemThiCK;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemThiCK() {
        return DiemThiCK;
    }

    public void setDiemThiCK(float DiemThiCK) {
        this.DiemThiCK = DiemThiCK;
    }

    public float getDiemKT1() {
        return DiemKT1;
    }

    public void setDiemKT1(float DiemKT1) {
        this.DiemKT1 = DiemKT1;
    }

    public float getDiemKT2() {
        return DiemKT1;
    }

    public void setDiemKT2(float DiemKT2) {
        this.DiemKT2 = DiemKT2;
    }

    public float getDTB() {
        return ((DiemKT1 + DiemKT2) / 2 + DiemThiCK * 2) / 3;
    }

    public String getXepLoai() {
        return getDTB() >= 8 ? "Gioi" : (getDTB() >= 7 ? "Kha" : (getDTB() >= 5 ? "Trung binh" : "Khong dat"));
    }

    @Override
    public String toString() {
        return "HocVien [maHocVien=" + maHocVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", DiemKT1=" + DiemKT1 + ", DiemKT2=" + DiemKT2 + ", DiemThiCK=" + DiemThiCK + ", DTB=" + getDTB() + ", XepLoai=" + getXepLoai() + "]";
    }

    @Override
    public int compareTo(HocVien o) {
        return this.maHocVien.compareTo(o.maHocVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getXepLoai(), getDTB(), DiemKT1, DiemKT2, DiemThiCK, hoVaTen, maHocVien, namSinh);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HocVien other = (HocVien) obj;
        return Objects.equals(maHocVien, other.maHocVien);
    }

}

