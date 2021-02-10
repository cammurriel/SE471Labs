package Lab1;

public class Highway extends Route{
int speed_limit;

    Highway()
    {
    speed_limit = 0;
    }

    public int getSpeed_limit() {
        return speed_limit;
    }

    public void setSpeed_limit(int speed_limit) {
        this.speed_limit = speed_limit;
    }
}
