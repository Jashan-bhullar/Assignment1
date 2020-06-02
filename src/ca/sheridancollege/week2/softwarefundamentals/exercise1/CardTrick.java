/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Nyas Syal - 991589997
 */
public class CardTrick {
    
    public static void main(String[] args) // main method
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(1+Math.random()*13)); //randomly taking values for card value and suit
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            magicHand[i]=c;
         System.out.println(magicHand[i].getValue());
        System.out.println(magicHand[i].getSuit());
            
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(3); // hardcoding the value and the suit of the luckycard 
        luckyCard.setSuit("Hearts");
        
        for(int i=0; i<magicHand.length; i++){//searching magicHand
        if((luckyCard.getValue()== magicHand[i].getValue())&&(luckyCard.getSuit().equals(magicHand[i].getSuit()))){  
        System.out.println("You Win!");{ //ouput
        }
        else{
        System.out.println("You Lose.");
        }
        }
        /*String input = JOptionPane.showInputDialog("Enter the Card Value"); //code to ask the user for Card value and suit, create their card
        int i1 = Integer.parseInt(input);
        
        String input2 = JOptionPane.showInputDialog("Enter the suit value here");
        for(int i=0; i<magicHand.length; i++){  //searching magicHand
            if(i1==magicHand[i].getValue()&&input2.equals(magicHand[i].getSuit())){ //ouput
            System.out.println("You Win!");
            }
            else{
            System.out.println("You Lose");
            }*/
        
        
       
    }
    
}
