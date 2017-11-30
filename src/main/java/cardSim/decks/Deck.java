package cardSim.decks;

import cardSim.cards.Card;

import java.util.LinkedList;

public interface Deck {

    public void shuffle();
    public <E> LinkedList deal(int num);
    public void reshuffle();

}
