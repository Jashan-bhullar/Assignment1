d/*
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
          //c.setValue(insert call to random number generator here)
            c.setValue((int)(1+Math.random()*13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
             magicHand[i]=c;
             
             System.out.println("Value="+magicHand[i].getValue()+" and suit="+magicHand[i].getSuit());
        }
     
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the card value and suit");
        int value=sc.nextInt();
        String suit=sc.next();
        
        int temp=0;
        
        Card c=new Card();
        c.setValue(value);
        c.setSuit(suit);
     
        String result=" ";
        for(int i=0;i<magicHand.length;i++)
        {
        // and search magicHand here
            if(value==magicHand[i].getValue()&&suit.equalsIgnoreCase(magicHand[i].getSuit()))
            {
                result="You have got a magic hand.";
                temp=1;
                break;
            }
        }
            if(temp==0)
            {
                result="You didn't get the magic hand.";
            }
          //Then report the result here
        System.out.println(result);  
            
        
        
        
    }
    
}
