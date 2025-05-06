import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Layanan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah yang Sudah Melakukan Proses KRS");
            System.out.println("8. Cetak Jumlah Mahasiswa yang Belum Melakukan Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
                        break;
                    }
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    KRS mhs = new KRS(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + antrian.getJumlahDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + antrian.getSisaKuotaDPA());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
