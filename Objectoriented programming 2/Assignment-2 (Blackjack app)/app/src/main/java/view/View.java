package view;

import model.Observer;
import model.rules.RuleVisitor;

/**
 * Encapsulates the generic view functionality.
 */
public interface View extends Observer, RuleVisitor {

  /** this is the different actions the player can choose. */
  public enum PlayerActions {
    Play,
    Hit,
    Stand,
    Quit,
    None
  }

  PlayerActions showPlayerActions();

  /**
   * Shows a welcome message.
   */
  void displayWelcomeMessage();

  /**
   * Returns pressed characters from the keyboard.

   * @return the pressed character.
   */
  int getInput();

  /**
   * Displays a card.

   * @param card The card to display.
   */
  void displayCard(model.Card card);

  /**
   * Displays the cards and score of the player.

   * @param hand the player's hand.
   * @param score the player's score.
   */
  void displayPlayerHand(Iterable<model.Card> hand, int score);

  /**
   * Displays the cards and score of the dealer.

   * @param hand the dealer's score.
   * @param score the players's score.
   */
  void displayDealerHand(Iterable<model.Card> hand, int score);

  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  void displayGameOver(boolean dealerIsWinner);
}