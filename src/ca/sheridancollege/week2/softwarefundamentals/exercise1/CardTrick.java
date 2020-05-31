/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be  used as starting code in ICE 1
 * @author Arashdeep Singh ID-991590967
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input=new Scanner(System.in);
        int userChoiceOfNumber=0;
        String userChoiceOfSuit="";
        for (int i=0; i<magicHand.length; i++)
        {
            int value;
            int suit;
            Card c = new Card();
            value=(int)Math.ceil(Math.random()*13);
            //c.setValue(insert call to random number generator here)
            c.setValue(value);
            suit=(int)Math.floor(Math.random()*4);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(c.SUITS[suit]);
            magicHand[i]=c;
            
            
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Guess any number from the deck of 52 cards."
                + "\nEnter card Suit here:");
        userChoiceOfSuit=input.next();
        System.out.println("Enter number of card.");
        userChoiceOfNumber=input.nextInt();
        
        // and search magicHand here
        boolean isWon=false;
        for(int i=0;i<magicHand.length;i++){
            if(magicHand[i].getValue()==userChoiceOfNumber&&
                    magicHand[i].getSuit().equalsIgnoreCase(userChoiceOfSuit)){
                isWon=true;
            }
            else isWon=false;
        }
        //Then report the result here
        if(isWon) System.out.println("Congrats! Your card is found in 'magicHand'");
        else System.out.println("Better luck next time.");
    }
    
}
