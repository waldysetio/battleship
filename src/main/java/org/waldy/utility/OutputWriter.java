package org.waldy.utility;

import org.waldy.model.GameResult;
import org.waldy.model.Grid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputWriter {
    public static void writeResult(String filePath, GameResult gameResult) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            writeGrid(bw, "Player1", gameResult.getPlayer1Grid());
            writeGrid(bw, "Player2", gameResult.getPlayer2Grid());
            bw.write("P1:" + gameResult.getPlayer1Hits() + "\n");
            bw.write("P2:" + gameResult.getPlayer2Hits() + "\n");
            bw.write("Game Result: " + gameResult.getResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeGrid(BufferedWriter bw, String playerName, Grid grid) throws IOException {
        bw.write(playerName + "\n");
        char[][] gridArray = grid.getMatrix();
        for (char[] row : gridArray) {
            for (char cell : row) {
                bw.write(cell + " ");
            }
            bw.write("\n");
        }
    }
}
