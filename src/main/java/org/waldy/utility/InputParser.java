package org.waldy.utility;

import org.waldy.model.Grid;
import org.waldy.model.ParsedInput;
import org.waldy.model.Player;
import org.waldy.model.Position;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputParser {
    private String filePath;

    public InputParser(String filePath) {
        this.filePath = filePath;
    }

    public ParsedInput parse() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int size = Integer.parseInt(br.readLine());
            int numShip = Integer.parseInt(br.readLine());

            Grid player1Grid = new Grid(size);
            Grid player2Grid = new Grid(size);

            List<Position> player1Ships = parsePositions(br.readLine());
            List<Position> player2Ships = parsePositions(br.readLine());

            int numMissiles = Integer.parseInt(br.readLine());

            List<Position> player1Missiles = parsePositions(br.readLine());
            List<Position> player2Missiles = parsePositions(br.readLine());

            Player player1 = new Player(player1Grid, player1Ships, player1Missiles);
            Player player2 = new Player(player2Grid, player2Ships, player2Missiles);

            return new ParsedInput(player1, player2);
        } catch (IOException e) {
            return null;
        }
    }

    private List<Position> parsePositions(String line) {
        String[] tokens = line.split(":");
        List<Position> positions = new ArrayList<>();
        for (String token : tokens) {
            String[] coords = token.split(",");
            positions.add(new Position(Integer.parseInt(coords[0]), Integer.parseInt(coords[1])));
        }
        return positions;
    }
}
