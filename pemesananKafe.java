import java.util.Scanner;

public class pemesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); // Membersihkan newline dari input sebelumnya

        // Membuat array untuk menyimpan nama dan harga pesanan
        String[] namaPesanan = new String[jumlahPesanan]; 
        double[] hargaPesanan = new double[jumlahPesanan];

        // Mengumpulkan data pesanan dari pengguna
        System.out.println("\n=== Masukkan Detail Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("Pesanan ke-%d:\n", (i + 1)); // Menampilkan nomor pesanan
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine(); // Menyimpan nama pesanan

            System.out.print("Harga (dalam Rp): ");
            hargaPesanan[i] = sc.nextDouble(); // Menyimpan harga pesanan
            sc.nextLine(); // Membersihkan newline setelah input harga
            System.out.println(); // Menambahkan baris kosong untuk pemisah
        }

        // Menghitung total biaya dari semua pesanan
        double totalBiaya = 0; 
        for (double harga : hargaPesanan) {
            totalBiaya += harga; // Menjumlahkan harga dari setiap pesanan
        }

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("\n=== Daftar Pesanan ===");
        System.out.printf("%-30s %-10s%n", "Nama Pesanan", "Harga");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-30s Rp %.2f%n", namaPesanan[i], hargaPesanan[i]);
        }

        // Menampilkan total biaya
        System.out.println("-------------------------------------");
        System.out.printf("%-30s Rp %.2f%n", "Total Biaya", totalBiaya);

    }
}
