class Animal{
    void Animal(){
        System.out.println("human,cat,dog");
    }
}
class Dog extends Animal{
    void Bark(){
System.out.println("dog");
    }
}
class Human extends Animal{
    void Speak(){
        System.out.println("human");
    }
}
class code3
{
    public static void main(String[] args) {
        Dog m1=new Dog();
        Human h1=new Human();
        m1.Bark();     
        h1.Speak();
        h1.Animal();
    }
}