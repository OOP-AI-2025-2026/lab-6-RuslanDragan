package org.example.task3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Smartphone myPhone = new Smartphone("iPhone 17 Pro", 46.4825, 30.7233);

        System.out.println("--------------------");
        myPhone.printLocation();
        System.out.println("--------------------");

        System.out.println("Тестування модуля зв'язку:");
        myPhone.makeCall();
        myPhone.receiveCall();
        System.out.println();

        System.out.println("Тестування GPS-модуля:");
        double[] currentCoordinates = myPhone.getCoordinates();
        System.out.println("Координати, отримані через getCoordinates(): " + Arrays.toString(currentCoordinates));
    }
}