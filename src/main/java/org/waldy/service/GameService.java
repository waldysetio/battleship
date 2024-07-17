package org.waldy.service;

import org.waldy.model.GameResult;
import org.waldy.model.Grid;
import org.waldy.model.Player;
import org.waldy.model.Position;

import java.util.List;

public class GameService {
    public GameResult play(Player player1, Player player2) {
        placeShip(player1);
        placeShip(player2);

        int player1Hits = applyMissiles(player2.getGrid(), player1.getMissiles());
        int player2Hits = applyMissiles(player1.getGrid(), player2.getMissiles());

        String result = determineResult(player1Hits, player2Hits);
        return new GameResult(player1.getGrid(), player2.getGrid(), player1Hits, player2Hits, result);
    }

    private void placeShip(Player player) {
        for (Position ship : player.getShips()) {
            player.getGrid().getMatrix()[ship.getX()][ship.getY()] = 'B';
        }
    }

    private int applyMissiles(Grid grid, List<Position> missiles) {
        int hits = 0;
        for (Position missile : missiles) {
            if (grid.getMatrix()[missile.getX()][missile.getY()] == 'B') {
                grid.getMatrix()[missile.getX()][missile.getY()] = 'X';
                hits++;
            } else {
                grid.getMatrix()[missile.getX()][missile.getY()] = 'O';
            }
        }
        return hits;
    }

    private String determineResult(int player1Hits, int player2Hits) {
        if (player1Hits > player2Hits) {
            return "Player 1 wins";
        } else if (player2Hits > player1Hits) {
            return "Player 2 wins";
        } else {
            return "It is a draw";
        }
    }
}
