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
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Archanaben Patel -- Student ID: 991590505
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)((Math.random()*13)+1));
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);
        
        //insert code to ask the user for Card value and suit, create their card
        
        System.out.println("Welcome to Card guessing game!");
        System.out.println("\nGuess the card number - 1 to 13");
        int guessValue = input.nextInt();
        
        System.out.println("\nGuess the suit of card - Spades, Diamonds, Clubs, Hearts");
        String guessSuit = input.next();
        
        Card guess = new Card();
        
        guess.setValue(guessValue);
        
        guess.setSuit(guessSuit);
        
        
        // and search magicHand here
        int guessCard = 0;
        for(int i=0;i<magicHand.length;i++)
        {
            if((guess.getValue() == magicHand[i].getValue()) && 
                    (guess.getSuit().equalsIgnoreCase(magicHand[i].getSuit())))
            {
                guessCard=1;
                System.out.println("\nyes! Your card is in Magic cards");
                break;
            }
            
        }
        if(guessCard == 0)
        {
            System.out.println("\nno! Your card is not in Magic cards");
        }
        //Then report the result here
    }
    
}
