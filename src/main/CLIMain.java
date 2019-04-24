package main;

import model.*;
import model.cards.Card;

public class CLIMain extends GameObserver {
    private static int miners = 0;
    private static int saboteurs = 0;
    @Override
    protected void onGameFinished(Player.Role role, int lastPlayer) {
        if(role == Player.Role.SABOTEUR) saboteurs++;
        else miners++;
    }

    @Override
    protected void onPlayerMove(Move move, Card newCard) {
        game().finalizeTurn();
    }

    public static void main(String[] args) throws GameException {
        for (int n = 0; n < 8; n++) {
            miners=0; saboteurs=0;
            for (int i = 0; i < 1000; i++) {
                GameState state = new GameState();
                HeuristicsAI AI1 = new HeuristicsAI("Stupidity");
                HeuristicsAI AI2 = new HeuristicsAI("Stupidity");
                HeuristicsAI AI3 = new HeuristicsAI("Stupidity");
                HeuristicsAI AI4 = new HeuristicsAI("Stupidity");
                HeuristicsAI AI5 = new HeuristicsAI("Stupidity");
                HeuristicsAI AI6 = new HeuristicsAI("Stupidity");
                HeuristicsAI AI7 = new HeuristicsAI("Stupidity");
                GameLogicController game = new GameLogicController(state, AI1, AI2, AI3, AI4, AI5, AI6, AI7);
                game.addObserver(new CLIMain());
                game.initializeRound();
                game.startRound();
            }
            System.out.println(miners + " " + saboteurs);
        }
    }
}
