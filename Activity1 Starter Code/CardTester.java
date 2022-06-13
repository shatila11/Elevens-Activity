public class CardTester {

   public static void main(String[] args) {
       Card c1, c2, c3;
                c1 = new Card("Queen", "Spades", 10);
                c2 = new Card("Ace", "Hearts", 1);
                c3 = new Card("Queen", "Spades", 10);
                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
              
                if(c1.matches(c3))
                    System.out.println("c1 and c3 match");
                else
                    System.out.println("c1 and c3 match");
              
                if(c1.matches(c2))
                    System.out.println("c1 and c2 match");
                else
                    System.out.println("c1 and c2 match");
              
              
   }
}

