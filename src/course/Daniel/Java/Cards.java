package course.Daniel.Java;

/**
 * Created by Jakars on 21/02/2017.
 */
public class Cards {
    String suit;
    String rank;

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    int getvalue (String rank){

//        switch (rank){
//            case "Ace":
//                return 11;
//            case "King":
//            case "Queen":
//            case "Jack":
//                return 10;
//            default:
//                return Integer.valueOf(rank);
//        }

        if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")){
            return  10;
        }
        else if (rank.equals("Ace")){
            return  11;
        }
        else {
            return Integer.valueOf(rank);
        }

    }

    String getSuit (){
        return suit;
    }

    String getRank (){
        return rank;
    }

    String getDetails (){
        String details = rank + " of " + suit;
        return details;
    }
}
