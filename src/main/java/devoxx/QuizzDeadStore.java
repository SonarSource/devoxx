package devoxx;

import java.util.logging.Logger;

public class QuizzDeadStore {

  public void playWith(int number, int playerAge) {
    String message;
    int amountOfMoney;
    switch (number) {
    case 0:
      amountOfMoney = 1_000;
      message = "A bit defensive but deserves a reward!";
      break;
    case -1:
      amountOfMoney = 0;
      message = "Are you trying to hack me ?";
      break;
    case 42:
      switch(playerAge) {
      case 2 :
        amountOfMoney = 1;
        message = "Are you kidding me?";
        break;      
      case 42 :
        amountOfMoney = 10_000;
        message = "Well done + extra bonus due to your age!";
        break;   
      default:
        amountOfMoney = 5_000;
        message = "Well done!";
        break;
      }
    default:
      throw new RuntimeException("Game Over!");
    }
    give(amountOfMoney, message);
  }

  private void give(int amountOfMoney, String message) {
    Logger.getGlobal().info(message + ", " + amountOfMoney + " for you");
  }
}
