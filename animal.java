public class animal {

    public static void main(String[] args) {
        car c1 = new car();
        c1.accelarate();
    }
}

abstract class Vehical {
    abstract void accelarate();

    abstract void breaks();

    abstract int wheels(int wheels);

}

class car extends Vehical {
    @Override
    void accelarate() {
        System.out.println("car is accelarating");
    }

    @Override
    void breaks() {
        System.out.println("the car is breaking");
    }

    @Override
    int wheels(int wheels) {
        System.out.println("wheels returing" + wheels);
        return wheels;
    }

}
