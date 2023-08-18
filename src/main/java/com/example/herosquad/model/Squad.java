package com.example.herosquad.model;

import com.example.herosquad.model.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Squad {
    private String name;
    private String cause;
    private int maxsize;
    private List<Hero> heroes;
    private Hero hero;


    public Squad(String name,int maxsize,String cause) {
        this.name =name;
        this.maxsize = maxsize;
        this.cause = cause;
        this.heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        if (hero.isAssignedToSquad()) {
            System.out.println("Hero is already assigned to a squad.");
        } else {
            if (this.hero != null) {
                System.out.println("Squad already has a hero.");
            } else {
                this.hero = hero;
                hero.assignToSquad(true);
            }
        }
    }

    public void removeHero(Hero hero) {
        heroes.remove(hero);
    }

    public int getTotalPowerLevel() {
        return hero != null ? hero.getPowerLevel() : 0;
    }

    @Override
    public String toString() {
        return "Squad{" +
                "name='" + name + '\'' +
                ", maxside=" + maxsize+
                '}';
    }


    
}
