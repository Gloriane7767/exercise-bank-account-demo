package com.gloriane;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Sarah Wilson", "sarah.wilson@email.com");
        Customer customer2 = new Customer("Tom Brown", "tom.brown@gmail.com");
        Customer customer3 = new Customer("Lisa Garcia", "lisa.garcia@yahoo.com");
        Customer customer4 = new Customer("Mark Davis", "mark.davis@hotmail.com");

        System.out.println(customer1.getCustomer());
        System.out.println(customer2.getCustomer());
        System.out.println(customer3.getCustomer());
        System.out.println(customer4.getCustomer());
    }
}