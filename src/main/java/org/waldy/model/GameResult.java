package org.waldy.model;

public class GameResult {
    private Grid player1Grid;
    private Grid player2Grid;
    private int player1Hits;
    private int player2Hits;
    private String result;

    public GameResult(Grid player1Grid, Grid player2Grid, int player1Hits, int player2Hits, String result) {
        this.player1Grid = player1Grid;
        this.player2Grid = player2Grid;
        this.player1Hits = player1Hits;
        this.player2Hits = player2Hits;
        this.result = result;
    }

    public Grid getPlayer1Grid() {
        return player1Grid;
    }

    public void setPlayer1Grid(Grid player1Grid) {
        this.player1Grid = player1Grid;
    }

    public Grid getPlayer2Grid() {
        return player2Grid;
    }

    public void setPlayer2Grid(Grid player2Grid) {
        this.player2Grid = player2Grid;
    }

    public int getPlayer1Hits() {
        return player1Hits;
    }

    public void setPlayer1Hits(int player1Hits) {
        this.player1Hits = player1Hits;
    }

    public int getPlayer2Hits() {
        return player2Hits;
    }

    public void setPlayer2Hits(int player2Hits) {
        this.player2Hits = player2Hits;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
