package Pertemuan12;

public class SLLMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhs1 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa06 mhs2 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        Mahasiswa06 mhs3 = new Mahasiswa06("22212202", "Cintia", "3C", 3.5);
        Mahasiswa06 mhs4 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);

    SingleLinkedList06 sll = new SingleLinkedList06();
        sll.addFirst(mhs1);
        sll.addFirst(mhs2);
        sll.addFirst(mhs3);
        sll.addFirst(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        /*
        modifikasi sesuai pertanyaan 2.1 nomor 3
        Scanner sc = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            sll.addFirst(mhs);
        }

        sll.print(); */
    }
}
