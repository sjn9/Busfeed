package dao;
public class Route {
    String routename;
    int routeno;
    int distance;
    int capacity;
    int totalstops;

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public void setRouteno(int routeno) {
        this.routeno = routeno;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTotalstops(int totalstops) {
        this.totalstops = totalstops;
    }

    public String getRoutename() {
        return routename;
    }

    public int getRouteno() {
        return routeno;
    }

    public int getDistance() {
        return distance;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalstops() {
        return totalstops;
    }
}