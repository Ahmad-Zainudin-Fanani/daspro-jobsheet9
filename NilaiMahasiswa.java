import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt(); // Menyimpan jumlah mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa]; // Array untuk menyimpan nilai mahasiswa

        // Mengumpulkan nilai mahasiswa satu per satu
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt(); // Menyimpan nilai ke dalam array
        }

        // Inisialisasi variabel untuk menghitung total nilai
        double total = 0;
        int nilaiTertinggi = nilaiMahasiswa[0]; // Asumsi nilai pertama adalah yang tertinggi
        int nilaiTerendah = nilaiMahasiswa[0]; // Asumsi nilai pertama adalah yang terendah

        // Menghitung total nilai, nilai tertinggi, dan nilai terendah
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMahasiswa[i]; // Menambahkan nilai ke total
            
            // Memeriksa apakah nilai saat ini lebih tinggi dari nilai tertinggi yang ditemukan
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i]; // Update nilai tertinggi
            }
            // Memeriksa apakah nilai saat ini lebih rendah dari nilai terendah yang ditemukan
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i]; // Update nilai terendah
            }
        }

        // Menghitung rata-rata nilai
        double rataRata = total / jumlahMahasiswa;

        // Menampilkan semua nilai yang telah dimasukkan
        System.out.println("\nNilai yang telah dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }

        // Menampilkan hasil akhir
        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

    }
}
