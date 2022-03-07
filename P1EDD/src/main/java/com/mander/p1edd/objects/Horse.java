package com.mander.p1edd.objects;

public class Horse {
    
    private String horseName;

    public Horse(String horseName) {
        this.horseName = horseName;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    public String toString() {
        return "Horse{"+ horseName+ '}';
    }
    
}
