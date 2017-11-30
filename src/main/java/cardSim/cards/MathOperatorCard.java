package cardSim.cards;

public class MathOperatorCard extends MathCard {

    private Op operator;

    private enum Op {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/");

        private String value;
        private int precedence;
        Op(String value) {
            this.value = value;
            this.precedence = getPrecedence(value);
        }

        public int getPrecedence(String value) {
            if ((value.equals("+")) || (value.equals("-"))) {
                return 1;
            } else if ((value.equals("*")) || (value.equals("/"))) {
                return 2;
            } else {
                return -1;
            }
        }
    }
    public MathOperatorCard(String value) {
        for (Op op : Op.values()) {
            if (op.value.equals(value)) {
                this.operator = op;
                return;
            }
        }
    }

    @Override public String toString() {
        return this.operator.value;
    }

}
