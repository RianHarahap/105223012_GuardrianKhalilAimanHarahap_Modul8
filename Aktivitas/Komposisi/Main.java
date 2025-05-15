package Komposisi;

class Kamar{
    String tipe;

    public Kamar(String tipe) {
        this.tipe = tipe;
    }

    void info(){
        System.out.println("Tipe Kamar : " + this.tipe);
    }
}

class Rumah{
    private Kamar kamar;

    Rumah(){
        kamar = new Kamar("Mandi");
    }

    void lihatKamar(){
        kamar.info();
    }
}

public class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah();
        rumah.lihatKamar();
    }
}