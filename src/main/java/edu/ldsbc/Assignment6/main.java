package edu.ldsbc.Assignment6;




public class main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        //HEARTS
        Cards heart1 = new Cards("A","\u2665");
        Cards heart3 = new Cards("2","\u2665");
        Cards heart4 = new Cards("3", "\u2665");
        Cards heart5 = new Cards("4", "\u2665");
        Cards heart6 = new Cards("5", " \u2665");
        Cards heart7 = new Cards("6", " \u2665");
        Cards heart8 = new Cards("7", "\u2665");
        Cards heart9 = new Cards("8", "\u2665");
        Cards heart10 = new Cards("9", "\u2665");
        Cards heart11 = new Cards("10", "\u2665");
        Cards heart12 = new Cards("J", "\u2665");
        Cards heart13 = new Cards("Kn", "\u2665");
        Cards heart14 = new Cards("Q", "\u2665");
        Cards heart15 = new Cards("K", "\u2665");
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
        Cards spades1 = new Cards("A","\u2664");
        Cards spades3 = new Cards("2","\u2664");
        Cards spades4 = new Cards("3", "\u2664");
        Cards spades5 = new Cards("4", "\u2664");
        Cards spades6 = new Cards("5", " \u2664");
        Cards spades7 = new Cards("6", " \u2664");
        Cards spades8 = new Cards("7", "\u2664");
        Cards spades9 = new Cards("8", "\u2664");
        Cards spades10 = new Cards("9", "\u2664");
        Cards spades11 = new Cards("10", "\u2664");
        Cards spades12 = new Cards("J", "\u2664");
        Cards spades13 = new Cards("Kn", "\u2664");
        Cards spades14 = new Cards("Q", "\u2664");
        Cards spades15 = new Cards("K", "\u2664");
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
        Cards clubs1 = new Cards("A","\u2667");
//        Cards clubs2 = new Cards("1","\u2667");
        Cards clubs3 = new Cards("2","\u2667");
        Cards clubs4 = new Cards("3", "\u2667");
        Cards clubs5 = new Cards("4", "\u2667");
        Cards clubs6 = new Cards("5", " \u2667");
        Cards clubs7 = new Cards("6", " \u2667");
        Cards clubs8 = new Cards("7", "\u2667");
        Cards clubs9 = new Cards("8", "\u2667");
        Cards clubs10 = new Cards("9", "\u2667");
        Cards clubs11 = new Cards("10", "\u2667");
        Cards clubs12 = new Cards("J", "\u2667");
        Cards clubs13 = new Cards("Kn", "\u2667");
        Cards clubs14 = new Cards("Q", "\u2667");
        Cards clubs15 = new Cards("K", "\u2667");
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
        Cards diamonds1 = new Cards("A","\u2662");
        Cards diamonds3 = new Cards("2","\u2662");
        Cards diamonds4 = new Cards("3", "\u2662");
        Cards diamonds5 = new Cards("4", "\u2662");
        Cards diamonds6 = new Cards("5", " \u2662");
        Cards diamonds7 = new Cards("6", " \u2662");
        Cards diamonds8 = new Cards("7", "\u2662");
        Cards diamonds9 = new Cards("8", "\u2662");
        Cards diamonds10 = new Cards("9", "\u2662");
        Cards diamonds11 = new Cards("10", "\u2662");
        Cards diamonds12 = new Cards("J", "\u2662");
        Cards diamonds13 = new Cards("Kn", "\u2662");
        Cards diamonds14 = new Cards("Q", "\u2662");
        Cards diamonds15 = new Cards("K", "\u2662");
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
        System.out.println(deck.cardCount());

        DeckTest.run(deck);

//        CardTest.run(heart1);
//        CardTest.run(heart2);
//        CardTest.run(heart3);
//        CardTest.run(heart4);
//        CardTest.run(heart5);
//        CardTest.run(heart6);
//        CardTest.run(heart7);
//        CardTest.run(heart8);
//        CardTest.run(heart9);
//        CardTest.run(heart10);
//        CardTest.run(heart11);
//        CardTest.run(heart12);
//        CardTest.run(heart13);
//        CardTest.run(heart14);
//        CardTest.run(heart15);
//
//        SPADES
//        Cards spades1 = new Cards("A","\u2664");
//        Cards spades2 = new Cards("1","\u2664");
//        Cards spades3 = new Cards("2","\u2664");
//        Cards spades4 = new Cards("3", "\u2664");
//        Cards spades5 = new Cards("4", "\u2664");
//        Cards spades6 = new Cards("5", " \u2664");
//        Cards spades7 = new Cards("6", " \u2664");
//        Cards spades8 = new Cards("7", "\u2664");
//        Cards spades9 = new Cards("8", "\u2664");
//        Cards spades10 = new Cards("9", "\u2664");
//        Cards spades11 = new Cards("10", "\u2664");
//        Cards spades12 = new Cards("J", "\u2664");
//        Cards spades13 = new Cards("Kn", "\u2664");
//        Cards spades14 = new Cards("Q", "\u2664");
//        Cards spades15 = new Cards("K", "\u2664");
//        CardTest.run(spades1);
//        CardTest.run(spades2);
//        CardTest.run(spades3);
//        CardTest.run(spades4);
//        CardTest.run(spades5);
//        CardTest.run(spades6);
//        CardTest.run(spades7);
//        CardTest.run(spades8);
//        CardTest.run(spades9);
//        CardTest.run(spades10);
//        CardTest.run(spades11);
//        CardTest.run(spades12);
//        CardTest.run(spades13);
//        CardTest.run(spades14);
//        CardTest.run(spades15);
//
// CLUBS
//        Cards clubs1 = new Cards("A","\u2667");
//        Cards clubs2 = new Cards("1","\u2667");
//        Cards clubs3 = new Cards("2","\u2667");
//        Cards clubs4 = new Cards("3", "\u2667");
//        Cards clubs5 = new Cards("4", "\u2667");
//        Cards clubs6 = new Cards("5", " \u2667");
//        Cards clubs7 = new Cards("6", " \u2667");
//        Cards clubs8 = new Cards("7", "\u2667");
//        Cards clubs9 = new Cards("8", "\u2667");
//        Cards clubs10 = new Cards("9", "\u2667");
//        Cards clubs11 = new Cards("10", "\u2667");
//        Cards clubs12 = new Cards("J", "\u2667");
//        Cards clubs13 = new Cards("Kn", "\u2667");
//        Cards clubs14 = new Cards("Q", "\u2667");
//        Cards clubs15 = new Cards("K", "\u2667");
//        CardTest.run(clubs1);
//        CardTest.run(clubs2);
//        CardTest.run(clubs3);
//        CardTest.run(clubs4);
//        CardTest.run(clubs5);
//        CardTest.run(clubs6);
//        CardTest.run(clubs7);
//        CardTest.run(clubs8);
//        CardTest.run(clubs9);
//        CardTest.run(clubs10);
//        CardTest.run(clubs11);
//        CardTest.run(clubs12);
//        CardTest.run(clubs13);
//        CardTest.run(clubs14);
//        CardTest.run(clubs15);
//
//        DIAMONDS
//        Cards diamonds1 = new Cards("A","\u2662");
//        Cards diamonds2 = new Cards("1","\u2662");
//        Cards diamonds3 = new Cards("2","\u2662");
//        Cards diamonds4 = new Cards("3", "\u2662");
//        Cards diamonds5 = new Cards("4", "\u2662");
//        Cards diamonds6 = new Cards("5", " \u2662");
//        Cards diamonds7 = new Cards("6", " \u2662");
//        Cards diamonds8 = new Cards("7", "\u2662");
//        Cards diamonds9 = new Cards("8", "\u2662");
//        Cards diamonds10 = new Cards("9", "\u2662");
//        Cards diamonds11 = new Cards("10", "\u2662");
//        Cards diamonds12 = new Cards("J", "\u2662");
//        Cards diamonds13 = new Cards("Kn", "\u2662");
//        Cards diamonds14 = new Cards("Q", "\u2662");
//        Cards diamonds15 = new Cards("K", "\u2662");
//        CardTest.run(diamonds1);
//        CardTest.run(diamonds2);
//        CardTest.run(diamonds3);
//        CardTest.run(diamonds4);
//        CardTest.run(diamonds5);
//        CardTest.run(diamonds6);
//        CardTest.run(diamonds7);
//        CardTest.run(diamonds8);
//        CardTest.run(diamonds9);
//        CardTest.run(diamonds10);
//        CardTest.run(diamonds11);
//        CardTest.run(diamonds12);
//        CardTest.run(diamonds13);
//        CardTest.run(diamonds14);
//        CardTest.run(diamonds15);
    }
}
