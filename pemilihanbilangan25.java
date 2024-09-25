import java.util.Scanner;

public class pemilihanbilangan25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 00)
        {
            System.out.println("angka" + angka + "termasuk bilangan gelap");
        
        }
        else
        {
            System.out.println("angka" + angka + "termasuk bilangan ganjil");

        }
    }
}