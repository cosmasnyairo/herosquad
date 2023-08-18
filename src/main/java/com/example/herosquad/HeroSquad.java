package com.example.herosquad;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

import com.example.herosquad.model.Hero;
import com.example.herosquad.model.Squad;

public class HeroSquad {
    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        List<Squad> squads = new ArrayList<>();
        loadHeroesAndSquadsFromYaml( heroes, squads);

        Squad strawhats = squads.get(0);
        Squad marines = squads.get(1);
        
        strawhats.addHero(heroes.get(0));
        marines.addHero(heroes.get(1));

        System.out.println("Total power level of StrawHats: " + strawhats.getTotalPowerLevel());
        System.out.println("Total power level of Marines: " + marines.getTotalPowerLevel());
    }

    private static void loadHeroesAndSquadsFromYaml(List<Hero> heroes, List<Squad> squads) {
        Yaml yaml = new Yaml();

        try (InputStream heroesInputStream = HeroSquad.class.getResourceAsStream("/heroes.yml");
             InputStream squadsInputStream = HeroSquad.class.getResourceAsStream("/squads.yml")) {
            Iterable<Object> heroObjects = yaml.loadAll(heroesInputStream);
            for (Object heroObject : heroObjects) {
                    List<Map<String, Object>> heroMaps = (List<Map<String, Object>>) heroObject;
                    for (Map<String, Object> heroData : heroMaps) {
                        String name = (String) heroData.get("name");
                        int age = (int) heroData.get("age");
                        String specialPower = (String) heroData.get("specialpower");
                        String weakness = (String) heroData.get("weakness");
                        int powerLevel = (int) heroData.get("powerLevel");

                        Hero hero = new Hero(name, age, specialPower, weakness, powerLevel);
                        heroes.add(hero);
                    }
            }

            Iterable<Object> squadObjects = yaml.loadAll(squadsInputStream);

            
            for (Object squadObject : squadObjects) {
                    List<Map<String, Object>> squadMaps = (List<Map<String, Object>>) squadObject;
                    for (Map<String, Object> squadData : squadMaps) {
                        String name = (String) squadData.get("name");
                        int maxSize = (int) squadData.get("maxsize");
                        String cause = (String) squadData.get("cause");

                        Squad squad = new Squad(name, maxSize, cause);
                        squads.add(squad);
                    }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}