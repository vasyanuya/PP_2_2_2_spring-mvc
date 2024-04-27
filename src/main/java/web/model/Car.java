package web.model;


public class Car {

    private int id;

    private String model;

    private int mileage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }


    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Car() {}

    public Car(int id, String model, int mileage) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
