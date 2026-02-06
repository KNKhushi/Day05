class Animal {
    void Sound() {             // parent method
        System.out.println("hello");
    }
}

class Dog extends Animal {
    Dog() {
        super();               // calls Animal constructor
    }

    void Sound() {             // child method, no @Override
        System.out.println("hi");
    }
}

class code5 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.Sound();            // calls Dog's Sound()
    }
}