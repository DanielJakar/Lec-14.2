package course.Daniel.Java;

import java.util.ArrayList;

/**
 * Created by Jakars on 21/02/2017.
 */
public class Hand {
    //properties:
    ArrayList<Cards> deck = new ArrayList<>();

    public void addcard (Cards c){
        deck.add(c);

    }

    public int getvalue (){
        int value = 0;
        int aceCount = 0;

        for (Cards cards : deck) {
            value += cards.getvalue();
            if (cards.getvalue() == 11)
                aceCount++;

        }
        while (value > 21 && aceCount > 0){
            value -= 10;
            aceCount--;
        }

        return value;
    }


    //Actions:

    // void addCard(Deck c)...

    //int getValue - value of the cards
    //first count the whole hand, count the aces.
    //
    // while(we have aces, and busted)
    // subtract 10 for aces (and aceCount--)
    //
    // ArrayList<Cards> getCards().
}
