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
 * @author dancye
 * @modifier Aishpreet kaur - 991585548
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
            magicHand[i] = c;
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        
        Card userCard = new Card();
        
        System.out.println("Enter Card value and suit.");
        int newvalue = input.nextInt();
        userCard.setValue(newvalue);
        String newsuit = input.next();
        userCard.setSuit(newsuit);
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Diamond");
        
        // and search magicHand here
        String report = " ";
        for(int i =0; i<magicHand.length; i++)
        {
           if((luckyCard.getValue()==magicHand[i].getValue())&&(luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
              {
                  report = "WIN!!luckycard found";
              }
              else
              {
                  report = "loss!! different Card";
              }
        }
           
        //Then report the result here
              System.out.println("Report : " + report);
    }
    

   

   
    
}
