package wargame;

/* 
 * @author Noor-E-Maisah Ghannoo
 */
public class Card {
    
      boolean getCard() {
        return true;
      }

    boolean beats(Card c3extra) {
        return true;
    }

    boolean equalsForWar(Card c2) {
        if(this.value.compareTo(c2.value)==0)
            return true;
        return false; 
    }
     
        public static enum SUIT {SPADE,DIAMOND,CLUB,HEARTS}; 
        public static enum VALUE{ACE,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUEEN};
        private final SUIT suit; 
        private final VALUE value; 
        final public static String[] SUITS = {"SPADE","DIAMOND","CLUB","HEARTS"};
        final public static String[] VALUES = {"ACE", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN","JACK","KING","QUEEN"};
	     final public static int LIMIT = 10000;

     
     public Card(SUIT s, VALUE nVal) 
        {
           suit =s;
           value= nVal;
        }
   
     
 public VALUE getValue() {
  return this.value; 
 }
 
 public SUIT getSuit() {
  return this.suit;
        }
 public static SUIT getSuit(String x)//getter method to get suit
  {
     
     if(SUIT.CLUB.toString().compareTo(x)==0)
        return SUIT.CLUB;
     if(SUIT.SPADE.toString().compareTo(x)==0)
        return SUIT.SPADE;
     if(SUIT.HEARTS.toString().compareTo(x)==0)
        return SUIT.HEARTS;
     if(SUIT.DIAMOND.toString().compareTo(x)==0)
        return SUIT.DIAMOND;
     
     return null;
 }
 
  public static VALUE getValue(String x)//getter method to get value
   {
     
     if(VALUE.ACE.toString().compareTo(x)==0)
        return VALUE.ACE;
     if(VALUE.ONE.toString().compareTo(x)==0)
        return VALUE.ONE;
     if(VALUE.TWO.toString().compareTo(x)==0)
        return VALUE.TWO;
     if(VALUE.THREE.toString().compareTo(x)==0)
        return VALUE.THREE;
     if(VALUE.FOUR.toString().compareTo(x)==0)
        return VALUE.FOUR;
     if(VALUE.FIVE.toString().compareTo(x)==0)
        return VALUE.FIVE;
     if(VALUE.SIX.toString().compareTo(x)==0)
        return VALUE.SIX;
     if(VALUE.SEVEN.toString().compareTo(x)==0)
        return VALUE.SEVEN;
     if(VALUE.EIGHT.toString().compareTo(x)==0)
        return VALUE.EIGHT;
     if(VALUE.NINE.toString().compareTo(x)==0)
        return VALUE.NINE;
     if(VALUE.TEN.toString().compareTo(x)==0)
        return VALUE.TEN;
     if(VALUE.JACK.toString().compareTo(x)==0)
        return VALUE.JACK;
     if(VALUE.QUEEN.toString().compareTo(x)==0)
        return VALUE.QUEEN;
     if(VALUE.KING.toString().compareTo(x)==0)
        return VALUE.KING;
     
     return null;
 }
 
 public static String getStringSuit(SUIT x){
     return x.name();
 }
 
 public String toString(){
     return this.suit.toString();
 }
    
}
