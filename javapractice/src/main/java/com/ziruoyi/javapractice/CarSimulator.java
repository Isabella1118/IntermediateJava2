package com.ziruoyi.javapractice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("Launching car simulator ...");

        Car myToyota = new Car("Blue","Wood");

        System.out.println("The car colour is " + Car.colour);

        System.out.println("myToyota has " + myToyota.getNumberOfSeats() + " seats");

        Car myHonda = new Car();
        System.out.println(Car.colour + " Honda with red " + myHonda.getInterior() + " interior");

        myHonda.drive();

        Car.colour = "Pink";
        System.out.println("myHonda's colour is " + Car.colour);
        System.out.println("myToyota's colour is also " + Car.colour);
    }
}
