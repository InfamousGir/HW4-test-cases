/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg4;

/**
 *
 * @author Alejandro
 */
public class DestinationCard {
    int destinationCardID;
    
    //creating array for all destinaiton cards provided on website
    //First array will be string city string
    String[] cityStrings = new String[]{"Los Angeles to New York City", "Duluth to Houston",
        "Sault St Marie to Nashville", "New York to Atlanta", "Portland to Nashville",
        "Vancouver to Montreal", "Duluth to El Paso", "Toronto to Miami", "Portland to Phoenix",
        "Dallas to New York City", "Calgary to Salt Lake City", "Calgary to Phoenix",
        "Los Angeles to Miami", "Winnipeg to Little Rock", "San Francisco to Atlanta",
        "Kansas City to Houston", "Los Angeles to Chicago", "Denver to Pittsburgh", 
        "Chicago to Santa Fe", "Vancouver to Santa Fe", "Boston to Miami",
        "Chicago to New Orleans", "Montreal to Atlanta", "Seattle to New York",
        "Denver to El Paso", "Helena to Los Angeles", "Winnipeg to Houston",
        "Montreal to New Orleans", "Sault St Marie to Oklahoma City", "Seattle to Los Angeles"
    };
    
    //values of the cards
    int[] destValue = {21, 8, 8, 6, 17, 20, 10, 10, 11, 11, 7, 13, 20, 11, 17, 5, 16, 11, 9, 13,
        12, 7, 9, 22, 4, 8, 12, 13, 9, 9
    };
    //one array to check if they are taken 
    //0 = free 1 taken
    int[] destinationCheck;
    
    //default constructor
    DestinationCard(){
        destinationCheck = new int[30];
    }
    
    public int giveDestinationCard(){
        
        destinationCardID = (int) (Math.random() * 30);
        boolean marker = false;
        
        while(marker){
        if(destinationCheck[destinationCardID] == 1){
        destinationCardID++;
        }
        marker = true;
        }
        //gives marker to used
        destinationCheck[destinationCardID] = 1;
        return destinationCardID;
    }
    
    
    //getters
    public String getDestCardInfo(int d){
        return cityStrings[d];
    }
    
    public int getDestCardValue(int d){
        return destValue[d];
    }
    
}
