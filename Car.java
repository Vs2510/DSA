public class Car {
    private String model;
    private int year;

    public Car(String model) {
        this(model, 0); // Calls the second constructor with 'year' as 0
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

