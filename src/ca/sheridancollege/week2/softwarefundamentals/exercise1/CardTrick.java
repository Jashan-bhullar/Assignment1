/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @modifier Deepanshu Mahajan
 * Student Number : 991588666
 * date modified : 31 May 2020
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random random = new Random();
            c.setValue(random.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(3)+1]);
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Diamonds");
        
        boolean result = false;
        for(int i = 0;i<magicHand.length;i++)
        {
            if(luckyCard.equals(magicHand[i]))
                result = true;
        }
        //Then report the result here
        if(result == true)
            System.out.println("You won");
        else
            System.out.println("You lost");
    }
    
}
