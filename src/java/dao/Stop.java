package dao;
public class Stop {
    int routeno;
    int capacity;
    String stopname;

    public int getRouteno() {
        return routeno;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getStopname() {
        return stopname;
    }

    public void setRouteno(int routeno) {
        this.routeno = routeno;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStopname(String stopname) {
        this.stopname = stopname;
    }
}
