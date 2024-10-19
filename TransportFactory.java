public abstract class TransportFactory {

    public abstract Transport createTransport();
}
class CarFactory {
    public CarFactory(){}
    public Transport createTransport() {
        return new Car();
    }
}
class MotorcycleFactory{
    public Transport createTransport() {
        return new Motorcycle();
    }
}class PlaneFactory{
    public Transport createTransport() {
        return new Plane();
    }
}

class TransportTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();
        MotorcycleFactory motorcycle = new MotorcycleFactory();

        carFactory.createTransport();
        System.out.println("sozdan car");
        planeFactory.createTransport();
        System.out.println("sozdan plane");
        motorcycle.createTransport();
        System.out.println("sozdan motorcycle");

    }
}
