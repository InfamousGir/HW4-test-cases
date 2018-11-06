/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.List;

/**
 *
 * @author BAEtesting
 */
public class TrainCard {
    public int value;
    public String color;
    public List<TrainCard> trainCards;
    

    public TrainCard(int v, String c){
    for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                trainCards.add(new TrainCard(j, getTrainColorString(i)));
            }
        }
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
    
    public String toString(TrainCard tc){
        return tc.color;
    }
}
