import java.util.Scanner;

public class DiskonBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis buku dan jumlah buku
        System.out.print("Masukkan jenis buku (komik/novel/kamus): ");
        String jenisBuku = input.nextLine().toLowerCase(); // Mengubah input menjadi lowercase
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();

        double diskon = 0.0;

        // Kondisi diskon berdasarkan jenis buku dan jumlah buku
        if (jenisBuku.equals("kamus") && jumlahBuku >= 3) {
            diskon = 12;
        } else if (jenisBuku.equals("kamus") && jumlahBuku <= 2) {
            diskon = 10;
        } else if (jenisBuku.equals("novel") && jumlahBuku > 3) {
            diskon = 9;
        } else if (jenisBuku.equals("novel") && jumlahBuku <= 3) {
            diskon = 8;
        } else if (jenisBuku.equals("komik") && jumlahBuku >= 3) {
            diskon = 5;
        } else {
            diskon = 0;
        }

        // Menghitung total harga setelah diskon
        System.out.print("Masukkan total harga buku: ");
        double totalHarga = input.nextDouble();
        double totalDiskon = (diskon / 100) * totalHarga;
        double totalBayar = totalHarga - totalDiskon;

        // Output jumlah diskon dan total yang harus dibayar
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Total diskon: Rp " + totalDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

    }
}
