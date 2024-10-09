import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input 3 bilangan
        System.out.print("Masukkan bilangan pertama (bil1): ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua (bil2): ");
        int bil2 = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga (bil3): ");
        int bil3 = input.nextInt();

        // Mencari bilangan terbesar
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        }

    }
}
