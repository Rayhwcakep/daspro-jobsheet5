import java.util.Scanner;

public class pemilihanbilangan25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hasil;

        System.out.print("masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka>0) {
            hasil="bilangan ganjil";
        
        }
        else{
            hasil="bilangan genap";
            
        }
            System.out.println(angka + "adalah" + hasil);

    }
}