package com.company;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("GTR");
        Car anotherCar = new Car("WRX");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();

        anotherCar.brake();
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public void accelerate() {
        speed++;
        showSpeed();
    }

    public void brake() {
        speed--;
        showSpeed();
    }

    private void showSpeed() { // Private is used because showSpeed is used in the Car class
        System.out.printf("%s is going %d MPH %n",name, speed);
    }
}


