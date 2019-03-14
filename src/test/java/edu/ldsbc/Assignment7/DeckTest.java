package edu.ldsbc.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void shuffle() {
        Deck deck = new Deck();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart3 = new Cards(2, "\u2665");
        Cards heart4 = new Cards(3, "\u2665");
        Cards heart5 = new Cards(4, "\u2665");
        Cards heart6 = new Cards(5, "\u2665");
        Cards heart7 = new Cards(6, "\u2665");
        Cards heart8 = new Cards(7, "\u2665");
        Cards heart9 = new Cards(8, "\u2665");
        Cards heart10 = new Cards(9, "\u2665");
        Cards heart11 = new Cards(10, "\u2665");
        Cards heart12 = new Cards(10, "\u2665");
        Cards heart13 = new Cards(10, "\u2665");
        Cards heart14 = new Cards(10, "\u2665");
        Cards heart15 = new Cards(10, "\u2665");
        deck.addCard(heart1);
        deck.addCard(heart3);
        deck.addCard(heart4);
        deck.addCard(heart5);
        deck.addCard(heart6);
        deck.addCard(heart7);
        deck.addCard(heart8);
        deck.addCard(heart9);
        deck.addCard(heart10);
        deck.addCard(heart11);
        deck.addCard(heart12);
        deck.addCard(heart13);
        deck.addCard(heart14);
        deck.addCard(heart15);
        Cards spades1 = new Cards(1, "\u2664");
        Cards spades3 = new Cards(2, "\u2664");
        Cards spades4 = new Cards(3, "\u2664");
        Cards spades5 = new Cards(4, "\u2664");
        Cards spades6 = new Cards(5, " \u2664");
        Cards spades7 = new Cards(6, " \u2664");
        Cards spades8 = new Cards(7, "\u2664");
        Cards spades9 = new Cards(8, "\u2664");
        Cards spades10 = new Cards(9, "\u2664");
        Cards spades11 = new Cards(10, "\u2664");
        Cards spades12 = new Cards(10, "\u2664");
        Cards spades13 = new Cards(10, "\u2664");
        Cards spades14 = new Cards(10, "\u2664");
        Cards spades15 = new Cards(10, "\u2664");
        deck.addCard(spades1);
        deck.addCard(spades3);
        deck.addCard(spades4);
        deck.addCard(spades5);
        deck.addCard(spades6);
        deck.addCard(spades7);
        deck.addCard(spades8);
        deck.addCard(spades9);
        deck.addCard(spades10);
        deck.addCard(spades11);
        deck.addCard(spades12);
        deck.addCard(spades13);
        deck.addCard(spades14);
        deck.addCard(spades15);
        Cards clubs1 = new Cards(1, "\u2667");
        Cards clubs3 = new Cards(2, "\u2667");
        Cards clubs4 = new Cards(3, "\u2667");
        Cards clubs5 = new Cards(4, "\u2667");
        Cards clubs6 = new Cards(5, " \u2667");
        Cards clubs7 = new Cards(6, " \u2667");
        Cards clubs8 = new Cards(7, "\u2667");
        Cards clubs9 = new Cards(8, "\u2667");
        Cards clubs10 = new Cards(9, "\u2667");
        Cards clubs11 = new Cards(10, "\u2667");
        Cards clubs12 = new Cards(10, "\u2667");
        Cards clubs13 = new Cards(10, "\u2667");
        Cards clubs14 = new Cards(10, "\u2667");
        Cards clubs15 = new Cards(10, "\u2667");
        deck.addCard(clubs1);
        deck.addCard(clubs3);
        deck.addCard(clubs4);
        deck.addCard(clubs5);
        deck.addCard(clubs6);
        deck.addCard(clubs7);
        deck.addCard(clubs8);
        deck.addCard(clubs9);
        deck.addCard(clubs10);
        deck.addCard(clubs11);
        deck.addCard(clubs12);
        deck.addCard(clubs13);
        deck.addCard(clubs14);
        deck.addCard(clubs15);
        Cards diamonds1 = new Cards(1, "\u2662");
        Cards diamonds3 = new Cards(2, "\u2662");
        Cards diamonds4 = new Cards(3, "\u2662");
        Cards diamonds5 = new Cards(4, "\u2662");
        Cards diamonds6 = new Cards(5, " \u2662");
        Cards diamonds7 = new Cards(6, " \u2662");
        Cards diamonds8 = new Cards(7, "\u2662");
        Cards diamonds9 = new Cards(8, "\u2662");
        Cards diamonds10 = new Cards(9, "\u2662");
        Cards diamonds11 = new Cards(10, "\u2662");
        Cards diamonds12 = new Cards(10, "\u2662");
        Cards diamonds13 = new Cards(10, "\u2662");
        Cards diamonds14 = new Cards(10, "\u2662");
        Cards diamonds15 = new Cards(10, "\u2662");
        deck.addCard(diamonds1);
        deck.addCard(diamonds3);
        deck.addCard(diamonds4);
        deck.addCard(diamonds5);
        deck.addCard(diamonds6);
        deck.addCard(diamonds7);
        deck.addCard(diamonds8);
        deck.addCard(diamonds9);
        deck.addCard(diamonds10);
        deck.addCard(diamonds11);
        deck.addCard(diamonds12);
        deck.addCard(diamonds13);
        deck.addCard(diamonds14);
        deck.addCard(diamonds15);
        deck.addCard(heart1);
        deck.addCard(heart3);
        deck.addCard(heart4);
        Deck deck2 = new Deck();
        deck2.addCard(heart1);
        deck2.addCard(heart3);
        deck2.addCard(heart4);
        deck2.addCard(diamonds1);
        deck2.addCard(diamonds3);
        deck2.addCard(diamonds4);
        deck2.addCard(diamonds5);
        deck2.addCard(diamonds6);
        deck2.addCard(diamonds7);
        deck2.addCard(diamonds8);
        deck2.addCard(diamonds9);
        deck2.addCard(diamonds10);
        deck2.addCard(diamonds11);
        deck2.addCard(diamonds12);
        deck2.addCard(diamonds13);
        deck2.addCard(diamonds14);
        deck2.addCard(diamonds15);
        deck2.addCard(clubs1);
        deck2.addCard(clubs3);
        deck2.addCard(clubs4);
        deck2.addCard(clubs5);
        deck2.addCard(clubs6);
        deck2.addCard(clubs7);
        deck2.addCard(clubs8);
        deck2.addCard(clubs9);
        deck2.addCard(clubs10);
        deck2.addCard(clubs11);
        deck2.addCard(clubs12);
        deck2.addCard(clubs13);
        deck2.addCard(clubs14);
        deck2.addCard(clubs15);
        deck2.addCard(spades1);
        deck2.addCard(spades3);
        deck2.addCard(spades4);
        deck2.addCard(spades5);
        deck2.addCard(spades6);
        deck2.addCard(spades7);
        deck2.addCard(spades8);
        deck2.addCard(spades9);
        deck2.addCard(spades10);
        deck2.addCard(spades11);
        deck2.addCard(spades12);
        deck2.addCard(spades13);
        deck2.addCard(spades14);
        deck2.addCard(spades15);
        deck2.addCard(heart1);
        deck2.addCard(heart3);
        deck2.addCard(heart4);
        deck2.addCard(heart5);
        deck2.addCard(heart6);
        deck2.addCard(heart7);
        deck2.addCard(heart8);
        deck2.addCard(heart9);
        deck2.addCard(heart10);
        deck2.addCard(heart11);
        deck2.addCard(heart12);
        deck2.addCard(heart13);
        deck2.addCard(heart14);
        deck2.addCard(heart15);
        deck2.shuffle();
        String deckString = "";
        String deckString2 = "";
        for (PCard i : deck.deck) {
            deckString += deck.deck.toString();
        }
        for (PCard i : deck.deck) {
            deckString2 += deck2.deck.toString();
        }
        assertNotEquals(deckString, deckString2);
    }

    @Test
    public void addCard() {
        Deck deck = new Deck();

        deck.addCard(new Cards(2, "♢"));
        Deck deck2 = new Deck();


        assertTrue(deck.cardCount() > deck2.cardCount());
    }

    @Test
    public void dealCard() {
        Deck deck = new Deck();
        deck.addCard(new Cards(2, "♢"));
        assertEquals(deck.deck.get(0), deck.dealCard());
    }

    @Test
    public void cardCount() {
        Deck deck = new Deck();

        assertEquals(0, deck.cardCount());
    }
    @Test
    public void cardCount1() {
        Deck deck = new Deck();

        assertNotEquals(1, deck.cardCount());
    }
    @Test
    public void fullCardCount() {
        Deck deck = new Deck();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart3 = new Cards(2, "\u2665");
        Cards heart4 = new Cards(3, "\u2665");
        Cards heart5 = new Cards(4, "\u2665");
        Cards heart6 = new Cards(5, "\u2665");
        Cards heart7 = new Cards(6, "\u2665");
        Cards heart8 = new Cards(7, "\u2665");
        Cards heart9 = new Cards(8, "\u2665");
        Cards heart10 = new Cards(9, "\u2665");
        Cards heart11 = new Cards(10, "\u2665");
        Cards heart12 = new Cards(10, "\u2665");
        Cards heart13 = new Cards(10, "\u2665");
        Cards heart14 = new Cards(10, "\u2665");
        Cards heart15 = new Cards(10, "\u2665");
        deck.addCard(heart1);
        deck.addCard(heart3);
        deck.addCard(heart4);
        deck.addCard(heart5);
        deck.addCard(heart6);
        deck.addCard(heart7);
        deck.addCard(heart8);
        deck.addCard(heart9);
        deck.addCard(heart10);
        deck.addCard(heart11);
        deck.addCard(heart12);
        deck.addCard(heart13);
        deck.addCard(heart14);
        deck.addCard(heart15);
        Cards spades1 = new Cards(1, "\u2664");
        Cards spades3 = new Cards(2, "\u2664");
        Cards spades4 = new Cards(3, "\u2664");
        Cards spades5 = new Cards(4, "\u2664");
        Cards spades6 = new Cards(5, " \u2664");
        Cards spades7 = new Cards(6, " \u2664");
        Cards spades8 = new Cards(7, "\u2664");
        Cards spades9 = new Cards(8, "\u2664");
        Cards spades10 = new Cards(9, "\u2664");
        Cards spades11 = new Cards(10, "\u2664");
        Cards spades12 = new Cards(10, "\u2664");
        Cards spades13 = new Cards(10, "\u2664");
        Cards spades14 = new Cards(10, "\u2664");
        Cards spades15 = new Cards(10, "\u2664");
        deck.addCard(spades1);
        deck.addCard(spades3);
        deck.addCard(spades4);
        deck.addCard(spades5);
        deck.addCard(spades6);
        deck.addCard(spades7);
        deck.addCard(spades8);
        deck.addCard(spades9);
        deck.addCard(spades10);
        deck.addCard(spades11);
        deck.addCard(spades12);
        deck.addCard(spades13);
        deck.addCard(spades14);
        deck.addCard(spades15);
        Cards clubs1 = new Cards(1, "\u2667");
        Cards clubs3 = new Cards(2, "\u2667");
        Cards clubs4 = new Cards(3, "\u2667");
        Cards clubs5 = new Cards(4, "\u2667");
        Cards clubs6 = new Cards(5, " \u2667");
        Cards clubs7 = new Cards(6, " \u2667");
        Cards clubs8 = new Cards(7, "\u2667");
        Cards clubs9 = new Cards(8, "\u2667");
        Cards clubs10 = new Cards(9, "\u2667");
        Cards clubs11 = new Cards(10, "\u2667");
        Cards clubs12 = new Cards(10, "\u2667");
        Cards clubs13 = new Cards(10, "\u2667");
        Cards clubs14 = new Cards(10, "\u2667");
        Cards clubs15 = new Cards(10, "\u2667");
        deck.addCard(clubs1);
        deck.addCard(clubs3);
        deck.addCard(clubs4);
        deck.addCard(clubs5);
        deck.addCard(clubs6);
        deck.addCard(clubs7);
        deck.addCard(clubs8);
        deck.addCard(clubs9);
        deck.addCard(clubs10);
        deck.addCard(clubs11);
        deck.addCard(clubs12);
        deck.addCard(clubs13);
        deck.addCard(clubs14);
        deck.addCard(clubs15);
        Cards diamonds1 = new Cards(1, "\u2662");
        Cards diamonds3 = new Cards(2, "\u2662");
        Cards diamonds4 = new Cards(3, "\u2662");
        Cards diamonds5 = new Cards(4, "\u2662");
        Cards diamonds6 = new Cards(5, " \u2662");
        Cards diamonds7 = new Cards(6, " \u2662");
        Cards diamonds8 = new Cards(7, "\u2662");
        Cards diamonds9 = new Cards(8, "\u2662");
        Cards diamonds10 = new Cards(9, "\u2662");
        Cards diamonds11 = new Cards(10, "\u2662");
        Cards diamonds12 = new Cards(10, "\u2662");
        Cards diamonds13 = new Cards(10, "\u2662");
        Cards diamonds14 = new Cards(10, "\u2662");
        Cards diamonds15 = new Cards(10, "\u2662");
        deck.addCard(diamonds1);
        deck.addCard(diamonds3);
        deck.addCard(diamonds4);
        deck.addCard(diamonds5);
        deck.addCard(diamonds6);
        deck.addCard(diamonds7);
        deck.addCard(diamonds8);
        deck.addCard(diamonds9);
        deck.addCard(diamonds10);
        deck.addCard(diamonds11);
        deck.addCard(diamonds12);
        deck.addCard(diamonds13);
        deck.addCard(diamonds14);
        deck.addCard(diamonds15);
        deck.addCard(heart1);
        deck.addCard(heart3);
        deck.addCard(heart4);

        assertEquals(59, deck.cardCount());

    }

    @Test
    public void dealCardRemove() {
        Deck deck = new Deck();
        deck.addCard(new Cards(2, "♢"));
        deck.dealCard();
        assertEquals( 0,deck.cardCount());
    }
}