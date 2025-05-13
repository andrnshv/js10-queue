package Tugas_P12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue antrian = new Queue();
        int pilih;

        do {
            System.out.println("\nANTRIAN LAYANAN KEMAHASISWAAN");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Lihat Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, kelas);
                    antrian.enqueue(m);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.println(antrian.isEmpty() ? "Antrian masih kosong." : "Antrian tidak kosong.");
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang mengantri: " + antrian.count());
                    break;
                case 8:
                    antrian.displayQueue();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilih != 0);
    }
}
