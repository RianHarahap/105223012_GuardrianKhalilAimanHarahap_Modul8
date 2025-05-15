


class engine {
    void start(){
        System.out.println("Mesin Menyala");
    }
}

class car{
    engine mesin = new engine();

    void drive(){
        mesin.start();
        System.out.println("Mobil jalan");
    }
}


public class Main2 {
    public static void main(String[] args) {
        car mobil = new car();
        mobil.drive();
    }
}
