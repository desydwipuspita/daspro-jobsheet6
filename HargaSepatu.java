import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data merek, kategori, dan ukuran sepatu
        System.out.print("Masukkan merek sepatu (Converse/Skecher/Nike): ");
        String merek = input.nextLine().toLowerCase();
        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = input.nextLine().toLowerCase();
        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = input.nextInt();

        // Variabel untuk menyimpan harga
        int harga = 0;

        // Logika berdasarkan flowchart
        if (merek.equals("converse")) {
            if (kategori.equals("slip on") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 800000;
            } else if (kategori.equals("high top") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1200000;
            }
        } else if (merek.equals("skecher")) {
            if (kategori.equals("woman") && (ukuran >= 36 && ukuran <= 41)) {
                harga = 1000000;
            } else if (kategori.equals("man") && (ukuran >= 41 && ukuran <= 44)) {
                harga = 1800000;
            }
        } else if (merek.equals("nike")) {
            if (kategori.equals("kids") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 750000;
            } else if (kategori.equals("adult") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
            }
        } else {
            System.out.println("Merek tidak ada.");
        }

        // Output harga sepatu
        if (harga > 0) {
            System.out.println("Harga sepatu adalah: Rp " + harga);
        }

    }
}
