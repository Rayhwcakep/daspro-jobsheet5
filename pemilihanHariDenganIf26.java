import java.util.Scanner;

public class pemilihanHariDenganIf26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        if (angka >= 1&& angka <= 5) {
            System.out.println("weekday");
        } else if (angka >= 6 && angka <= 7) {
            System.out.println("weekend");
        } else {
            System.out.println("invalid number");
        }
    }
}