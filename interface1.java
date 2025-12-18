public class interface1 {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.eat();
        m1.sing();
    }
}
interface pet{
    void sing();
}
interface Animal{
    void eat();
}
class Monkey implements Animal,pet{
    public void eat(){
        System.out.println("Monekey is eating");
    }
    public void sing(){
System.out.println("Moneky is singing");
    }
}
