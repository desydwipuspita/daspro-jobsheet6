import java.util.Scanner;
public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        int menu03;
        String member, pembayaran;
        double diskon = 0, harga = 0, totalBayar;

        System.out.println("----------------------------------");
        System.out.println("========== MENU KAFE JTI =========");
        System.out.println("----------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        menu03 = input03.nextInt();
        input03.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input03.nextLine();
        System.out.println("Pilih metode pembayaran (cash/qris) = ");
        pembayaran = input03.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu03 == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (menu03 == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
        }else if (member.equalsIgnoreCase("n")) {
            if (menu03 == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (menu03 == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu03 == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }

        if (pembayaran.equalsIgnoreCase("qris")) {
            double diskonQRIS = 1000;
            diskon += diskonQRIS;
            System.out.println("Besar diskon QRIS = " + diskonQRIS);
        } else if (pembayaran.equalsIgnoreCase("cash")) {
            System.out.println("Input metode pembayaran tidak valid");
        }

        totalBayar = harga - diskon;
        if (totalBayar < 0) {
            totalBayar = 0;
        }
        System.out.println("------------------------------");
        System.out.println("Total Bayar = " + totalBayar);
        System.out.println("------------------------------");

    }
}