package bai1_th2;

/**
 *
 * @author foet1
 */
public class Sinh_Vien_Mat_Ma extends Sinh_Vien{
    private final String don_vi;
    private final Double luong;
    
    public Sinh_Vien_Mat_Ma(String msv, String ho_ten, String ngay_sinh, String gioi_tinh, Double diem_tb,String don_vi, Double luong){
        super(msv,ho_ten,ngay_sinh,gioi_tinh,diem_tb);
        this.don_vi = don_vi;
        this.luong = luong;
    }
    
    @Override
    public void Show(){
        System.out.printf("Ho ten: %10s, Ma sinh vien: %10s, Ngay sinh: %10s, Gioi tinh: %10s, Diem trung binh: %10f, Don vi: %10s, Luong: %10.3f\n", ho_ten,msv,ngay_sinh,gioi_tinh,diem_tb, don_vi,luong );
    }
        
}
