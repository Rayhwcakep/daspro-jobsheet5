import java.util.Scanner;
public class latihanIndividu4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;
        System.out.print("Masukkan usia anda: ");
        usia = input.nextInt();

        if (usia>65) {
            System.out.print("Lansia");
         }
         else if (usia<=64 && usia>19) {
            System.out.print("Dewasa");
         }
        else if (usia<=19 && usia>12) {
            System.out.print("Remaja");

        }
            else if (usia<=12 && usia>0) {
                System.out.print("Anak");
            }
        }        
}