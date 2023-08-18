package com.example.herosquad.model;

import java.util.Map;

public class Hero {
    private String name;
    private int age;
    private String specialpower;
    private String weakness;
    private int powerLevel;
    private Hero Hero;  
    private boolean assignedToSquad;


    public Hero(String name,int age,String specialpower,String weakness,int powerLevel) {
        this.name = name;
        this.age = age;
        this.specialpower = specialpower;
        this.weakness = weakness;
        this.powerLevel = powerLevel;
        this.assignedToSquad = false;
    }

    public String getName() {
        return name;
    }

    public Object getHero(){
      return Hero;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public boolean isAssignedToSquad() {
        return assignedToSquad;
    }

    public void assignToSquad(boolean assignedToSquad) {
        this.assignedToSquad = assignedToSquad;
    }

      @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", maxside=" + age+
                '}';
    }
}
