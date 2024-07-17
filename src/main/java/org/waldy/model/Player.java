package org.waldy.model;

import java.util.List;

public class Player {
    private Grid grid;
    private List<Position> ships;
    private List<Position> missiles;

    public Player(Grid grid, List<Position> ships, List<Position> missiles) {
        this.grid = grid;
        this.ships = ships;
        this.missiles = missiles;
    }

    public Player() {}

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public List<Position> getShips() {
        return ships;
    }

    public void setShips(List<Position> ships) {
        this.ships = ships;
    }

    public List<Position> getMissiles() {
        return missiles;
    }

    public void setMissiles(List<Position> missiles) {
        this.missiles = missiles;
    }
}
