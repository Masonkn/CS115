package edu.ldsbc.Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Deck implements PDeck {
        List<PCard> deck = new ArrayList<PCard>();
    public void shuffle() {

    }

    public void addCard(PCard card) {
        deck.add(card);
    }

    public PCard dealCard() {
        return null;
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
