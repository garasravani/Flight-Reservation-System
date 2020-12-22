package com.company;

import java.time.LocalDateTime;



public abstract class Ticket {
    private int pnrNumber;
    private String departureTimeStamp;
    private String arrivalTimeStamp;
    private boolean cancelled;
    private float price;
    private int numberOfSeats;
    private int durationOfTime;

    private Flight flight;
    private Passenger passenger;

    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepatureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepatureTimeStamp(String depatureTimeStamp) {
        this.departureTimeStamp = depatureTimeStamp;
    }

    public String getArrivalTimeStamp() {
        return arrivalTimeStamp;
    }

    public void setArrivalTimeStamp(String arrivalTimeStamp) {
        this.arrivalTimeStamp = arrivalTimeStamp;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getDurationOfTime() {
        return durationOfTime;
    }

    public void setDurationOfTime(int durationOfTime) {
        this.durationOfTime = durationOfTime;
    }

    public Ticket(int pnrNumber, String depatureTimeStamp, String arrivalTimeStamp, boolean cancelled,
                  float price, int numberOfSeats, int durationOfTime) {
        this.pnrNumber = pnrNumber;
        this.departureTimeStamp = depatureTimeStamp;
        this.arrivalTimeStamp = arrivalTimeStamp;
        this.cancelled = cancelled;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.durationOfTime = durationOfTime;

    }
    public void cancelTicket(){
        this.cancelled = true;
    }
    public int getFlightDuratiin(){
        LocalDateTime depatureTimeStap = LocalDateTime.parse(this.departureTimeStamp);
        LocalDateTime arrivalTimeStamp = LocalDateTime.parse(this.arrivalTimeStamp);
        int days = arrivalTimeStamp.getDayOfMonth() - depatureTimeStap.getDayOfMonth();
        int totalHours = ( days * 24) + (arrivalTimeStamp.getHour() - depatureTimeStap.getHour());
        return totalHours;
    }
   /* public String getCheckDetails(){
        return ;*/


    @Override
    public String toString() {
        return "ticket{" +
                "pnrNumber=" + pnrNumber +
                ", depatureTimeStamp='" + departureTimeStamp + '\'' +
                ", arrivalTimeStamp='" + arrivalTimeStamp + '\'' +
                ", cancelled=" + cancelled +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                ", durationOfTime=" + durationOfTime +
                '}';
    }
}
