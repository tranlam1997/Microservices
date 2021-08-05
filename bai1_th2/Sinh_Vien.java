package bai1_th2;

import java.io.Serializable;

/**
 *
 * @author foet1
 */
public class Sinh_Vien implements Serializable{
    protected String msv, ho_ten, ngay_sinh, gioi_tinh;
    protected Double diem_tb;
    
    public Sinh_Vien(String msv, String ho_ten, String ngay_sinh, String gioi_tinh, Double diem_tb){
        this.msv = msv;
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.diem_tb = diem_tb;
    }
    public void set_MSV(String msv) { this.msv = msv; }
    public void set_Hoten(String ho_ten) { this.ho_ten = ho_ten; }
    public void set_Ngaysinh(String ngay_sinh) { this.ngay_sinh = ngay_sinh; }
    public void set_Gioitinh(String gioi_tinh) { this.gioi_tinh = gioi_tinh; }
    public void set_Diemtb(Double diem_tb) { this.diem_tb = diem_tb; }

    public void Show() {
        System.out.printf("Ho ten: %10s, Ma sinh vien: %10s, Ngay sinh: %10s, Gioi tinh: %10s, Diem trung binh: %10f", ho_ten,msv,ngay_sinh,gioi_tinh,diem_tb );
    }
}
