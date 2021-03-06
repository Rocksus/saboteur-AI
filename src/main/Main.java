package main;

import gui.GameGUIController;
import javafx.application.Application;
import javafx.stage.Stage;

import static gui.GameGUIController.GUIGamePlayer;

public class Main extends Application {
  private static GameGUIController window;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
//    GUIGamePlayer testAI1 = new GUIGamePlayer("Smart");
//    GUIGamePlayer testAI2 = new GUIGamePlayer("Smart");
//    GUIGamePlayer testAI3 = new GUIGamePlayer("Smart");
//    GUIGamePlayer testAI4 = new GUIGamePlayer("Smart");
//    GUIGamePlayer testAI5 = new GUIGamePlayer("Smart");
    HeuristicsAI testAI1 = new HeuristicsAI("Stupidity");
    HeuristicsAI testAI2 = new HeuristicsAI("Stupidity");
    HeuristicsAI testAI3 = new HeuristicsAI("Stupidity");
    HeuristicsAI testAI4 = new HeuristicsAI("Stupidity");
    HeuristicsAI testAI5 = new HeuristicsAI("Stupidity");
    setUserAgentStylesheet(STYLESHEET_MODENA);
    window = GameGUIController.NewGameSession(testAI1, testAI2, testAI3, testAI4, testAI5);
  }
}
