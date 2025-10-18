package org.example.task2;

public class main {
    public static void main(String[] args) {

        Movable myPoint = new Point(10, 20);

        System.out.println("Початкова позиція: " + myPoint);

        myPoint.moveTo(15.5, -7.3);
        System.out.println("Після moveTo(15.5, -7.3): " + myPoint);

        myPoint.setX(100);
        System.out.println("Після setX(100): " + myPoint);

        double currentX = myPoint.getX();
        double currentY = myPoint.getY();
        System.out.println("Поточні координати: x = " + currentX + ", y = " + currentY);
    }
}