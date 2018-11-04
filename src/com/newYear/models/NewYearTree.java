package com.newYear.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearTree {

    private int id;
    private List<NewYearToy> toys;

    public NewYearTree(int id, List<NewYearToy> toys) {
        this.id = id;
        this.toys = toys;
    }

    public NewYearTree(){
        toys = new ArrayList<>();
    }

    public List<NewYearToy> getToys() {
        return toys;
    }

    public void setToys(List<NewYearToy> toys) {
        this.toys = toys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewYearTree that = (NewYearTree) o;

        if (id != that.id) return false;
        return toys != null ? toys.equals(that.toys) : that.toys == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (toys != null ? toys.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NewYearTree{" +
                "id=" + id +
                ", toys=" + Arrays.toString(toys.toArray()) +
                '}';
    }

    public void addToy(NewYearToy toy) {
        toys.add(toy);
    }
}
