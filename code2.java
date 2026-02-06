class Animal {
    void showAnimal() {
        System.out.println("human, cat, dog");
    }
}

class Mammals extends Animal {
    void legs() {
        System.out.println("four");
    }
}

class Human extends Mammals {
    void humanLegs() {
        System.out.println("have two legs");
    }
}

class code2 {
    public static void main(String[] args) {
        Mammals m1 = new Mammals();
        Human h1 = new Human();

        h1.humanLegs();   // Human method
        h1.legs();        // inherited from Mammals
        h1.showAnimal();  // inherited from Animal
    }
}