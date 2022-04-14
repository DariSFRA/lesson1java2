package com.company;

import com.company.Obstacle;

public class Wall implements Obstacle {
    public final int height;

    public Wall(int height) {
        this.height = height;

    }

    @Override
    public String toString() {
        return String.format("Прыгнул: %d", height);
    }
}
