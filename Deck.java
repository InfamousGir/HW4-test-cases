/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author BAEtesting
 */
public class Deck {
    public Card[] destinationCards;
    public Card[] trainCards;
    public Card[] summaryCard;
    public Card[] longContinuousCard;
    
    private int cardsUsed = 108;

    
    public Deck() {
        trainCards = new Card[108];
        int tC = 0;
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                trainCards[tC] = new Card(j, getTrainColorString(i));
            }
        }
        
   
   
        
        summaryCard = new Card[1];
        longContinuousCard = new Card[1];
    }
    
    public String getTrainColorString(int value) {
            // Return a String representing the card's value.
            // If the card's value is invalid, "??" is returned.
        switch ( value ) {
           case 1:   return "PURPLE";
           case 2:   return "WHITE";
           case 3:   return "BLUE";
           case 4:   return "YELLOW";
           case 5:   return "ORANGE";
           case 6:   return "BLACK";
           case 7:   return "RED";
           case 8:   return "GREEN";
           case 0:   return "LOCOMOTIVE";
           default:  return "??";
        }
    }
    
   
    
    public Card drawTrainCard(){
        if (cardsUsed == 108)
           shuffleTrainCards();
        cardsUsed++;
        return trainCards[cardsUsed - 1];
    }
    
    public void shuffleTrainCards() {
        for ( int i = 108; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = trainCards[i];
            trainCards[i] = trainCards[rand];
            trainCards[rand] = temp;
        }
    }
    
    
}



