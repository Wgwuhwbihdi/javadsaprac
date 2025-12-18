public class vehical {
    int wheels;
    String model;
    String color;
    int price;
    final int gear = 5;
    vehical() {
        System.out.println("vehical constructor");
    }
    vehical(int wheels)
    {
        this.wheels = wheels;
        System.out.println("vehical with wheels "+wheels);
    }
    void start() {
        System.out.println("vehical is started");
        System.out.println("model: " + model
                + " color: " + color + " price: " + price);
    }

    public static void main(String[] args) {
         vehical v = new vehical();
         System.out.println(v.gear);
    }
    final void accelerate() {
        System.out.println("vehical is accelerating");
    }
}