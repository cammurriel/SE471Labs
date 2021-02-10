package Lab1;

import java.util.ArrayList;

public class Trip {
private String From;
private  String Destination;
   //ArrayList<Schedule>TripSchedule = new ArrayList<>();

    Trip()
    {

    }
    Trip(String f, String D)
    {
    this.From = f;
    this.Destination = D;
    }

    public String getDestination() {
        return Destination;
    }

    public String getFrom() {
        return From;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public void setFrom(String from) {
        From = from;
    }
}
