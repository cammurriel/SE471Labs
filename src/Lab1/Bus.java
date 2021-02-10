package Lab1;

public class Bus extends Vehicle{

    private int VIN;
    private int PlateNO;

    Bus()
    {
        VIN = 0;
        PlateNO = 0;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getVIN() {
        return VIN;
    }

    public void setPlateNO(int plateNO) {
        PlateNO = plateNO;
    }

    public int getPlateNO() {
        return PlateNO;
    }
}
