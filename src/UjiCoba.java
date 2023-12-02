import java.util.Scanner;

public class UjiCoba {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int baris = baca.nextInt();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2*i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= (baris*2-1)-(2*i) ; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
