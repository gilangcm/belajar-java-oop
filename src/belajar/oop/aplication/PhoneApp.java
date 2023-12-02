package belajar.oop.aplication;

import belajar.oop.basic.interfac3.Nokia;
import belajar.oop.basic.interfac3.Phone;
import belajar.oop.basic.interfac3.PhoneUser;

import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) {
        //membuat objek HP
        Phone xiaomiNote5 = new Nokia();

        //membuat objek User
        PhoneUser gils = new PhoneUser(xiaomiNote5);

        //kita coba nyalakan HP-nya
        gils.turnOnThePhone();

        //biar enak kita buat dalam program

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true){
            System.out.println("===APLIKASI INTERFACE");
            System.out.println("[1] NYALAKAN HP");
            System.out.println("[2] MATIKAN HP");
            System.out.println("[3] PERBESAR VOLUME");
            System.out.println("[4] KECILKAN VOLUME");
            System.out.println("[0] KELUAR");
            System.out.println("---------------------");
            System.out.println("Pilih Aksi>");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")){
                gils.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                gils.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                gils.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                gils.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            }else {
                System.out.println("Kamu memilih pilihan yang salah");

            }
        }

    }
}
