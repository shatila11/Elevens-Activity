public class Card {

   private String suit;
   private String rank;
   private int pointValue;


   public Card(String cardRank, String cardSuit, int cardPointValue) {
       rank = cardRank;
                suit = cardSuit;
                pointValue = cardPointValue;
   }
      
   public String suit() {
       return suit;
         }

   public String rank() {
       return rank;
   }

   public int pointValue() {
       return pointValue;
   }

   public boolean matches(Card otherCard) {
       if(suit == otherCard.suit() && rank == otherCard.rank() && pointValue == otherCard.pointValue())
                    return true;
                else
                    return false;                  
                 
   }

   public String toString() {
       return rank + " of " + suit + "(point value = " + pointValue + ")";
   }
}

