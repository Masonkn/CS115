package edu.ldsbc.Assignment7;


public class main {
    public static void main(String[] args) {

        Deck deck = new Deck();


        //HEARTS
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
        Cards spades1 = new Cards(1,"\u2664");
        Cards spades3 = new Cards(2,"\u2664");
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
        Cards clubs1 = new Cards(1,"\u2667");
        Cards clubs3 = new Cards(2,"\u2667");
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
        Cards diamonds1 = new Cards(1,"\u2662");
        Cards diamonds3 = new Cards(2,"\u2662");
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


        HandTest.run(deck,new Hand());
//        hand.addCard(diamonds1);
//        hand.addCard(clubs1);
//        hand.addCard(heart1);
//        hand.addCard(spades1);
//        hand.addCard(diamonds3);
//        hand.addCard(clubs3);
//        hand.addCard(diamonds3);
//        System.out.println(hand.getValue());
//        System.out.println(diamonds1.getRank());
//        hand.getValue();
//        System.out.println(deck.cardCount());

//        DeckTest.run(deck);

    }
}
