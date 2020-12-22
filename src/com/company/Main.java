package com.company;


import java.util.PrimitiveIterator;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("8th street","chennai","tamil nadu","gara","0987654321",
                "sravani@gmail.com");
        System.out.println(passenger.toString());
        Flight flight = new Flight("243","indigo",100,50);
        System.out.println(flight);
        String hotelAddress= "Hotel Tej,12th cross road,Blr";
        String[] location = {"goa","vizag","blr","chennai"};

        TouristTicket touristTicket = new TouristTicket(123,"1:2:20","2:3:9", true,2080,100,
                2,hotelAddress,location);

         RegularTicket regularTicket = new RegularTicket(456,"2:1:0","2:3:19",
                 true,4000,200,2,"drinks");
         printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);


    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnrNumber());
    }
}
