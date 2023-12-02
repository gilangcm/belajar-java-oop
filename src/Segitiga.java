public class Segitiga {
    public static void main(String[] args) {
        int baris = 4;

        for (int i = 0; i < baris; i++){
            for (int j = baris - i; j <= baris; j++){
                for (int k = i ; k<=baris; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // FOR NYA 3 UNTUK SPASI, COBA TES!!!!
    }
}
