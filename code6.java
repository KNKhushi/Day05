
class Animal{
   void run(){
            System.out.println("hello");
        }
    }

    class Dog extends Animal{
      void Sound(){
      super.run();
            System.out.println("hi");
        }
    }
 class code6 {
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.Sound();
    }
 }