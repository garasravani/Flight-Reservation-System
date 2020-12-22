package com.company;

public class Flight{
    private String flightName;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Flight(String flightName, String airline, int capacity, int bookedSeats){
        this.flightName = flightName;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    public boolean checkAvailibility(){
        if(this.bookedSeats < capacity){
            return true;
        }else
        {
            return false;
        }
    }
    public void incremenetBookingCount(){
        this.bookedSeats++;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightName='" + flightName + '\'' +
                ", airline='" + airline + '\'' +
                ", capacity=" + capacity +
                ", bookedSeats=" + bookedSeats +
                '}';
    }
}
