package cardSim.decks;

import cardSim.cards.MathCard;
import cardSim.cards.MathNumberCard;
import cardSim.cards.MathOperatorCard;

import java.util.LinkedList;
import java.util.Random;

public class MathDeck implements Deck {
    private final String[] ops = {"+", "-", "*", "/"};
    Random rand = new Random();

    LinkedList<MathCard> deck = new LinkedList<MathCard>();
    LinkedList<MathNumberCard> numDeck = new LinkedList<>();
    LinkedList<MathOperatorCard> opDeck = new LinkedList<>();

    public MathDeck(int operations) {
        for (int i = 0; i < operations; i++) {
            numDeck.add(new MathNumberCard(rand.nextInt(10)));
            if (i > 0) {
                opDeck.add(new MathOperatorCard(ops[rand.nextInt(4)]));
            }
        }
        deck.addAll(numDeck);
        deck.addAll(opDeck);
    }

    public void shuffle() {

    }
    public void reshuffle() {

    }
    public LinkedList<MathCard> deal(int num) {
        LinkedList<MathCard> operationDeck = new LinkedList<MathCard>();
        while (!(numDeck.isEmpty())) {
            operationDeck.add(numDeck.pop());
            if (!(opDeck.isEmpty())) {
                operationDeck.add(opDeck.pop());
            }
        }
        return operationDeck;
    }

    @Override public String toString() {
        return deck.toString();
    }
}
