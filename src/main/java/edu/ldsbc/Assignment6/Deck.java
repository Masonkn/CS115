package edu.ldsbc.Assignment6;


import java.util.ArrayList;
import java.util.List;

public class Deck implements PDeck {

        List<PCard> deck = new ArrayList();

    public void shuffle() {

    }

    public void addCard(PCard card) {
        deck.add(card);
    }

    public PCard dealCard() {
        PCard dealtcard = deck.get(-0);
        deck.remove(-0);
        return dealtcard;
    }

    public PCard dealHiddenCard() {
        return null;
    }

    public int cardCount() {
        int total=0;
        for (PCard card: deck) {
        total++;
        }
        return total;
    }
}
