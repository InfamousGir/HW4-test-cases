/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg4;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alejandro
 */
public class Player {
    //Not sure if an array or tokens for players will be used.
    //five players
    private String name;
    
    //player class card for hand
    public ArrayList<Card> hand;
    
    //Array for board destination cards
    public ArrayList<DestinationCard> destCards;
    
    //Colors for trains blue, red, green, yellow, and black
    public static final String PURPLE = "Purple";
    public static final String BLUE = "Blue";
    public static final String ORANGE = "Orange";
    public static final String WHITE = "White";
    public static final String GREEN = "Green";
    public static final String YELLOW = "Yellow";
    public static final String BLACK = "Black";
    public static final String RED = "Red";
    public static final String LOCOMOTIVE = "Locomotive";
    
    //Enum for colors
    enum Color{
        PURPLE, BLUE, ORANGE, WHITE, GREEN, YELLOW, BLACK, RED, LOCOMOTIVE;
    }
    
    
    //setting up Player attributes playerMarker will be used to identify color
    private String playerMarker;
    private int trainCars;
    
    //declaring array for keeping track of players
    //leaving board to make player array to keep track of individual players
    //for deck 0 = blue, 1 = red, 2 = green, 3 = yellow, and 4 = black
    int[] playerHand = new int[5];
    
    //tokens for player's hand
    private int blueTrains, redTrains, greenTrains, yellowTrains, blackTrains;
    
    //intiailize player
    public Player(String color, String n){
        playerMarker = color;
        name = n;
        trainCars = 45;
        hand = new ArrayList<Card>();
        destCards = new ArrayList<DestinationCard>();
    }
    
    
    //adding to one card to hand used for move drawTrainCarCards
   public void drawTrainCard(Card c){
       hand.add(c);
   }

    //subtracking train cards for move claimRoute
   //not sure if I will implement loop here or in deck/card class
   public void subTrainCard(Card c){
       hand.remove(c);
   }
   
   //remove certain number of train cars for claimed route
   public void subTrainCars(int s){
       int temp = trainCars - s;
       trainCars = temp;
   }

    //getters
    
   //this will act at the player's color
    public String getPlayerMarker(){
        return playerMarker;
    }
    
    //Return for player's name
    public String getPlayerName(){
        return name;
    }
    
    //Return number of Trian cars the player has left
    public int getPlayerTrainCars(){
        return trainCars;
    }


    
}
