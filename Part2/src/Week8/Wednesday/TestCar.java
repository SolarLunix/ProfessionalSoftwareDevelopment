package Week8.Wednesday;

/*******
 *   Part2:Week8
 *   File: TestCar
 *   Created by: Melissa Melaugh
 *   Created on: 11/11/2020
 *   Updated on: 11/11/2020
 *   Project Description: A testbed for the Car class
 *******/
public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car sistersCar = new Car(100, "Ford", "My Sister Mary", "Red", 2008, 105, 10995);
        Car bossCar = new Car(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500);
        Car aCar = new Car(102, "Ford", "Janet Allison", "Red");
        Car bCar = new Car(103, "John Smith", 100);

        myCar.printCarInfo();
        sistersCar.printCarInfo();
        bossCar.printCarInfo();
        aCar.printCarInfo();
        bCar.printCarInfo();

        bCar.setMake("Vauxhall");
        bCar.setOwner("James Rodgers");
        bCar.setYear(2012);
        bCar.setCost(10000);

        bCar.printCarInfo();

        Car cCar = new Car();
        cCar.setID(104);
        cCar.setMake("Toyota");
        cCar.setOwner("Robert Smith");
        cCar.setColour("Blue");
        cCar.setYear(2010);
        cCar.setSpeed(120);
        cCar.setCost(12000);

        cCar.printCarInfo();

        System.out.println("cCar age: " + cCar.ageOfCar());
        System.out.println("myCar age: " + myCar.ageOfCar());
        System.out.println("cCar current value: " + cCar.currentValue(10));
        System.out.println("myCar current value: " + myCar.currentValue(10));
        System.out.println("Number of cars: " + myCar.getNoOfCars());
    }
}
