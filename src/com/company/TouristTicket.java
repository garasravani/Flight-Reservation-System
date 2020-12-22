package com.company;

import java.util.Arrays;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(int pnrNumber, String depatureTimeStamp, String arrivalTimeStamp, boolean cancelled, float price,
                         int numberOfSeats, int durationOfTime, String hotelAddress, String[] selectedTouristLocation) {
        super(pnrNumber, depatureTimeStamp, arrivalTimeStamp, cancelled, price, numberOfSeats, durationOfTime);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    @Override
    public String toString() {
        return "TouristTicket{" +
                "hotelAddress='" + hotelAddress + '\'' +
                ", selectedTouristLocation=" + Arrays.toString(selectedTouristLocation) +
                '}';
    }
}
