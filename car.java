public class car extends vehical{


    void start(){
        System.out.println("********************");
        super.start();
        System.out.println(this.model);
        System.out.println("car is started"+ this.color);
    }
    car(){
       super( 2);
       System.out.println(wheels = 5);
       System.out.println("*******************");
       System.out.println("car constructor");
    }
    public static void main(String[] args) {
        car c = new car();
        c.wheels = 4;
        c.model = "seden";
        c.color= "red";
        c.price = 50000;
        c.start();
        System.out.println("*******************");
        System.out.println(c.wheels);
        System.out.println(c.model);
        System.out.println(c.color);
        System.out.println(c.price);
    }
    
}