package com.company;

public class RegularTicket extends Ticket {
    private String speicalServices;

    public RegularTicket(int pnrNumber, String depatureTimeStamp, String arrivalTimeStamp, boolean cancelled, float price,
                         int numberOfSeats, int durationOfTime, String speicalServices) {
        super(pnrNumber, depatureTimeStamp, arrivalTimeStamp, cancelled, price, numberOfSeats, durationOfTime);
        this.speicalServices = speicalServices;
    }

    public String getSpeicalServices() {
        return speicalServices;
    }

    public void setSpeicalServices(String speicalServices) {
        this.speicalServices = speicalServices;
    }
    public String getSpeicalservices(){
        return this.speicalServices;
    }
   public void updateSpeicalServices() {
       String str = "water";
       String str1 = "food";
       String str2 = "snacks";
       String str3 = str + "," + str1 + "," +str2;

   }
    @Override
    public String toString() {
        return "RegularTicket{" +
                "speicalServices='" + speicalServices + '\'' +
                '}';
    }
}
