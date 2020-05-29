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
         
         Card luckyCard = new Card();
         luckyCard.setValue(12);
         luckyCard.setSuit("Hearts");
         System.out.println("Your card is " +luckyCard.getValue()+ " of " +luckyCard.getSuit());
      

        // and search magicHand here
        boolean result =false;
        for( int i=0; i<magicHand.length;i++){

            if( luckyCard.getValue() == magicHand[i].getValue() &&  luckyCard.getSuit().equals(magicHand[i].getSuit())){
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
            System.out.println("\nUhhh ohhh You Lose!!! Card didnt matched");
        }
        
        
    }


}
