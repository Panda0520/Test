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

    public class DSHoaDon  implements Serializable {
        ArrayList<HoaDon> dsHD = new ArrayList<>();
       
        
        int n;
        int b;
    
    public void nhapDSHD()
        {
           
        Scanner sc1 = new Scanner(System.in);
            do{
                System.out.println("Hay nhap so hoa don: ");
                n = sc1.nextInt();
            }while(n<= 0);
            dsHD = new ArrayList<HoaDon>();
            for( int i = 0;  i<n; i++)
                {
                    HoaDon hd = new HoaDon();
                   
                    hd.nhapHD();
                    dsHD.add(hd);
                
                }
        }
    public void xuatDSHD(){
        
        
        for(HoaDon hd: dsHD){
            
            hd.xuatHD();
           
            
        }}
    public void ThemXoa(){
        Scanner sc1 = new Scanner(System.in);
        
        int c;
        int d;
                do {
                    System.out.println("-> Hay nhap hoa don muon chinh sua: ");
                     c = sc1.nextInt();} while(c<=0 || c > dsHD.size() );
                    
                    do{
                        System.out.println("1. Them dien thoai ");
                        System.out.println("2. Xoa dien thoai ");
                        System.out.println("3. Exit ");
                        System.out.println("=>> Hay nhap lua chon:");
                        d = sc1.nextInt();
                            switch (d) {
                                case 1:
                                    dsHD.get(c-1).themDT();
                                    break;
                                case 2:
                                    dsHD.get(c-1).xoaDT();
                                    break;
                    
                                case 3:
                                    break;
                            }
                        } while(d!= 3);
    }
    public void inHDtheoMaHD(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Hay nhap ma Hoa Don: ");
        String a = sc.nextLine();
        int flag = 1;
        System.out.println("Hoa don duoc tim thay:");
        for( HoaDon hd : dsHD){
            if(a.equals(hd.getMaHD())){
                hd.xuatHD();
                flag = 0;}
        }
        if(flag == 1){
            System.out.println("Khong tim thay!");
        }
    }
 
   public void tongTienCacHD(){
    float sum = 0; 
   
    for( HoaDon hd: dsHD){
        sum += hd.tongTienHD();
    }
    System.out.println(" Tong tien cac hoa don la: "+ sum );

   }
    

    public void ghiFileDSHD() throws FileNotFoundException, IOException {
        File f = new File("dshd.dat");
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(dsHD);
		objout.close();
		fout.close();
		System.out.println("\nGhi File thanh cong!");
	}

	
    public void docFileDSHD() throws FileNotFoundException, IOException, ClassNotFoundException {
	
		File f = new File("dshd.dat");
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream objin = new ObjectInputStream(fin);
		dsHD = (ArrayList<HoaDon>) objin.readObject();
        for (HoaDon hoadon : dsHD) {
			hoadon.xuatHD();
		}
		objin.close();
		fin.close();
		
		System.out.println("\nDoc file thanh cong!");
	}
    public void hoadonMin() {
        HoaDon hd1 = dsHD.get(0);
        float tmp2 = hd1.tongTienHD();
        for (int i = 1; i < dsHD.size(); i++) {
            float tmp1 = dsHD.get(i).tongTienHD();
                if (tmp1 < tmp2) {
                    hd1 = dsHD.get(i);
                }
            }
        hd1.xuatHD();
        }


        public void hoadonMax() {
        HoaDon hd1 = dsHD.get(0);
        float tmp2 = hd1.tongTienHD();
        for (int i = 1; i < dsHD.size(); i++) {
            float tmp1 = dsHD.get(i).tongTienHD();
                if (tmp1 > tmp2) {
                    hd1 = dsHD.get(i);
                }
            }
        hd1.xuatHD();
        }

   
       

    }
   
   

    
    
     







































































































    
     /*   public void HDMax(){
        HoaDon max = dsHD.get(0);
        for(int i = 1; i< dsHD.size(); i ++){
            if(dsHD.get(i).tongTienHD() >= max.tongTienHD()){
                max = dsHD.get(i);
            }
        }
        System.out.println("\nHoa don max: ");
        max.xuatHD();
    }*/
   

      /*  public void inHDtheoTen(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Hay nhap Ten Khach hang: ");
        String a = sc.nextLine();
        int flag = 1;
        System.out.println("Hoa don duoc tim thay:");
        for( HoaDon hd : dsHD){
            if(a.equals(hd.b.getHoTen())){
                hd.xuatHD();
                flag = 0;}
        }
        if(flag == 1){
            System.out.println("Khong tim thay!");
        }
    }*/
    /*     public void themHD(){
        HoaDon hd = new HoaDon();
        hd.nhapHD();
        dsHD.add(hd);
        System.out.println(" Da them vao danh sach: ");
        xuatDSHD();
    }
    public void xoaHD(){
        
        Scanner sc1 = new Scanner(System.in);
       
            int k; 
            do{
                System.out.println("Hay nhap vi tri can xoa: ");
                k = sc1.nextInt();
              } while(k<= 0 || k> dsHD.size() );
            
            for( int i = 0; i< dsHD.size(); i++)
                {
                    dsHD.remove(k-1);      
                }
            xuatDSHD();
        
        
    }*/
   /*  public void ghinv() throws FileNotFoundException, IOException{
        for(HoaDon hd: dsHD){
            hd.ghiFiledsnv();
        }
    }
    public void docnv() throws FileNotFoundException, IOException, ClassNotFoundException{
        for(HoaDon hd: dsHD){
            hd.docFiledsnv();
        }
    }*/
    //public void sapxeptenKhachtheothutu() {
//        KhachHang a = new KhachHang();
//        String[] hoTenArray = new String[dsHD.size()];
//        for (int i = 0; i < dsHD.size(); i++) {
//            hoTenArray[i] = dsHD.get(i).a.getHoTen();
//
//        }
//        Arrays.sort(hoTenArray);
//        for (String hoTen : hoTenArray) {
//            for (HoaDon hd : dsHD) {
//                if (hd.a.getHoTen().equals(hoTen)) {
//                    hd.xuatHD();
//                    break;
//                }
//            }
//        }
//    }
/*public void SxtienHDMax(){
    for(int i=0;i<dsHD.size()-1;i++){
        for(int j=i+1;j<dsHD.size();j++){
            HoaDon hd1 = dsHD.get(i);
            HoaDon hd2 = dsHD.get(j);
            if(hd1.tongTienHD() < hd2.tongTienHD()){
                dsHD.set(i, hd2);
                dsHD.set(j, hd1);
            }
        }
    }
    xuatDSHD();
    }
public void SxtienHDMin(){
        for(int i=0;i<dsHD.size()-1;i++){
            for(int j=i+1;j<dsHD.size();j++){
                HoaDon hd1 = dsHD.get(i);
                HoaDon hd2 = dsHD.get(j);
                if(hd1.tongTienHD() > hd2.tongTienHD()){
                    dsHD.set(i, hd2);
                    dsHD.set(j, hd1);
                }
            }
        }
        xuatDSHD();
        }*/
        //    public void sapxeptheoMaHD() {
//        String[] maHDArray = new String[dsHD.size()];
//        for (int i = 0; i < dsHD.size(); i++) {
//            maHDArray[i] = dsHD.get(i).getMaHD();
//
//        }
//        Arrays.sort(maHDArray);
//        for (String hoTen : maHDArray) {
//            for (HoaDon hd : dsHD) {
//                if (hd.getMaHD().equals(hd.getMaHD())) {
//                    hd.xuatHD();
//                    break;
//                }
//            }
//        }
//    }