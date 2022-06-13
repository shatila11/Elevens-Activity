import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cards;

    public Deck(String[] ranks, String[] suits, int[] values) {

        cards = new ArrayList<>(10);
        for (String rank : ranks) {
            for (String suit : suits) {
                for (int value : values) {
                    Card aCard = new Card(rank, suit, value);
                    cards.add(aCard);
                }
            }
        }
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.size() == 0;
    }

    public int size() {
        return cards.size();
    }

    public Card deal() {
        if (cards.size() > 0) {
            Card card= cards.get(cards.size() - 1);
            cards.remove(cards.size() - 1);
            return card;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck deck = new Deck(ranks,suits,pointValues);
        System.out.println(deck.isEmpty());
        
        System.out.println(deck.deal());
        System.out.println(deck.size());
        
        System.out.println(deck.deal());
        System.out.println(deck.size());

        System.out.println(deck.deal());
        System.out.println(deck.size());
        
        System.out.println(deck.deal());
        System.out.println(deck.size());
        
        System.out.println(deck.deal());
        System.out.println(deck.size());
    }
}