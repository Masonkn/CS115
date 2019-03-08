package edu.ldsbc.Assignment7;


public class Cards extends PCard {

    private int rank;
    private String suit;

    Cards(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank() {
        return this.rank;
    }

    public String getText() {
        return rank+suit;
    }


}
