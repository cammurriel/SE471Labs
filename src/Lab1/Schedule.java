package Lab1;

public class Schedule {
    private long start_time;
    private long end_time;

    Schedule()
    {
        start_time = 0;
        end_time = 0;
    }

    Schedule(long start, long end)
    {
        this.start_time = start;
        this.end_time = end;
    }
    public long getStart_time() {
        return start_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }
}
