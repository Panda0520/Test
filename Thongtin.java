package Btljava;
import java.io.Serializable;
import java.util.Scanner;
    public class Thongtin implements Serializable{
        private String hoTen;
        private int sdt;
        private String gmail;
        private String queQuan;
        private String ngaySinh;
        private String CCCD;
        static float tien = 1500000;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
            System.out.println("Hay nhap ho ten: ");
            hoTen = sc.nextLine();
            System.out.println("nhap so dien thoai: ");
            sdt = sc1.nextInt();
            System.out.println("Hay nhap gmail: ");
            gmail = sc.nextLine();
            System.out.println("nhap que quan: ");
            queQuan = sc.nextLine();
            System.out.println("nhap ngay sinh(dd/mm/yy): ");
            ngaySinh = sc.nextLine();
            System.out.println("Hay nhap so CCCD: ");
            CCCD = sc.nextLine();

    }
    public void tieude()
    {
        System.out.printf("\n%17s","Ho ten");
        System.out.printf("%18s","So dien thoai");
        System.out.printf("%20s", "Gmail");
        System.out.printf("%11s", "Que quan");
        System.out.printf("%12s", "Ngay sinh");
        System.out.printf("%15s", "so CCCD");
        
    }
    public void xuat()
    {
        System.out.printf("\n%17s", hoTen);
        System.out.printf("%18d", sdt);
        System.out.printf("%20s", gmail);
        System.out.printf("%11s", queQuan);
        System.out.printf("%12s", ngaySinh);
        System.out.printf("%15s", CCCD);
        
       
        
        

    }

}
