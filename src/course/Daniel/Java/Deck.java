package course.Daniel.Java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jakars on 21/02/2017.
 */
public class Deck {
//    ♥ ♦ ♣ ♠

    ArrayList<Cards> deck = new ArrayList<>();


    public Deck() {
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


        for (String suit : suits) {
            for (String card : cards) {
                Cards c = new Cards(suit, card);
                deck.add(c);
            }
        }


    }
    public void shuffle(){
        ArrayList<Cards> temp = new ArrayList<>();
//        for (int i = deck.size() - 1; i > 0; i--) {
//            int index = RandomUtils.nextRandom(0,i);
//            temp.add(deck.remove(index));
//        }
        Random r = new Random();

        while (deck.size() > 0){
            temp.add(deck.remove(r.nextInt(deck.size())));
        }
        deck = temp;
    }
    public Cards draw (){
        return deck.remove(0);
    }

    public boolean isEmpty (){
        return deck.isEmpty();
    }

    public ArrayList<Cards> getDeck() {
        return deck;
    }
}
