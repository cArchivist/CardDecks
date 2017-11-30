package cardSim.cards;

import cardSim.Rank;
import cardSim.Suit;

public class PlayingCard {
    private Suit suit;
    private Rank rank;


    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override public String toString() {
        return (this.rank.getValue() + this.suit.getValue());
    }
}
