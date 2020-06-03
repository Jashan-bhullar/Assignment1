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
 * shivam pratap singh 991585145
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * (13) + 1));
            int temp = (int)(Math.random()*4);
            c.setSuit(c.SUITS[temp]);
            magicHand[i] = c;
        }
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("enter a number between 1 to 9");
         int num = input.nextInt();
         if(num>9)System.out.println("incorrect number entered");
         System.out.println("enter the suitname");
         String suitname = input.next();
         
         
        Card luckyCard = new Card();
        luckyCard.setValue(num);
        luckyCard.setSuit(suitname);
        int flag = 0;
        for(int i=0;i<7;i++)
        {
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
            }
        
for(int i=0;i<7;i++){
    if(luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()) && luckyCard.getValue() == magicHand[i].getValue())
    {
        System.out.println("Congratulations, User's card is in the magic hand!!");
    flag = 1;
    break;
    }
    if(flag == 0)
    {
        System.out.println("sorry,User's card is not in the magic hand!!");
    }

}
    }
}
        
        
   

            
        
        
       
    
    

