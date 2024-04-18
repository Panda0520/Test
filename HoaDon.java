package Btljava;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

    public class HoaDon implements Serializable
    {
        int n;
        private String maHD;
        private String ngayLap;

            ArrayList<HangHoa> DsHH;
            ArrayList<NhanVien> dsnv = new ArrayList<>();
            NhanVien a = new NhanVien();
            KhachHang b = new KhachHang();
           
    

    public String getMaHD() {
                return maHD;
            }
            public void setMaHD(String maHD) {
                this.maHD = maHD;
            }
            public String getNgayLap() {
                return ngayLap;
            }
            public void setNgayLap(String ngayLap) {
                this.ngayLap = ngayLap;
            }
    public void ghiFiledsnv() throws FileNotFoundException, IOException {
                File f = new File("nv.dat");
                FileOutputStream fout = new FileOutputStream(f);
                ObjectOutputStream objout = new ObjectOutputStream(fout);
                objout.writeObject(dsnv);
                objout.close();
                fout.close();
                System.out.println("\nGhi File thanh cong!");
            }
        
            
    public void docFiledsnv() throws FileNotFoundException, IOException, ClassNotFoundException {
            
                File f = new File("nv.dat");
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream objin = new ObjectInputStream(fin);
                dsnv = (ArrayList<NhanVien>) objin.readObject();
                
                a.xuatNV();
                
                objin.close();
                fin.close();
                
                System.out.println("\nDoc file thanh cong!");
            }
    
    public void nhapHD()
        {  Scanner sc = new Scanner(System.in);
           
            
            System.out.println("Nhap ma hoa don: ");
            maHD = sc.nextLine();
            System.out.println("Nhap ngay lap hoa don:(dd/mm/yy) ");
            ngayLap = sc.nextLine();
            System.out.println("NHAP THONG TIN NHAN VIEN: ");
            a.nhapNV();
            dsnv.add(a);

            System.out.println("NHAP THONG TIN KHACH HANG: ");
            b.nhapKH();
            System.out.println("NHAP THONG TIN DS DIEN THOAI: ");
            nhapdsHH();
        }
    public void xuatHD()
        {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------");
            System.out.println("\n======================================= HIEN THI THONG TIN ================================================");
            System.out.println("MA HOA DON: "+ maHD);
            System.out.println("Ngay lap hoa don: "+ ngayLap);
            System.out.println("\n                                        THONG TIN NHAN VIEN ");
            a.xuatNV();
            System.out.println("\n\n                                      THONG TIN KHACH HANG ");
            b.xuatKH();
            System.out.println("\n\n                                      THONG TIN HANG HOA ");
            System.out.print("\n");
            xuatdsHH();
        }
    public void nhapdsHH()
        {    
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Hay nhap so luong dien thoai trong hoa don: "); 
            n = sc1.nextInt();
            DsHH = new ArrayList<HangHoa>();
            
            for(int i = 0; i<n; i++)
                {
                    System.out.printf("==>> Dien thoai thu %2d", i+1);
                    HangHoa hh = new HangHoa();
                    hh.nhapDT();
                    DsHH.add(hh);
                }
        }
        public void tieude2(){
            System.out.printf("%15s","Ma dien thoai");
            System.out.printf("%17s","Ten dien thoai");
            System.out.printf("%17s","Mau dien thoai");
            System.out.printf("%19s","Hang dien thoai");
            System.out.printf("%16s","Nam san xuat");
            System.out.printf("%12s","So luong");
            System.out.printf("%13s","Gia ban");
            System.out.printf("%22s","Thoi gian bao hanh");
        }
    public void xuatdsHH()
        {
            tieude2();
            for(HangHoa hh: DsHH)
                {
                    hh.xuatDT();
                }
            System.out.println("==>> Tong so tien: "+ tongTienHD());
        }
    public float tongTienHD()
        {
            float sum = 0;
            for(HangHoa hh: DsHH)
            {
               sum +=  hh.getGiaBan()* hh.getSoLuongban();
            }
            return sum;


        }
    public void xoaDT()
        {    
            Scanner sc1 = new Scanner(System.in);
            int k; 
            do{
                System.out.println("Hay nhap vi tri can xoa: ");
                k = sc1.nextInt();
              } while(k<= 0 || k > DsHH.size() );
            
            for( int i = 0; i< DsHH.size(); i++)
                {
                    DsHH.remove(k-1);      
                }
            xuatHD();
        }
    public void themDT(){
        HangHoa hh = new HangHoa();
        hh.nhapDT();
        DsHH.add(hh);
        xuatHD();
    }
   
   
    }














    
    