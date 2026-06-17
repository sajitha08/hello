


   public class Day6 {

    static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        Car() {
            System.out.println("Car Constructor Called");
        }

        Car(String color, String brand, int speed, int fuel) {
            this.color = color;
            this.brand = brand;
            this.speed = speed;
            this.fuel  = fuel;
        }

        void accelerate() {
            if (fuel > 0) {
                speed += 30;
                fuel -= 15;
            } else {
                System.out.println("Not enough fuel to accelerate!");
            }
        }

        void decelerate() {
            if (speed >= 30) {
                speed -= 30;
            } else {
                speed = 0;
            }
        }

        void refill(int fuelAmount) {
            fuel += fuelAmount;
        }

        void showFuel() {
            System.out.println(" Fuel Level : " + fuel);
        }

        void printDetails() {
            System.out.println(" Color : " + color);
            System.out.println(" Brand : " + brand);
            System.out.println(" Speed : " + speed);
            System.out.println(" Fuel  : " + fuel);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Black", "Thar", 0, 70);

        car.printDetails();



        System.out.println("\nAfter Accelerating:");
        car.accelerate();
        car.printDetails();

        System.out.println("\nAfter Decelerating:");
        car.decelerate();
        car.printDetails();

        System.out.println("\nAfter Refilling:");
        car.refill(20);
        car.showFuel();
    }
}



    




