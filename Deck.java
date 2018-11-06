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
    public List<TrainCard> trainCards;       // Array of TrainCards
    protected List<DestinationCard> destinationCardDeck;
    public Card[] summaryCard;
    public Card longContinuousCard;
    private int cardsUsed = 108;
    protected String longCard;

    
    public Deck() {
        trainCards = new ArrayList<TrainCard>();        
        longContinuousCard = new Card(10, longCard);
        destinationCardDeck = new ArrayList<DestinationCard>();
        
    }
    
    public String getTrainColorString(int value) {
            // Return a String representing the card''s color
           
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
    
    public TrainCard drawTrainCard(){            //Draw's TrainCards
        int lastIndex = trainCards.size() - 1;
        TrainCard result;
        if (lastIndex < 0) {
            return null;
        }
        result = trainCards.get(lastIndex);
        trainCards.remove(lastIndex);
        return result;
    }
    
    public DestinationCard drawDestinationCard(){            //Draw's TrainCards
        int lastIndex = destinationCardDeck.size() - 1;
        DestinationCard result;
        if (lastIndex < 0) {
            return null;
        }
        result = destinationCardDeck.get(lastIndex);
        destinationCardDeck.remove(lastIndex);
        return result;
    }
    
    public void shuffleTrainCards() { // Shuffles deck for Train Cards
        Collections.shuffle(trainCards);
    }
    
     public void shuffleDestinationCards() { // Shuffles deck for Train Cards
        Collections.shuffle(destinationCardDeck);
    }
    
    public void summaryCard() {
        System.out.println("1 train = 1 point");
        System.out.println("2 trains = 2 points");
        System.out.println("3 trains = 4 points");
        System.out.println("4 trains = 7 points");
        System.out.println("5 trains = 10 points");
        System.out.println("6 trains = 15 points");
    }
    
}
