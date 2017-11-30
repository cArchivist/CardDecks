# CardDecks
Repo that stores the classes and implementations for virtual cards of various kinds

This is a personal project that includes various implementations of cards (using Card interface) and decks (using Deck interface).  Each deck contains specific kinds of cards.  These cards and decks are then used in animations depicting properties of a deque in Java and illustrating the shunting yard algorithm (in development).

### Current Deck Types

+ FullDeck -- a deck with 52 traditional playing cards (no jokers)
+ MathDeck -- a deck containing randomly generated numbers and operands

### Current Card Types

+ PlayingCard -- a card with a suit and rank
+ MathNumberCard -- a card with a number from 1 to 10
+ MathOperatorCard -- a card with one of the mathematical symbols (currently +, -, *, /)
