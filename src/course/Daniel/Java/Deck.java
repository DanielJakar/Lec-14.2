package course.Daniel.Java;

import java.util.ArrayList;

/**
 * Created by Jakars on 21/02/2017.
 */
public class Deck {
//    ♥ ♦ ♣ ♠

    ArrayList<Cards> deck = new ArrayList<>();

    String[] suits = {"♥", "♦", "♣", "♠"};
    String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    Deck (){
        for (String card : cards) {
            for (String suit : suits) {
                Cards c = new Cards(suit, card);
                deck.add(c);
            }
        }
    }
}
