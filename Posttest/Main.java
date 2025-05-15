package Posttest;

class License {
    String nomorLisensi;
    String tanggalBerlaku;

    public License(String nomorLisensi, String tanggalBerlaku) {
        this.nomorLisensi = nomorLisensi;
        this.tanggalBerlaku = tanggalBerlaku;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Lisensi : " + nomorLisensi);
        System.out.println("Tanggal Berlaku Lisensi : " + tanggalBerlaku);
    }
}

class Vehicle {
    public void startEngine() {
        System.out.println("Mesin Nyala");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Motor Nyala");
    }
}

class Driver {
    String name;
    Vehicle vehicle;
    License license;

    public Driver(String name, Vehicle vehicle, String nomorLisensi, String tanggalLisensi) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(nomorLisensi, tanggalLisensi);
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pengemudi: " + name);

        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motor");
        } else {
            System.out.println("Jenis Kendaraan: Tidak Diketahui");
        }

        vehicle.startEngine();
        license.tampilkanInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Rian", new Car(), "12345", "23 Maret 2025");
        Driver driver2 = new Driver("Harahap", new Motorcycle(), "54321", "10 Juli 2026");

        System.out.println("Pengendara 1 & 2");
        driver1.tampilkanInfo();
        System.out.println("----");
        driver2.tampilkanInfo();
    }
}
