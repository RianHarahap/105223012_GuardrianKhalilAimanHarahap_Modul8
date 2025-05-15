package Latihan;

class HealthRecord {
    String nomorRekam;
    String tanggalPembuatan;

    public HealthRecord(String nomorRekam, String tanggalPembuatan) {
        this.nomorRekam = nomorRekam;
        this.tanggalPembuatan = tanggalPembuatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekam Medis: " + nomorRekam);
        System.out.println("Tanggal Pembuatan: " + tanggalPembuatan);
    }
}

class Animal {
    HealthRecord rekam;
    String jenis;

    public Animal(String nomorRekam, String jenis, String tanggalPembuatan) {
        this.rekam = new HealthRecord(nomorRekam, tanggalPembuatan);
        this.jenis = jenis;
    }

    public void makeSound() {
        System.out.println("Suara tidak diketahui");
    }
}

class Dog extends Animal {
    public Dog(String nomorRekam, String tanggalPembuatan) {
        super(nomorRekam, "Anjing", tanggalPembuatan);
    }

    public void makeSound() {
        System.out.println("Guk-Guk!");
    }
}

class Cat extends Animal {
    public Cat(String nomorRekam, String tanggalPembuatan) {
        super(nomorRekam, "Kucing", tanggalPembuatan);
    }

    public void makeSound() {
        System.out.println("Meong!");
    }
}

class Owner {
    String nama;
    Animal peliharaan;

    public Owner(String nama, Animal peliharaan) {
        this.nama = nama;
        this.peliharaan = peliharaan;
    }

    void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + nama);
        peliharaan.makeSound();
    
        if (peliharaan instanceof Dog) {
            System.out.println("Jenis Hewan: Anjing");
        } else if (peliharaan instanceof Cat) {
            System.out.println("Jenis Hewan: Kucing");
        }
    
        peliharaan.rekam.tampilkanInfo();
    }
    
}

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Rian", new Dog("123", "23 Maret 2025"));
        Owner owner2 = new Owner("Harahap", new Cat("321", "10 Juli 2026"));

        System.out.println("Pemilik 1 & 2");
        owner1.tampilkanInfo();
        System.out.println("----");
        owner2.tampilkanInfo();
    }
}
