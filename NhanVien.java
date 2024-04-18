package Btljava;
import java.io.Serializable;
import java.util.Scanner;
    public class NhanVien extends Thongtin implements Serializable{
        private String maNV;
        private float heSoluong;
            public String getMaNV() {
            return maNV;
        }
        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }
            public void nhapNV(){
                Scanner sc = new Scanner(System.in);
                super.nhap();
                System.out.println("Nhap ma nhan vien:");
                maNV = sc.nextLine();
                System.out.println("Nhap he so luong:");
                heSoluong = sc.nextFloat();
                                 }
            public void xuatNV()
            {
                super.tieude();
                tieude1();
                super.xuat();
                System.out.printf("%16s",maNV);
                System.out.printf("%16.2f",heSoluong * tien);
            }
            public void tieude1()
            {
                System.out.printf("%16s","Ma nhan vien");
                System.out.printf("%16s","Tien luong");
            }

}
    

