package application;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getPieces());
    }
}
