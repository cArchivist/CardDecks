package cardSim.cards;

public class MathNumberCard extends MathCard {
    private int value;

    public MathNumberCard(int value) {
        this.value = value;
    }

    @Override public String toString() {
        return String.valueOf(this.value);
    }
}
