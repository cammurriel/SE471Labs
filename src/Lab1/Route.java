package Lab1;

import java.util.ArrayList;

public class Route {
    private String start_point;
    private String end_point;


    Route()
    {
        start_point = "";
        end_point = "";
    }
    Route(String start, String end)
    {
        this.start_point = start;
        this.end_point = end;
    }

    public void setStart_point(String start_point) {
        this.start_point = start_point;
    }

    public void setEnd_point(String end_point) {
        this.end_point = end_point;
    }

    public String getStart_point() {
        return start_point;
    }

    public String getEnd_point() {
        return end_point;
    }
}
