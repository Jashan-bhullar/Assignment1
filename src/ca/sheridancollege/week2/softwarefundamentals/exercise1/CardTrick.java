/*Harleen kaur
  student number-991591116
*/
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
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue((int)((Math.random()*13)+1)); 

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             c.setSuit(Card.SUITS[(int)(Math.random()*4)]);

            magicHand[i] = c;  //stroring object to array
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card Number from 1-13");
        int card= input.nextInt();

        System.out.println("\nEnter the number against suit you want to select: \n1.Hearts \n2.Diamonds \n3.Spades \n4.Clubs\n");
        int suit = input.nextInt();

        // and search magicHand here
        boolean result =false;
        for( int i=0; i<magicHand.length;i++){

            if(card == magicHand[i].getValue() && Card.SUITS[suit-1].equals(magicHand[i].getSuit())){
                result=true;
                break;
            }
            else{
                result=false;
            }       
        }

        //Then report the result here
        if(result){
         System.out.println("\nHurraah !!  you won Card matched ");
        }
        else{
            System.out.println("\nuhhh ohhh YOu Lose!!! Card didnt matched");
        }
        
        
    }


}
