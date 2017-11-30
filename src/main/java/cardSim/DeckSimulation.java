package cardSim;

import cardSim.cards.PlayingCard;
import cardSim.decks.FullDeck;

import java.util.LinkedList;

public class DeckSimulation {
    public static void main(String args[]) {
        simulate();
    }

    public static void simulate() {
        FullDeck deck = new FullDeck();
        deck.shuffle();
        LinkedList<PlayingCard> hand = deck.deal(5);
        LinkedList<PlayingCard> hand2 = deck.deal(7);
        LinkedList<PlayingCard> hand3 = deck.deal(20);
        System.out.println(hand.toString());
        System.out.println(hand2.toString());
        System.out.println(hand3.toString());
    }
}
