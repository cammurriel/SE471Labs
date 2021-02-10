package Lab1;

public class Vehicle {
    private  String model;
    private String maker;
    private int year;


    Vehicle()
    {
        model = "";
        maker = "";
        year = 0;

    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
