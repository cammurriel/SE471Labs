package Lab1;

public class Schedule {
    private double start_time;
    private double end_time;

    Schedule()
    {
        start_time = 0.00;
        end_time = 0.00;
    }

    Schedule(double start, double end)
    {
        this.start_time = start;
        this.end_time = end;
    }
    public double getStart_time() {
        return start_time;
    }

    public void setStart_time(double start_time) {
        this.start_time = start_time;
    }

    public double getEnd_time() {
        return end_time;
    }


    public void setEnd_time(double end_time) {
        this.end_time = end_time;
    }
}
