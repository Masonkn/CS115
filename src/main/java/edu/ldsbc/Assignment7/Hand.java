package edu.ldsbc.Assignment7;


import java.util.ArrayList;
import java.util.List;

public class Hand implements PHand {
    /**
     * Returns the number of cards in the hand.
     */
        List<PCard> hand = new ArrayList();

    public int getSize() {
        return hand.size();
    }

    /**
     * Adds a card to the end of the hand.
     *
     * @param card
     */
    public void addCard(PCard card) {
        hand.add(card);
    }

    /**
     * Returns a card from the hand (but not removed).
     *
     * @param index
     */
    public PCard getCard(int index) {
        return hand.get(index);
    }

    /**
     * Removes and returns the card
     *
     * @param index
     */
    public PCard removeCard(int index) {
        PCard indexcard = hand.get(index);
        hand.remove(indexcard);
        return indexcard;
    }

    /**
     * Returns the point value of the current hand.
     */
    public int getValue() {
        int total = 0;
        for (PCard card: hand) {
            Cards cards = (Cards) card;
            total += cards.getRank();
        }
        int tempVal = findBestCardTotal(total);
        System.out.println(tempVal);
        total = tempVal;
        return total;
    }
    int findBestCardTotal(int total) {
        if((total +10) <= 21) {
            total +=10;
            System.out.println("Added 11");
            return total;
        } else {
            System.out.println("Didn't add anything");
            return total;
        }
    }
}
