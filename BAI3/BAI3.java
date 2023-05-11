/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SinhVien {
    private String ma;
    private String hoTen;
    private int namSinh;

    public SinhVien(String ma, String hoTen, int namSinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Mã: " + ma + ", Họ tên: " + hoTen + ", Năm sinh: " + namSinh;
    }
}

class Main {
    private ArrayList<SinhVien> danhSachSinhVien;

    public Main() {
        danhSachSinhVien = new ArrayList<>();
    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    public void xoaSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.remove(sinhVien);
    }

    public SinhVien timKiemSinhVienTheoMa(String ma) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMa().equals(ma)) {
                return sinhVien;
            }
        }
        return null;
    }

    public SinhVien timKiemSinhVienTheoTen(String ten) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().equals(ten)) {
                return sinhVien;
            }
        }
        return null;
    }

    public void sapXepDanhSachSinhVienTheoMaTangDan() {
        Collections.sort(danhSachSinhVien, Comparator.comparing(SinhVien::getMa));
    }

    public void sapXepDanhSachSinhVienTheoTenTangDan() {
        Collections.sort(danhSachSinhVien, Comparator.comparing(SinhVien::getHoTen));
    }

    public static void main(String[] args) {
        Main quanLySinhVien = new Main();

      
        quanLySinhVien.themSinhVien(new SinhVien("001", "Nguyễn Văn A", 2000));
        quanLySinhVien.themSinhVien(new SinhVien("002", "Trần Thị B", 1999));
        quanLySinhVien.themSinhVien(new SinhVien("003", " Lê Hồng C", 1988));
       
 
    ArrayList<SinhVien> danhSach = quanLySinhVien.getDanhSachSinhVien();
    System.out.println("Danh sách sinh viên:");
    for (SinhVien sinhVien : danhSach) {
        System.out.println(sinhVien);
    }

    
    quanLySinhVien.themSinhVien(new SinhVien("004", "Mai Thị F", 2004));

 
    SinhVien svXoa = quanLySinhVien.timKiemSinhVienTheoMa("002");
    if (svXoa != null) {
        quanLySinhVien.xoaSinhVien(svXoa);
        System.out.println("Đã xóa sinh viên: " + svXoa);
    }

    
    SinhVien svTimKiem = quanLySinhVien.timKiemSinhVienTheoTen("Lê Hồng C");
    if (svTimKiem != null) {
        System.out.println("Sinh viên được tìm thấy: " + svTimKiem);
    } else {
        System.out.println("Không tìm thấy sinh viên.");
    }

 
    quanLySinhVien.sapXepDanhSachSinhVienTheoMaTangDan();
    System.out.println("Danh sách sinh viên sau khi sắp xếp theo mã tăng dần:");
    for (SinhVien sinhVien : danhSach) {
        System.out.println(sinhVien);
    }

    
    quanLySinhVien.sapXepDanhSachSinhVienTheoTenTangDan();
    System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên tăng dần:");
    for (SinhVien sinhVien : danhSach) {
        System.out.println(sinhVien);
    }
}
}

      
        
