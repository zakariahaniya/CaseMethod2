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
        AntrianLinkedList antri = new AntrianLinkedList();
        RiwayatQueue riwayat = new RiwayatQueue();
        int pilih;
        do {
            menu();
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    Kendaraan kendaraan = new Kendaraan(plat, tipe, merk);
                    antri.add(kendaraan);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.\n");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("-- Antrian Kendaraan --");
                    System.out.println("Antrian Kendaraan:");
                    antri.print();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antri.getSize());
                    System.out.println("");
                    break;
                case 4:
                    if (antri.isEmpty()) {
                        System.out.println("Antrian kosong.\n");
                    } else if (riwayat.isFull()) {
                        System.out.println("Riwayat transaksi penuh\n");
                    } else {
                        Kendaraan antrian = antri.head.data;
                        System.out.println("Petugas melayani " + antrian.platNomor);
                        System.out.print("Masukkan Jenis BBM: ");
                        String jenisBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per liter: ");
                        int hargaBBM = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan Jumlah liter: ");
                        int jumlahLiter = sc.nextInt();
                        sc.nextLine();
                        BBM bbm = new BBM(jenisBBM, hargaBBM);
                        TransaksiPengisian transaksi = new TransaksiPengisian(antrian, bbm, jumlahLiter);
                        riwayat.enqueue(transaksi);
                        antri.remove();
                        System.out.println(">> Transaksi berhasil dicatat.\n");
                    }
                    break;
                case 5:
                    System.out.println("\n-- Riwayat Transaksi --");
                    System.out.println("Daftar Transaksi:");
                    riwayat.print();
                    System.out.println("");
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
