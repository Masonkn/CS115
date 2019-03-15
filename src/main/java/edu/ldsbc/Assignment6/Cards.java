package edu.ldsbc.Assignment6;



public class Cards extends PCard{

    private String rank;
    private String suit;

    Cards(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getText() {
        return rank+suit;
    }


}
