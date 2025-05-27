public class Car {
    private String name;
    private String model;
    private int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Name : " + name + "\nCar model : " + model + "\nYear : " + year);
    }
}
