package com.example.rpgdiceroller;

import java.io.Serializable;
import java.util.Random;

public class Dice implements Serializable {
    private final int PERCENTILE_COEFFICIENT = 10;
    private int surfaces;

    public Dice(int surfaces) {
        this.surfaces = surfaces;
    }

    public int getSurfaces() {
        return surfaces;
    }

}
