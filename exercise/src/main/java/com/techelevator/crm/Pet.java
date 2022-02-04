package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<String>();

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public String listVaccinations() {
        String vaccList = "";
        for (String vaccination : vaccinations) {
            vaccList += ", "+vaccination;
        }
        vaccList = vaccList.replaceFirst(", ", "");
        return  vaccList;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
}
