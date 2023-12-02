package game_anak;

import java.util.Scanner;

public class RulesGame implements Game {
    Scanner input = new Scanner(System.in);

    @Override
    public void penjumlahan() {
        System.out.println("Masukan Angka Ke-1");
        int x = input.nextInt();
        System.out.println("Masukan Angka Ke-2");
        int y = input.nextInt();
        System.out.println("Hasilnya adalah "+(x+y));
    }

    @Override
    public void pengurangan() {
        System.out.println("Masukan Angka Ke-1");
        int x = input.nextInt();
        System.out.println("Masukan Angka Ke-2");
        int y = input.nextInt();
        System.out.println("Hasilnya adalah "+(x-y));

    }

    @Override
    public void perkalian() {
        System.out.println("Masukan Angka Ke-1");
        int x = input.nextInt();
        System.out.println("Masukan Angka Ke-2");
        int y = input.nextInt();
        System.out.println("Hasilnya adalah "+(x*y));

    }

    @Override
    public void pembagian() {
        System.out.println("Masukan Angka Ke-1");
        int x = input.nextInt();
        System.out.println("Masukan Angka Ke-2");
        int y = input.nextInt();
        System.out.println("Hasilnya adalah "+(x/y));

    }

    @Override
    public void belahKetupat() {
        System.out.print("Masukkan angka: ");
        int baris = input.nextInt();
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

    @Override
    public void segitiga() {
        System.out.println("Masukkan Jumlah Baris");
        int baris = input.nextInt();
        for (int i = 0; i < baris; i++){
            for (int j = baris - i; j <= baris; j++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }

    }

    @Override
    public void persegi() {
        System.out.println("Masukkan Jumlah Baris");
        int baris = input.nextInt();
        for (int i = 0; i < baris;i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }

    }

    @Override
    public void keluar() {
        System.exit(0);

    }



}
