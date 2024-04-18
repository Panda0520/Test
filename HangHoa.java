package Btljava;
import java.io.Serializable;
import java.util.Scanner;
    public class HangHoa implements Serializable{
        private String MaDT;
        private String tenDT;
        private int soLuongban;
        private String mauDT;
        private String hangDT;
        private String namSX;
        private float giaBan;
        private float thoiGianbaohanh;

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public int getSoLuongban() {
        return soLuongban;
    }

    public void setSoLuongban(int soLuongban) {
        this.soLuongban = soLuongban;
    }

    public String getMauDT() {
        return mauDT;
    }

    public void setMauDT(String mauDT) {
        this.mauDT = mauDT;
    }

    public String getHangDT() {
        return hangDT;
    }

    public void setHangDT(String hangDT) {
        this.hangDT = hangDT;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getThoiGianbaohanh() {
        return thoiGianbaohanh;
    }

    public void setThoiGianbaohanh(float thoiGianbaohanh) {
        this.thoiGianbaohanh = thoiGianbaohanh;
    }
    
  
    public void nhapDT(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nNhap ma dien thoai: ");
        MaDT = sc.nextLine();
        System.out.println("Nhap ten dien thoai: ");
        tenDT = sc.nextLine();
        System.out.println("Nhap  mau dien thoai: ");
        mauDT = sc.nextLine();
        System.out.println("Nhap hang dien thoai: ");
        hangDT = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSX = sc.nextLine();
        System.out.println("Nhap so luong ban: ");
        soLuongban = sc1.nextInt();
        System.out.println("Nhap gia ban: ");
        giaBan = sc1.nextFloat();
        System.out.println("Nhap thoi gian bao hanh: ");
        thoiGianbaohanh = sc1.nextFloat();
    }
    public void xuatDT(){
       
        System.out.printf("\n%15s",MaDT);
        System.out.printf("%17s",tenDT);
        System.out.printf("%17s",mauDT);
        System.out.printf("%19s",hangDT);
        System.out.printf("%16s",namSX);
        System.out.printf("%12d",soLuongban);
        System.out.printf("%13.2f",giaBan);
        System.out.printf("%22.2f",thoiGianbaohanh);
        System.out.println("\n");
    }

}