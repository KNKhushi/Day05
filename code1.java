class Animal{
    void Sound(){
        System.out.println("ba");
    }
}
class Dog extends Animal{
    void Bark(){
System.out.println("dog");
    }
}
class code1{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.Bark();
        dg.Sound();
    }
}