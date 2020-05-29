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
 * @author dancye
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
       
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;//c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
       card luckycard= new card();
        luckycard.setValue(8);
        luckycard.setSuit("Clubs");
        

        String guess="";
        
        for(int i=0;i<magicHand.length-1;i++)
        {
           if((luckycard.getValue()==magicHand[i].getValue())&&(luckycard.getsuit().equalsIgnoreCase(magicHand[i].getSuit())))
                   {
                        guess="you win";
                   }
           else
                  {
               guess="you loose";
               
                  }           
        }
         System.out.println("report="+guess);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
