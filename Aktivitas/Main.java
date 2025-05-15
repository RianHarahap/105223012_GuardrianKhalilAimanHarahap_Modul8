class animal {

}

class mammal extends animal {

}

class reptile extends animal {

}

class dog extends mammal {

}

public class Main {
    public static void main(String[] args) {
        animal hewan = new animal();
        mammal mammal2 = new mammal();
        reptile reptile2 = new reptile();
        dog anjing = new dog();

        System.out.println(mammal2 instanceof animal);
        System.out.println(anjing instanceof animal);
        System.out.println(anjing instanceof mammal);
        // System.out.println(anjing instanceof reptile); //error karena dog tidak memiliki hubungan sama reptile

        // animal hewan2 = new mammal();
        animal hewan2 = new dog();
        // dog anjing2 = (dog) hewan2;

        if (hewan2 instanceof dog){
           dog anjing2 = (dog) hewan2;
           System.out.println("Objek berhasil dibuat"); 
        }else{
            System.out.println("Gagal");
        }
    }

   

}