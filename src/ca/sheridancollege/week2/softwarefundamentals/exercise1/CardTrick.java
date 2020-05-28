/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Meetkumar Rachhadia - 991587874
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue((int) (Math.random() * (13) + 1));
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
//         Scanner in = new Scanner(System.in);
        
//         Card userCard = new Card();
        
//         System.out.println("Enter your guess value(1-13) and suit( Hearts, Diamonds, Clubs, Spades):");
//         int guessValue = in.nextInt();
//         userCard.setValue(guessValue);
//         String guessSuit = in.next();
//         userCard.setSuit(guessSuit);
         boolean report = false;
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Spades");
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                report = true;
                break;
            }
        }
        
        //Then report the result here
        System.out.println("The user won: " + report);
        
    }
    
}
