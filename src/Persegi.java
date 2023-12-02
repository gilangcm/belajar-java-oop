import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aksi;
        int baris = 10;

        /*
          while (true){
            System.out.println("masukan jumlah baris: ");
            aksi = input.nextLine();


        }
         */
        for (int i = 0; i < baris;i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }



    }
}
