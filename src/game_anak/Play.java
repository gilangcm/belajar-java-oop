package game_anak;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("START");
        System.out.println("Games untuk Anak-Anak");
        System.out.println("===Aplikasi Interface===");
        System.out.println("[1] Mari Berhitung");
        System.out.println("[2] Belajar Bentuk ");
        int aksi = input.nextInt();
        if (aksi == 1) {
            Game_Hitung();
        }else if (aksi == 2) {
            Pilih_Bentuk();
        }else {
            System.out.println("Salah input 1 , Silahkan Masukan Kembali");
            System.exit(0);
        }
    }
    public static void Game_Hitung() {
        Game game = new RulesGame();
        GameUser anak = new GameUser(game);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===Belajar Hitung===");
            System.out.println("[1] Penjumlahan");
            System.out.println("[2] Pengurangan");
            System.out.println("[3] Perkalian");
            System.out.println("[4] Pembagian");
            System.out.println("[0] Keluar");

            int aksi = input.nextInt();

            if (aksi == 1) {
                anak.GamePenjumlahan();
            } else if (aksi == 2) {
                anak.GamePengurangan();
            } else if (aksi == 3) {
                anak.GamePerkalian();
            } else if (aksi == 4) {
                anak.GamePembagian();
            }else if (aksi == 0 ) {
                anak.GameKeluar();
            }else {
                System.out.println("Salah input ! , Silahkan Masukan Kembali");
            }
        }

    }
    public static void Pilih_Bentuk() {
        Game game = new RulesGame();

        GameUser Bocil = new GameUser(game);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===Belajar Bentuk===");
            System.out.println("[1] Belah Ketupat");
            System.out.println("[2] Segitiga");
            System.out.println("[3] Persegi");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Bentuk: ");
            int aksi = input.nextInt();

            if (aksi == 1) {
                Bocil.GameBelahKetupat();
            } else if (aksi == 2) {
                Bocil.GameSegitiga();
            } else if (aksi == 3) {
                Bocil.GamePersegi();
            } else if (aksi == 0) {
                Bocil.GameKeluar();
            }else {
                System.out.println("Salah input ! , Silahkan Masukan Kembali");
            }
        }
    }
    }

