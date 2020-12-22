package com.company;

public class Passenger {
    private static int idCounter = 0;
    private int id;

    private static class Address{
        String street;
        String city;
        String state;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Address(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;

        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }
    private static class Contact{
        String phone;
        String email;
        String name;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Contact(String phone, String email, String name){
            this.phone = phone;
            this.email = email;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    private Contact contact;
    private Address address;

    public Passenger(String street, String city, String state, String name, String phone,String email){
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(phone,email,name);
    }
    public int getId(){
        return this.id;
    }



    public String getAddressDetails(){
        return "street : " + address.street +", state :" + address.state +", city" + address.city;
    }
    public String getContactDetail(){
        return "name : " + contact.name +", phone :"+ contact.phone +", email" + contact.email;
    }
    public static int getPassengerCount(){
        return idCounter;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}
