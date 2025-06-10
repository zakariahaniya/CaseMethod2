import java.util.Scanner;

public class SPBUMain {
  //Khesa
    static AntrianLinkedList antrian = new AntrianLinkedList(); 
//
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
            sc.nextLine();

            switch (pilih) {
                case 1://Khesa//
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = sc.nextLine();

                    Kendaraan kendaraan = new Kendaraan(plat, tipe, merk);
                    antrian.enqueue(kendaraan);
                    break;
                case 2://Khesa//
                    antrian.displayAntrian();
                    break;
                case 3://Khesa//
                    System.out.println("Jumlah Antrian Kendaraan: " + antrian.size());
                    break;
                case 4:
                    //(dequeue)
                    break;
                case 5:
                    // menampilkan riwayat transaksi
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan SPBU!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    continue;
            }
        } while (pilih != 0);

        sc.close();
    }
}
