package edu.uncc.tcrowe6.arrivaltime.models;

public class Route {
    // Name of route [26=Green, 27=Silver, 32=Cooper, 34=Gold]
    private Integer RouteID;
    // Specific bus number [Actual bus number=VehicleID]
    private Integer VehicleID;
    // Specific stop ID
    private Integer RouteStopID;

    public Integer getRouteID() {
        return RouteID;
    }

    public void setRouteID(Integer routeID) {
        RouteID = routeID;
    }

    public Integer getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        VehicleID = vehicleID;
    }

    public Integer getRouteStopID() {
        return RouteStopID;
    }

    public void setRouteStopID(Integer routeStopID) {
        RouteStopID = routeStopID;
    }
}
