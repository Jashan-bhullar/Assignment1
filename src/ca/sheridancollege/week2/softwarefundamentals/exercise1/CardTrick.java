/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Modifier:Gurleen kaur
* Student Number:991585904
*username:kaur8521
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {  
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Card value :");
        int val2=s.nextInt();
        System.out.println("Enter Suit value between 0-3 :");
        int suitVal2=s.nextInt();
        //insert code to ask the user for Card value and suit, create their card6
        
        
        Card[] magicHand = new Card[7];
                
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
        int val1=(int)(Math.random()*10);
           c.setValue(val1);
            System.out.println(val1);
           //c.setValue(insert call to random number generator here)
        int max = 3; 
        int min = 0; 
        int range = max - min + 1; 
        for (int j = 1; j <=1 ; j++) { 
            int suitsVal1 = (int)(Math.random() * range) + min; 
  
           c.setSuit(Card.SUITS[suitsVal1]);
        System.out.println(Card.SUITS[suitsVal1]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        magicHand[i]=c;
         }
        
         //add a (hard-coded) Card Object called luckyCard with a number and suit of your choosing.

        Card luckyCard =new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Diamonds");
        boolean cardLuck=false;
        //search magicHand card
        for(int i=0 ; i <magicHand.length ; i++){
        if((luckyCard.getValue()==magicHand[i].getValue()) &&(luckyCard.getSuit().equals(magicHand[i].getSuit())))
        {
            cardLuck=true;}
        else  {  
                 cardLuck=false;}
            
        }
        if(cardLuck=false)
            System.out.println("You have got a LUCKY CARD!!");
        else
            System.out.println("Better luck next tym dear!!");
    } 
}
