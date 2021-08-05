package bai1_th2;

/**
 *
 * @author foet1
 */
public class Sinh_Vien_HTTT extends Sinh_Vien {
    private final Double hoc_phi;
    
    public Sinh_Vien_HTTT(String msv, String ho_ten, String ngay_sinh, String gioi_tinh, Double diem_tb,Double hoc_phi) {
        super(msv,ho_ten,ngay_sinh,gioi_tinh,diem_tb);
        this.hoc_phi = hoc_phi;
    }
    
    @Override
    public void Show(){
        System.out.printf("Ho ten: %10s, Ma sinh vien: %10s, Ngay sinh: %10s, Gioi tinh: %10s, Diem trung binh: %10.3f, Hoc phi: %10.3f", ho_ten,msv,ngay_sinh,gioi_tinh,diem_tb,hoc_phi );
    }
}
