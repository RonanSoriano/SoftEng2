
public class CarTest {

    public static void main (String[] args){
        

        Car myCar = new Car.CarBuilder()
        .color("Light Gray")
        .transmission("Manual")
        .engineType("Diesel")
        .capacity(6)
        .brand("Toyota")
        .build();

        System.out.println("\n====== Car Information ======\n");
        System.out.println("Color: " + myCar.color);
        System.out.println("Tranmission: " + myCar.transmission);
        System.out.println("Engine Type: " + myCar.engineType);
        System.out.println("Passenger Capacity: " + myCar.capacity);
        System.out.println("Brand Name: " + myCar.brand);
    }

}