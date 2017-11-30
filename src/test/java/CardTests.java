import cardSim.cards.MathOperatorCard;
import org.junit.jupiter.api.Test;

public class CardTests {

    @Test
    public void justATest() {
        return;
    }

    @Test
    public void canMakeOpCards() {
        MathOperatorCard plus = new MathOperatorCard("+");
        MathOperatorCard minus = new MathOperatorCard("-");
        MathOperatorCard multiply = new MathOperatorCard("*");
        MathOperatorCard divide = new MathOperatorCard("/");
    }
}
