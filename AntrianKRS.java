public class AntrianKRS {
    private KRS[] data;
    private int front;
    private int rear;
    private int size;
    private int max;
    private int totalDilayani;

    public AntrianKRS(int max) {
        this.max = max;
        data = new KRS[max];
        this.front = 0;
        this.rear = -1;
        size = 0;
        totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        totalDilayani = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(KRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak dapat memproses KRS.");
            return;
        }
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            KRS mhs = data[front];
            System.out.print((i + 1) + ". ");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa terakhir dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDilayani() {
        return totalDilayani;
    }

    public int getSisaKuotaDPA() {
        return 30 - totalDilayani;
    }
}
