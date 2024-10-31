import java.util.Scanner;

public class menuPencarianKafe {
    public static void main(String[] args) {
        // Daftar menu makanan yang tersedia di kafe
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        // Membuat Scanner untuk mengambil input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        // Menggunakan linear search untuk mencari makanan dalam menu
        boolean ditemukan = false; // Variabel untuk menandai apakah makanan ditemukan
        
        // Menggunakan perulangan for dengan indeks untuk lebih jelas
        for (int i = 0; i < menu.length; i++) {
            // Memeriksa apakah makanan pada indeks i cocok dengan makanan yang dicari
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true; // Set ditemukan menjadi true
                break; // Keluar dari loop karena makanan telah ditemukan
            }
        }

        // Menampilkan hasil pencarian kepada pengguna
        System.out.println("\n=== Hasil Pencarian ===");
        if (ditemukan) {
            System.out.println("Makanan \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + makananDicari + "\" tidak ada di menu.");
        }

    }
}
