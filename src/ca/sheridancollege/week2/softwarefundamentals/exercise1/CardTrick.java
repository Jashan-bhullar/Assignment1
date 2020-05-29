/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Manveet  ID- 991590866
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int)Math.random()*4]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
        
        }
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Diamonds");
      
        
        String result="";
        for(int i=0;i<magicHand.length;i++)
        {
           if((luckyCard.getValue()==magicHand[i].getValue)&&(luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit)))
                   {
                       result=" you won"; 
                   }
           else
                  {
                    result="oops! you loose";
                  }
           
        }
            System.out.println("Your result= "+result);
                   
      // and search magicHand here
                //Then report the result here 
    }
    
}
