/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Random;
import java.util.Scanner;

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
            Random r = new Random();
            Card c = new Card();
                        
            //c.setValue(insert call to random number generator here)
            c.setValue(r.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(c.SUITS[r.nextInt(4)]);
            magicHand[i]=c;
        }
        
        /*
        //insert code to ask the user for Card value and suit, create their card
        Card user = new Card();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 1 to 13: ");
        user.setValue(input.nextInt());
        System.out.print("Enter Suits value (Hearts, Diamonds, Spades, Clubs )");
        user.setSuit(input.next());
        */
        
        //hard-coded user Card
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Diamonds");
        
        for(int i=0;i<7;i++)
        {
            System.out.println(magicHand[i].getValue() + "    " + magicHand[i].getSuit());
        }
        
        // and search magicHand here
        int i=0,checksum=0;
        while(i<7)
        {
            if(magicHand[i].getValue() == luckyCard.getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
            {
                checksum = 1;
                break;
            }
            i++;
        }
        
        //Then report the result here
        if(checksum==1)
        {
            System.out.println("Congratulations! Your Card is in Magic Hand.");
        }
        else
        {
            System.out.println("Sorry! Your Card is not in Magic Hand.");
        }
    }
    
}
