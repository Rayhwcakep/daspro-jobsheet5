import java.util.Scanner;

public class siakad26 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);     
 String nama, nim, nilaiHuruf="", kualifikasi="";
 char kelas;
 byte absen;
 double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir;
 System.out.print("Masukan  Nama: ");
 nama = sc.nextLine();
 System.out.print("Masukkan NIM: ");
 nim = sc.nextLine();
 System.out.print("Masukkan Kelas: ");
 kelas = sc.nextLine().charAt(0);
 System.out.print("Masukkan Nomor Absen: ");
 absen = sc.nextByte();
 
 System.out.print("Masukkan nilai kuis: ");
 nilaiKuis = sc.nextDouble();
 System.out.print("Masukkan nilai tugas: ");
 nilaiTugas = sc.nextDouble();
 System.out.print("Masukkan nilai ujian: ");
 nilaiUTS = sc.nextDouble();
 
 nilaiAkhir = ( nilaiKuis + nilaiTugas + nilaiUTS)/3;

 if (nilaiAkhir<=100 && nilaiAkhir <=80) {
    nilaiHuruf = "A";
    kualifikasi = "lebih dari baik";
 }
 else if (nilaiAkhir>73 && nilaiAkhir<=80) {
    nilaiHuruf = "B+";
    kualifikasi = "lebih dari baik";
 }
else if (nilaiAkhir>65 && nilaiAkhir<=73) {
    nilaiHuruf = "B";
    kualifikasi = "Baik";
}
else if (nilaiAkhir>60 && nilaiAkhir<=65) {
    nilaiHuruf = "C+";
    kualifikasi = "Lebih dari baik";
}
else if (nilaiAkhir>50 && nilaiAkhir<=65) {
    nilaiHuruf = "C";
    kualifikasi = "Cukup";
}
else if (nilaiAkhir>39 && nilaiAkhir<=50) {
    nilaiHuruf = "D";
    kualifikasi = "Kurang";
}
else if (nilaiAkhir<=39) {
    nilaiHuruf = "E";
    kualifikasi = "Gagal";
}

 System.out.println(" Nama: " + nama + " NIM: " + nim);
 System.out.println(" kelas: " + nama + " Absen " + absen );
 System.out.println(" Nilai Akhir :" + nilaiAkhir);
 System.out.println("NIlai huruf:" + nilaiHuruf);
 System.out.println("Kualifikasi:" + kualifikasi);   
    }

}