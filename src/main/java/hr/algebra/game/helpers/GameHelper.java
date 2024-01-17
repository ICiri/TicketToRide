package hr.algebra.game.helpers;

import hr.algebra.game.controller.GameBoardController;
import hr.algebra.game.model.Game;
import hr.algebra.game.model.Player;
import hr.algebra.game.model.PlayerColor;
import hr.algebra.utilities.CardDealerUtils;

import java.util.ArrayList;

import java.util.List;

public class GameHelper {

    public static Game getGame() {
        return game;
    }

    private static Game game;
    private static GameBoardController gameBoardController;
    private static List<PlayerColor> availableColors;


    public static void startGame() {
        setupPlayers();
        Player currentPlayer = game.getCurrentPlayer();
        gameBoardController.updatePlayerIndicator(currentPlayer);
    }

    private static void setupPlayers() {
        game.removePlayers();
        game.addPlayer(new Player(availableColors.get(0));
        game.addPlayer(new Player(availableColors.get(1));
    }

    public static void switchTurns() {
        Player nextPlayer = game.switchToNextPlayer();
        CardDealerUtils.dealCardsToPlayer();
    }


}