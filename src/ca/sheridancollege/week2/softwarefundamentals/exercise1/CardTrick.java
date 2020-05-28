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
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int)Math.random()*4]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
        
        }
        
        
        System.out.println("enter the suit");//insert code to ask the user for Card value and suit, create their card
        String suit= sc.nextLine();
        System.out.println("enter the value");
        int value=sc.nextInt();
        
        String result="";
        for(int i=0;i<magicHand.length;i++)
        {
           if((magicHand[i].getValue()==value)&&(magicHand[i].getSuit().equals(suit)))
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
