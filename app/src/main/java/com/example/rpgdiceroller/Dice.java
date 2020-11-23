package com.example.rpgdiceroller;

import java.util.Random;

public class Dice {
    private final int PERCENTILE_COEFFICIENT = 10;
    private String name;

    public Dice(String name, int surfaces) {
        this.name = name;
        this.surfaces = surfaces;
    }

    private int surfaces;

    public static final Dice[] diceAll = {
            new Dice("D4",4),
            new Dice("D6",6),
            new Dice("D8",8),
            new Dice("D10",10),
            new Dice("D12",12),
            new Dice("D20",20),
            new Dice("Percentile Die",100)
    };

    public String getName() {
        return name;
    }

    public int getSurfaces() {
        return surfaces;
    }

    public int  rollDice(){
        Random random = new Random();
        int diceSurfaceNumber = random.nextInt(getSurfaces());

        if(getSurfaces() == 100){
            diceSurfaceNumber *= PERCENTILE_COEFFICIENT;
        }

        return diceSurfaceNumber;
    }
}
