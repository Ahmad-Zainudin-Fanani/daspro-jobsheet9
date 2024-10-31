import java.util.*;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countLulus = 0; // Penghitung mahasiswa lulus
        int countTidakLulus = 0; // Penghitung mahasiswa tidak lulus

        // Mengumpulkan nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total nilai dan jumlah mahasiswa lulus/tidak lulus
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        // Menghitung rata-rata nilai
        double rata2Lulus = countLulus > 0 ? totalLulus / countLulus : 0;
        double rata2TidakLulus = countTidakLulus > 0 ? totalTidakLulus / countTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
