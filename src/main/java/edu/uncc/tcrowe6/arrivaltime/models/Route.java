package edu.uncc.tcrowe6.arrivaltime.models;

public class Route {
    // Name of route [Green, Silver, Cooper, Gold]
    private String routeName;
    // Specific bus number
    private Integer busNumber;

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }
}
