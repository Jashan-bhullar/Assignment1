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
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckCard.setSuit("Hearts");
        Card[] magicHand = new Card[7];

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.ceil(Math.random() * 13)));
            c.setSuit(Card.SUITS[(int)(Math.floor(Math.random() * 4))]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        loop: while(true) {
            System.out.println("Enter card's value: ");
            cardValue = input.nextInt();
            switch(cardValue) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break loop;
                default:
            }
        }

        loop2: while(true) {
            System.out.println("Enter card suit: ");
            cardSuit = input.nextInt();
            switch (cardSuit) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break loop2;
            }
        }


        //Then report the result here
        if (cardSearching(cardValue, cardSuit, magicHand)) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand");
        }
    }

    private static boolean cardSearching(int cValue, int cSuit, Card[] arr) {
        for (Card  c : arr) {
            if(c.getValue() == cValue && c.getSuit() == Card.SUITS[cSuit]) {
                return true;
            }
        }
        return false;
    }
}
