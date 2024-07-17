package org.waldy;

import org.waldy.model.GameResult;
import org.waldy.model.ParsedInput;
import org.waldy.service.GameService;
import org.waldy.utility.InputParser;
import org.waldy.utility.OutputWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InputParser parser = new InputParser("src/main/resources/input.txt");
        ParsedInput parsedInput = parser.parse();

        GameService gameService = new GameService();
        GameResult result = gameService.play(parsedInput.getPlayer1(), parsedInput.getPlayer2());

        OutputWriter.writeResult("output.txt", result);
    }
}