package ua.opnu.list;

public class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {

        Car otherCar = (Car) o;


        int priceComparison = otherCar.getPrice() - this.getPrice();
        if (priceComparison != 0) {
            return priceComparison;
        }


        int yearComparison = this.getYear() - otherCar.getYear();
        if (yearComparison != 0) {
            return yearComparison;
        }


        return this.getHorsePower() - otherCar.getHorsePower();
    }


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}