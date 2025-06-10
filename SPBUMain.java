import java.util.Scanner;
public class SPBUMain {
    public static void menu() {
        System.out.println("--- Menu SPBU ---");
        System.out.println("1. Tambah Antrian Kendaraan");
        System.out.println("2. Tampilkan Antrian Kendaraan");
        System.out.println("3. Cek Jumlah Antrian Kendaraan");
        System.out.println("4. Layani Kendaraan");
        System.out.println("5. Tampilkan Riwayat Transaksi");
        System.out.println("0. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            menu();
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan SPBU!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    continue;
            }
        } while (pilih != 0);
    }
}
