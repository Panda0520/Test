package Btljava;
import java.io.Serializable;
import java.util.Scanner;
    public class KhachHang extends Thongtin implements Serializable{
        private String maKH;
    public String getMaKH() {
            return maKH;
        }
        public void setMaKH(String maKH) {
            this.maKH = maKH;
        }
    public void nhapKH()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap ma khach hang: ");
        maKH = sc.nextLine();
    }
    public void xuatKH ()
    {   super.tieude();
        System.out.printf("%17s","Ma khach hang");
        super.xuat();
        System.out.printf("%17s",maKH);
        
    }
  
}
    

