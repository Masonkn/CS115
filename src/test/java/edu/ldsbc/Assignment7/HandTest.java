package edu.ldsbc.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {

    @Test
    public void getSize() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart3 = new Cards(2, "\u2665");
        Cards heart4 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart3);
        hand.addCard(heart4);
        assertEquals(3,hand.getSize());
    }

    @Test
    public void addCard() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart3 = new Cards(2, "\u2665");
        Cards heart4 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart3);
        hand.addCard(heart4);
        Hand hand2 = new Hand();
        assertNotEquals(hand,hand2);


    }

    @Test
    public void getCard() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart3 = new Cards(2, "\u2665");
        Cards heart4 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart3);
        hand.addCard(heart4);
        System.out.println(hand.getCard(0));
        assertEquals(heart1, hand.getCard(0));

    }

    @Test
    public void removeCard() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart3 = new Cards(2, "\u2665");
        Cards heart4 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart3);
        hand.addCard(heart4);
        Hand hand1 = new Hand();
        hand1.addCard(heart1);
        hand1.addCard(heart3);
        hand1.addCard(heart4);
        hand1.removeCard(0);
        assertNotEquals(hand.getSize(),hand1.getSize());
    }

    @Test
    public void getValueWhenEleven() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(11, "\u2665");
        Cards heart2 = new Cards(1,"\u2665");
        Cards heart3 = new Cards(1, "\u2665");
        Cards heart4 = new Cards(2, "\u2665");
        Cards heart5 = new Cards(3, "\u2665");
        Cards heart6 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart2);
        hand.addCard(heart3);
        hand.addCard(heart4);
        hand.addCard(heart5);
        hand.addCard(heart6);

        assertEquals(21,hand.getValue());

    }

    @Test
    public void getValueWhenAce() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart2 = new Cards(1,"\u2665");
        Cards heart3 = new Cards(1, "\u2665");
        Cards heart4 = new Cards(2, "\u2665");
        Cards heart5 = new Cards(3, "\u2665");
        Cards heart6 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart2);
        hand.addCard(heart3);
        hand.addCard(heart4);
        hand.addCard(heart5);
        hand.addCard(heart6);

        assertEquals(21,hand.getValue());

    }

    @Test
    public void getValueNotEquals() {
        Hand hand = new Hand();
        Cards heart1 = new Cards(1, "\u2665");
        Cards heart2 = new Cards(1,"\u2665");
        Cards heart3 = new Cards(1, "\u2665");
        Cards heart4 = new Cards(1, "\u2665");
        Cards heart5 = new Cards(3, "\u2665");
        Cards heart6 = new Cards(3, "\u2665");
        hand.addCard(heart1);
        hand.addCard(heart2);
        hand.addCard(heart3);
        hand.addCard(heart4);
        hand.addCard(heart5);
        hand.addCard(heart6);

        assertNotEquals(21,hand.getValue());

    }

    @Test
    public void findBestCardTotal() {
        Hand hand = new Hand();
        assertEquals(21,hand.findBestCardTotal(11));
    }
    @Test
    public void findBestCardTotal1() {
        Hand hand = new Hand();
        assertEquals(12,hand.findBestCardTotal(12));
    }
    @Test
    public void findBestCardTotal2() {
        Hand hand = new Hand();
        assertEquals(20,hand.findBestCardTotal(20));
    }
    @Test
    public void findBestCardTotal3() {
        Hand hand = new Hand();
        assertEquals(19,hand.findBestCardTotal(9));
    }
}