package edu.ldsbc.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardsTest {

    @Test
    public void getRank() {
        Cards hearts1 = new Cards(1, "\u2665");
        assertEquals(1,hearts1.getRank());
    }

    @Test
    public void getText() {
        Cards hearts1 = new Cards(1, "\u2665");
        assertEquals(1+"\u2665", hearts1.getText());
    }
}