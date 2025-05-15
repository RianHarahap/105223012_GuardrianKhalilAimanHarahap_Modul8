package Agregasi;

import java.util.ArrayList;

class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }
}

class Universitas {
    String namaUniv;
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();

    Universitas(String namaUniv) {
        this.namaUniv = namaUniv;
    }

    void tambahMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa.add(mahasiswa);
    }

    void tampilkanSemuaMahasiswa() {
        for (Mahasiswa mahasiswa : this.mahasiswa) {
            System.out.println(mahasiswa.nama);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Harahap");
        Mahasiswa mhs2 = new Mahasiswa("Rian");

        Universitas uper = new Universitas("Univ Pertamina");
        uper.tambahMahasiswa(mhs1);
        uper.tambahMahasiswa(mhs2);
        uper.tampilkanSemuaMahasiswa();
    }
}