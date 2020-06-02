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
 * @author Trung Tran
 * Student ID: 991536629
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int cardValue, cardSuit;

        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.ceil(Math.random() * 13)));
            c.setSuit(Card.SUITS[(int)(Math.floor(Math.random() * 4))]);
            magicHand[i] = c;
        }



        //Then report the result here
        if (cardSearching(luckyCard.getValue(), luckyCard.getSuit(), magicHand)) {
            System.out.println("You are one of lucky card owner!");
        } else {
            System.out.println("Sorry but yu are not one of the lucky card owner");
        }
    }

    private static boolean cardSearching(int cValue, String cSuit, Card[] arr) {
        for (Card  c : arr) {
            if(c.getValue() == cValue && c.getSuit() == cSuit) {
                return true;
            }
        }
        return false;
    }
}
