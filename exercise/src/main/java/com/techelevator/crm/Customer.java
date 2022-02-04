package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.*;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<String> pets = new ArrayList<>();

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double total = 0;
        for (Map.Entry<String, Double> balances : servicesRendered.entrySet()) {
            total += balances.getValue();

        }return total;
    }

}
