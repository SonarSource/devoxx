package devoxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuizzDeadStore {

  private static final Logger LOG = LoggerFactory
      .getLogger(QuizzDeadStore.class);

  public void playWith(int number, int playerAge) {
    int amountOfMoney;
    switch (number) {
    case 0:
      amountOfMoney = 1_000; // "A bit defensive but deserves a reward!"
      break;
    case 42:
      switch (playerAge) {
      case 42:
        amountOfMoney = 10_000; // "Well done + extra bonus due to your age!"
        break;
      default:
        amountOfMoney = 5_000; // "Well done!"
        break;
      }
    default:
      throw new RuntimeException("Game Over!");
    }
    give(amountOfMoney);
  }

  private void give(int amountOfMoney) {
    LOG.info("Yeah: " + amountOfMoney);
  }
}
