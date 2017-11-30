import cardSim.cards.MathCard;
import cardSim.cards.PlayingCard;
import cardSim.decks.FullDeck;
import cardSim.decks.MathDeck;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class DeckTests {

    @Test
    public void MathDeckTest() {
        MathDeck deck = new MathDeck(5);
        System.out.println(deck.toString());
        LinkedList<MathCard> hand = deck.deal(5);
        System.out.println(hand.toString());
    }

}
