package com.newYear.models;

public class NewYearToy implements Comparable<NewYearToy> {

    private ColoursEnum colour;
    private String name;

    public NewYearToy(ColoursEnum colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public ColoursEnum getColour() {
        return colour;
    }

    public void setColour(ColoursEnum colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(NewYearToy o) {
        return colour.toString().compareTo(o.colour.toString());
    }

    @Override
    public String toString() {
        return "NewYearToy{" +
                "colour=" + colour +
                ", name='" + name + '\'' +
                '}';
    }
}
