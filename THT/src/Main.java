class Player {
    String name;
    int hp = 100;
    String[] inventory = new String[5];
    int index = 0;

    void addItem(String item) {
        if (index < inventory.length) {
            inventory[index] = item;
            index++;
        } else {
            System.out.println("Inventory penuh");
        }
    }

    void showInventory() {
        System.out.println("Isi tas:");
        for (int i = 0; i < index; i++) {
            System.out.println("- " + inventory[i]);
        }
        System.out.println("HP: " + hp);
    }
}

class Magician extends Player {
    void special() {
        System.out.println("FIRE BALL !!!.");
    }
}

class Fighter extends Player {
    void special() {
        System.out.println("DOUBLE SLASHH ::.");
    }
}

public class Main {
    public static void main(String[] args) {
        Magician player = new Magician();
        player.name = "UncleFan";
        player.addItem("Universe III");
         player.addItem("Health Potion");
          player.addItem("100.000 Spina");
           player.addItem("Herb");
        player.showInventory();
        player.special();

       
    }
}
