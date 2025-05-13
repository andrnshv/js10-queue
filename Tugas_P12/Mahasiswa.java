package Tugas_P12;

public class Mahasiswa {
    String nim, nama, kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " - " + kelas);
    }
}

